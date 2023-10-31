package interfaz;

import dominio.Contactos;
import dominio.Agenda;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Interfaz {
    private JFrame frame;
    private Agenda agenda;
    private JTextField searchField;
    private DefaultListModel<Contactos> contactoListModel;


    public Interfaz(Agenda agenda) {
        this.agenda = agenda;

        frame = new JFrame("Contactos");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 400);
        frame.setLayout(new GridBagLayout());

        GridBagConstraints gbc = new GridBagConstraints();

        searchField = new JTextField();
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        searchField.setBorder(BorderFactory.createTitledBorder("Buscador"));
        frame.add(searchField, gbc);

        contactoListModel = new DefaultListModel<>();
        JList<Contactos> contactoList = new JList<>(contactoListModel);
        JScrollPane contactoScrollPane = new JScrollPane(contactoList);
        TitledBorder contactoBorder = BorderFactory.createTitledBorder("Agenda");
        contactoScrollPane.setBorder(contactoBorder);
        gbc.gridx = 0;
        gbc.gridy = 1;
        gbc.weighty = 3.0;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(contactoScrollPane, gbc);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(0, 1));

        JButton agregarContactoButton = new JButton("Agregar Contacto");
        JButton salirButton = new JButton("Salir");

        buttonPanel.add(agregarContactoButton);
        buttonPanel.add(salirButton);
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.weighty = 0.5;
        gbc.fill = GridBagConstraints.BOTH;
        frame.add(buttonPanel, gbc);
        refreshLists();

        agregarContactoButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                showContactoDialog();
                refreshLists();
            }
        });

        searchField.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                filterLists(searchField.getText());
            }
        });

        salirButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(frame, "Saliendo del programa...");
                System.exit(0);
            }
        });

        contactoList.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) { // Doble-click
                    int selectedIndex = contactoList.getSelectedIndex();
                    if (selectedIndex != -1) {
                        int option = JOptionPane.showConfirmDialog(frame,
                                "Eliminar este Contacto?", "Confirmar Eliminación",
                                JOptionPane.YES_NO_OPTION);
                        if (option == JOptionPane.YES_OPTION) {
                            Contactos selectedContacto = contactoListModel.get(selectedIndex);
                            agenda.eliminarContacto(selectedContacto.getReferencia());
                            contactoListModel.removeElement(selectedContacto);
                        }
                    }
                    refreshLists();
                }
            }
        });

        frame.setVisible(true);
    }

    private void showContactoDialog() {
        String nombre = JOptionPane.showInputDialog(frame, "Ingrese el nombre:");
        String primerApellido = JOptionPane.showInputDialog(frame, "Ingrese el primer apellido:");
        String segundoApellido = JOptionPane.showInputDialog(frame, "Ingrese el segundo apellido:");
        String numeroTelefono = JOptionPane.showInputDialog(frame, "Ingrese el numero de Telefono (Sin +):");

        Contactos contacto = new Contactos(nombre, primerApellido, segundoApellido, numeroTelefono);
        agenda.agregarContacto(contacto);
        contactoListModel.addElement(contacto);
    }

    private void refreshLists() {
        contactoListModel.clear();

        for (Contactos contacto : agenda.getContactos()) {
            contactoListModel.addElement(contacto);
        }
    }

    private void filterLists(String searchTerm) {
        contactoListModel.clear();

        for (Contactos contacto : agenda.getContactos()) {
            if (contacto.matchesSearchTerm(searchTerm)) {
                contactoListModel.addElement(contacto);
            }
        }
    }


    public static void main(String[] args) {
        Agenda agenda = new Agenda();
        new Interfaz(agenda);
    }
}

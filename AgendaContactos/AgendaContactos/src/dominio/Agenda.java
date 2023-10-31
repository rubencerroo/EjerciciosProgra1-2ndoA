package dominio;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;


public class Agenda implements Serializable {
    private ArrayList<Contactos> contactos;


    public Agenda() {
        this.contactos = new ArrayList<>();
    }


    public void agregarContacto(Contactos contacto) {
        String referencia = UUID.randomUUID().toString();
        contacto.setReferencia(referencia);
        contactos.add(contacto);
        saveCatalogo();
    }

    public void eliminarContacto(String referencia) {
        contactos.removeIf(cont -> cont.getReferencia().equals(referencia));
        saveCatalogo();
    }


    public List<Contactos> getContactos() {
        return contactos;
    }


    private void saveCatalogo() {
        try (FileOutputStream fileOutputStream = new FileOutputStream("agenda.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(this);
            System.out.println("Agenda guardada con exito.");
        } catch (IOException e) {
            System.err.println("Error al guardar la Agenda.");
        }
    }
}

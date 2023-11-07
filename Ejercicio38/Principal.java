package Ejercicio38;

import java.util.Date;
import java.util.Calendar;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.swing.Timer;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal {

    public LocalDate getFecha() {
        Date date = new Date();
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
    }

    public LocalDate getFechaCaracas() {
        Date date = new Date();
        return date.toInstant().atZone(java.time.ZoneId.of("America/Caracas")).toLocalDate();
    }

    public int getAniosDescubtimientoAmerica() {
        Calendar date = Calendar.getInstance();
        return date.get(Calendar.YEAR) - 1492;
    }

    public LocalTime getHora() {
        Date date = new Date();
        return date.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalTime();
    }

    public LocalTime getHoraCaracas() {
        Date date = new Date();
        return date.toInstant().atZone(java.time.ZoneId.of("America/Caracas")).toLocalTime();
    }

    public int getDifCaracMad() {
        Date date = new Date();
        LocalDateTime currentTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("Europe/Madrid"));
        LocalDateTime caracasTime = LocalDateTime.ofInstant(date.toInstant(), ZoneId.of("America/Caracas"));
        int hourDifference = (currentTime.getHour() - caracasTime.getHour());
        return hourDifference;
    }

    public ZonedDateTime Luna() {
        LocalDateTime madridTime = LocalDateTime.of(1969, 7, 21, 3, 56);
        ZoneId madridZone = ZoneId.of("Europe/Madrid");
        ZonedDateTime moonLandingTime = madridTime.atZone(madridZone);
        return moonLandingTime;
    }

    public class Interfaz {

        private JFrame frame;
        private Principal principal;
        private JTextArea textArea;
        private Timer timer;

        public Interfaz(Principal principal) {
            this.principal = principal;

            frame = new JFrame("Fechas");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800, 400);
            frame.setLayout(new BorderLayout());

            JPanel panel = new JPanel();
            panel.setLayout(new GridLayout(1, 2));

            textArea = new JTextArea(10, 40);
            textArea.setEditable(false);

            JScrollPane scrollPane = new JScrollPane(textArea);
            panel.add(scrollPane);

            frame.add(panel, BorderLayout.CENTER);

            timer = new Timer(1000, new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    mostrarResultados(); // Update results every 1 second (1000 ms)
                }
            });

            timer.start(); // Start the timer

            frame.setVisible(true);
        }

        private void mostrarResultados() {
            StringBuilder resultText = new StringBuilder();

            resultText.append("Fecha actual: " + principal.getFecha() + "\n");
            resultText.append("Fecha en Caracas: " + principal.getFechaCaracas() + "\n");
            resultText.append("A\u00f1os desde el descubrimiento de America: "
                    + principal.getAniosDescubtimientoAmerica() + "\n");
            resultText.append("Hora actual: " + principal.getHora() + "\n");
            resultText.append("Hora en Caracas: " + principal.getHoraCaracas() + "\n");
            resultText.append("Diferencia de horas entre Caracas y Madrid: " + principal.getDifCaracMad() + " horas\n");
            resultText.append("Fecha de la Luna: " + principal.Luna() + "\n");

            textArea.setText(resultText.toString());
        }
    }

    public static void main(String[] args) {
        Principal principal = new Principal();
        Interfaz interfaz = principal.new Interfaz(principal);
    }
}
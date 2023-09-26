package dominio;
import java.util.ArrayList;

public class Comprobacion {
    public static void realizarComprobacion() {
        OficinaPadron padron = new OficinaPadron();
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for (Habitante habitante : habitantes) {
            System.out.println(habitante.getNombre() + " " + habitante.getApellido1() + " " + habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}
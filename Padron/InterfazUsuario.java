import java.util.ArrayList;
public class InterfazUsuario {
    public static void ejecutar(String instruccion) {
        OficinaPadron padron = new OficinaPadron();
        if (instruccion.equalsIgnoreCase("mostrar")) {
            mostrarOficinaPadron(padron);
        } else {
            System.out.println("Error en la instrucción");
        }
    }
    private static void mostrarOficinaPadron(OficinaPadron padron) {
        ArrayList <Habitante> habitantes = padron.getHabitantesPadron();
        for (Habitante habitante: habitantes) {
            System.out.println(habitante.getNombre() + " " + habitante.getApellido1() + " " + habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es" + padron.calcularNumeroHabitantes());
    }
}
import Padron.Habitante;

public class Comprobacion {
    public static void realizarComprobacion() {
        Habitante habitante1 = new Habitante("Juan", "Torres", "Sanz");
        System.out.println(habitante1.getNombre() + " " + habitante1.getApellido1() + " " + habitante1.getApellido2());
    }
    public static void main(String[] args) {
        Comprobacion.realizarComprobacion();
    }
}

package dominio;

public class Concesionario {
    public static double mostrarYCalcularPrecio(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.marca);
        System.out.println("Modelo: " + vehiculo.modelo);
        System.out.println("Precio Final: " + vehiculo.calcularPrecioFinal());
        System.out.println("-----------------------------");

        return vehiculo.calcularPrecioFinal();
    }
}
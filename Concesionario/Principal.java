package Concesionario;

public class Principal {
    public static void main(String[] args) {
        VehiculoTurismo turismo1 = new VehiculoTurismo("MarcaTurismo1", "ModeloTurismo1", 10000, 5);
        VehiculoTurismo turismo2 = new VehiculoTurismo("MarcaTurismo2", "ModeloTurismo2", 10000, 7);
        Furgoneta furgoneta = new Furgoneta("MarcaFurgoneta", "ModeloFurgoneta", 20000, 8);

        double precioTotal = 0;
        precioTotal += Concesionario.mostrarYCalcularPrecio(turismo1);
        precioTotal += Concesionario.mostrarYCalcularPrecio(turismo2);
        precioTotal += Concesionario.mostrarYCalcularPrecio(furgoneta);

        System.out.println("Precio Total: " + precioTotal);
    }
}

abstract class Vehiculo {
    protected String marca;
    protected String modelo;
    protected double precioBase;

    public Vehiculo(String marca, String modelo, double precioBase) {
        this.marca = marca;
        this.modelo = modelo;
        this.precioBase = precioBase;
    }

    public abstract double calcularPrecioFinal();
}

class VehiculoTurismo extends Vehiculo {
    private int numeroPlazas;

    public VehiculoTurismo(String marca, String modelo, double precioBase, int numeroPlazas) {
        super(marca, modelo, precioBase);
        this.numeroPlazas = numeroPlazas;
    }

    @Override
    public double calcularPrecioFinal() {
        if (numeroPlazas <= 5) {
            return precioBase;
        } else {
            return precioBase + (numeroPlazas - 5) * 0.1 * precioBase;
        }
    }
}

class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(String marca, String modelo, double precioBase, double capacidadM3) {
        super(marca, modelo, precioBase);
        this.capacidadM3 = capacidadM3;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 0.5 * Math.cbrt(capacidadM3);
    }
}

class Concesionario {
    public static double mostrarYCalcularPrecio(Vehiculo vehiculo) {
        System.out.println("Marca: " + vehiculo.marca);
        System.out.println("Modelo: " + vehiculo.modelo);
        System.out.println("Precio Final: " + vehiculo.calcularPrecioFinal());
        System.out.println("-----------------------------");

        return vehiculo.calcularPrecioFinal();
    }
}

package main;

import dominio.*;

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
package Interfaz;

import dominio.*;

import java.util.ArrayList;
import java.util.Scanner;

public class InterfazUsuario {
    
    public static void ejecutar(String[] instruccion) {
        OficinaPadron padron = new OficinaPadron();
        if (instruccion[0].equalsIgnoreCase("mostrar") && instruccion.length == 1) {
            mostrarOficinaPadron(padron);
        } else if (instruccion[0].equalsIgnoreCase("anadir") && instruccion.length == 4) {
            padron.annadir(new Habitante(instruccion[1], instruccion[2], instruccion[3]));
            System.out.println("Habitante añadido correctamente");
        } else {
            System.out.println("Error en la instrucción");
        } 
    }

    private static void mostrarOficinaPadron(OficinaPadron padron) {
        ArrayList<Habitante> habitantes = padron.getHabitantesPadron();
        for (Habitante habitante : habitantes) {
            System.out.println(habitante.getNombre() + " " + habitante.getApellido1() + " " + habitante.getApellido2());
        }
        System.out.println("El numero total de habitantes es " + padron.calcularNumeroHabitantes());
    }
    
    public static void interfaz() {
        Scanner sc = new Scanner(System.in);
        OficinaPadron padron = new OficinaPadron();
        String nombre;
        String apellido1;
        String apellido2;
        boolean exit = false;

        while (!exit) {
            System.out.println("+----------------+");
            System.out.println("| 1. Mostrar     |");
            System.out.println("| 2. A\u00f1adir      |");
            System.out.println("| 3. Eliminar    |");
            System.out.println("| 4. Salir       |");
            System.out.println("+----------------+");
            System.out.println("Elija opci\u00f3n 1 a 4: ");

            int opcion1 = sc.nextInt();
            sc.nextLine(); 

            if (opcion1 == 1) {
                mostrarOficinaPadron(padron); 
            } else if (opcion1 == 2) {
                System.out.println("Ingrese el Nombre: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el primer Apellido: ");
                apellido1 = sc.nextLine();
                System.out.println("Ingrese el segundo Apellido: ");
                apellido2 = sc.nextLine();

                padron.annadir(new Habitante(nombre, apellido1, apellido2));
                System.out.println("Habitante a\u00f1adido correctamente");
            } else if (opcion1 == 3) {
                System.out.println("Ingrese el nombre del habitante a eliminar: ");
                nombre = sc.nextLine();
                System.out.println("Ingrese el primer Apellido");
                apellido1 = sc.nextLine();
                System.out.println("Ingrese el segundo Apellido: ");
                apellido2 = sc.nextLine();
                padron.eliminar(new Habitante(nombre, apellido1, apellido2));
                System.out.println("Habitante eliminado");                
            } else if (opcion1 == 4) {
                System.out.println("Saliendo...");
                exit = true;
            }
        }
    }
}
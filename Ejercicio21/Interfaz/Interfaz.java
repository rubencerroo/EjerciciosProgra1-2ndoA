package Interfaz;

import dominio.*;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Interfaz {
    private List<Provincia> provincias;
    private Scanner scanner; // Single Scanner for input

    public Interfaz() {
        provincias = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    @SuppressWarnings("unchecked")
    public void leer() {
        try {
            FileInputStream fis = new FileInputStream("provincias.dat");
            ObjectInputStream ois = new ObjectInputStream(fis);
            provincias = (List<Provincia>) ois.readObject();
            ois.close();
            System.out.println("Datos cargados con éxito.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudieron cargar los datos: " + e.getMessage());
        }
    }

    public void agregarProvincia() {
        Provincia provincia = new Provincia();
        System.out.print("Nombre de la provincia: ");
        provincia.setNombre(scanner.nextLine());
        provincias.add(provincia);
        System.out.println("Provincia agregada.");
    }

    public void agregarMunicipio() {
        System.out.println("Seleccione la provincia (índice):");
        listarProvincias();
        int provinciaIndex = getValidIndex(provincias.size());

        if (provinciaIndex != -1) {
            Municipio municipio = new Municipio();
            System.out.print("Nombre del municipio: ");
            municipio.setNombre(scanner.nextLine());
            provincias.get(provinciaIndex).agregarMunicipio(municipio);
            System.out.println("Municipio agregado a la provincia.");
        } else {
            System.out.println("Indice de provincia inválido.");
        }
    }

    public void agregarLocalidad() {
        System.out.println("Seleccione la provincia (indice):");
        listarProvincias();
        int provinciaIndex = getValidIndex(provincias.size());

        if (provinciaIndex != -1) {
            System.out.println("Seleccione el municipio (indice):");
            listarMunicipios(provinciaIndex);
            int municipioIndex = getValidIndex(provincias.get(provinciaIndex).getMunicipios().size());

            if (municipioIndex != -1) {
                Localidad localidad = new Localidad();
                System.out.print("Nombre de la localidad: ");
                localidad.setNombre(scanner.nextLine());
                System.out.print("Numero de habitantes: ");
                localidad.setNumeroDeHabitantes(scanner.nextInt());
                scanner.nextLine(); // Consume the newline character

                provincias.get(provinciaIndex).getMunicipios().get(municipioIndex).agregarLocalidad(localidad);
                System.out.println("Localidad agregada al municipio.");
            } else {
                System.out.println("Indice de municipio invalido.");
            }
        } else {
            System.out.println("Indice de provincia invalido.");
        }
    }

    public void listar() {
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println("Provincia " + i);
            for (Municipio municipio : provincias.get(i).getMunicipios()) {
                System.out.println("  Municipio: " + municipio);
                for (Localidad localidad : municipio.getLocalidades()) {
                    System.out.println("    Localidad: " + localidad);
                }
            }
        }
    }

    public void guardar() {
        try {
            FileOutputStream fos = new FileOutputStream("provincias.dat");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(provincias);
            oos.close();
            System.out.println("Datos guardados con exito.");
        } catch (IOException e) {
            System.out.println("No se pudieron guardar los datos: " + e.getMessage());
        }
    }

    public void listarProvincias() {
        for (int i = 0; i < provincias.size(); i++) {
            System.out.println(i + ": " + provincias.get(i));
        }
    }

    public void listarMunicipios(int provinciaIndex) {
        List<Municipio> municipios = provincias.get(provinciaIndex).getMunicipios();
        for (int i = 0; i < municipios.size(); i++) {
            System.out.println(i + ": " + municipios.get(i));
        }
    }

    public void mostrarMenu() {
        System.out.println("Menu:");
        System.out.println("1. Leer");
        System.out.println("2. Agregar Provincia");
        System.out.println("3. Agregar Municipio");
        System.out.println("4. Agregar Localidad");
        System.out.println("5. Listar");
        System.out.println("6. Guardar");
        System.out.println("7. Salir");
    }

    private int getValidIndex(int maxIndex) {
        while (true) {
            if (scanner.hasNextInt()) {
                int index = scanner.nextInt();
                if (index >= 0 && index < maxIndex) {
                    scanner.nextLine(); // Consume the newline character
                    return index;
                } else {
                    System.out.println("Indice invalido. Ingrese un valor dentro del rango valido.");
                }
            } else {
                System.out.println("Indice no es un numero valido. Ingrese un valor dentro del rango valido.");
                scanner.nextLine(); // Consume the invalid input.
            }
        }
    }

    private void closeResources() {
        scanner.close();
    }

    public static void main(String[] args) {
        Interfaz interfaz = new Interfaz();
        int opcion;
        boolean running = true;

        interfaz.leer();

        while (running) {
            interfaz.mostrarMenu();
            System.out.print("Seleccione una opcion (1-7): ");

            if (interfaz.scanner.hasNextInt()) {
                opcion = interfaz.scanner.nextInt();

                switch (opcion) {
                    case 1:
                        interfaz.leer();
                        break;
                    case 2:
                        interfaz.agregarProvincia();
                        break;
                    case 3:
                        interfaz.agregarMunicipio();
                        break;
                    case 4:
                        interfaz.agregarLocalidad();
                        break;
                    case 5:
                        interfaz.listar();
                        break;
                    case 6:
                        interfaz.guardar();
                        break;
                    case 7:
                        running = false;
                        break;
                    default:
                        System.out.println("Opcion no valida. Seleccione un numero del 1 al 7.");
                        break;
                }
            } else {
                System.out.println("Opcion no valida. Seleccione un numero del 1 al 7.");
                interfaz.scanner.nextLine(); // Consume the invalid input.
            }
        }

        interfaz.closeResources();
    }
}

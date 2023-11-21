package aplicacion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import dominio.*;

public class Principal {
    
    private static Scanner sc = new Scanner(System.in);
    private static List<BandaMusica> bandas = new ArrayList<>();

    public static void main(String[] args) {
        cargarDatos();
        boolean exit = false;
        while (!exit) {
            mostrarMenu();
            try {
                int opcion = sc.nextInt();
                sc.nextLine(); 

                switch (opcion) {
                    case 1:
                        mostrarInformacion();
                        break;
                    case 2:
                        añadirElemento();
                        break;
                    case 3:
                        eliminarActuacion();
                        break;
                    case 4:
                        exit = true;
                        guardarDatos();
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("Opción no válida. Intente de nuevo.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine(); 
            }
        }

        sc.close();
    }

    private static void mostrarMenu() {
        System.out.println("+----------------+");
        System.out.println("| 1. Mostrar     |");
        System.out.println("| 2. Añadir      |");
        System.out.println("| 3. Eliminar    |");
        System.out.println("| 4. Salir       |");
        System.out.println("+----------------+");
        System.out.println("Elija opción 1 a 4: ");
    }

    private static void mostrarInformacion() {
        System.out.println("Lista de bandas y actuaciones:");
        for (BandaMusica banda : bandas) {
            System.out.println("- " + banda.getNombre());
            List<Actuacion> actuaciones = banda.getActuaciones();
            for (Actuacion actuacion : actuaciones) {
                System.out.println("  Fecha: " + actuacion.getFecha());
                List<Participante> participantes = actuacion.getParticipantes();
                for (Participante participante : participantes) {
                    System.out.println("    " + participante.toString());
                }
            }
        }
    }

    private static void añadirElemento() {
        System.out.println("¿Qué desea añadir?");
        System.out.println("1. Actuación");
        System.out.println("2. Banda");
        try {
            int opcion = sc.nextInt();
            sc.nextLine();

            if (opcion == 1) {
                añadirActuacion();
            } else if (opcion == 2) {
                añadirBanda();
            } else {
                System.out.println("Opción no válida.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Error: Ingrese un número válido.");
            sc.nextLine(); 
        }
    }

    private static void añadirActuacion() {
        if (bandas.isEmpty()) {
            System.out.println("No hay bandas disponibles. Por favor, añada una banda primero.");
            añadirBanda();
        } else {
            System.out.println("Elija la banda a la que desea añadir la actuación:");
            int index = 1;
            for (BandaMusica banda : bandas) {
                System.out.println(index + ". " + banda.getNombre());
                index++;
            }
            try {
                int seleccionBanda = sc.nextInt();
                sc.nextLine();  

                if (seleccionBanda >= 1 && seleccionBanda <= bandas.size()) {
                    BandaMusica bandaSeleccionada = bandas.get(seleccionBanda - 1);
                    añadirActuacionBanda(bandaSeleccionada);
                } else {
                    System.out.println("Selección de banda no válida.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Error: Ingrese un número válido.");
                sc.nextLine(); 
            }
        }
    }

    private static void añadirActuacionBanda(BandaMusica banda) {
        try {
            System.out.println("Ingrese la fecha de la actuación (Formato: YYYY-MM-DD):");
            String fechaString = sc.nextLine();
            LocalDate fecha = LocalDate.parse(fechaString);

            Actuacion actuacion = new Actuacion(fecha);

            System.out.println("Ingrese el nombre del director:");
            String nombreDirector = sc.nextLine();
            Director director = new Director(nombreDirector);
            actuacion.annadirParticipante(director);

            System.out.println("Ingrese el nombre del músico socio:");
            String nombreMusicoSocio = sc.nextLine();
            System.out.println("Ingrese el instrumento del músico socio:");
            String instrumentoMusicoSocio = sc.nextLine();
            System.out.println("Ingrese el número de socio del músico socio:");
            int numeroSocio = sc.nextInt();
            sc.nextLine(); 
            MusicoSocio musicoSocio = new MusicoSocio(nombreMusicoSocio, instrumentoMusicoSocio, numeroSocio);
            actuacion.annadirParticipante(musicoSocio);

            System.out.println("Ingrese el nombre del músico de refuerzo:");
            String nombreMusicoRefuerzo = sc.nextLine();
            System.out.println("Ingrese el instrumento del músico de refuerzo:");
            String instrumentoMusicoRefuerzo = sc.nextLine();
            System.out.println("Ingrese la cantidad pagada al músico de refuerzo (en euros):");
            BigDecimal cantidad = sc.nextBigDecimal();
            sc.nextLine(); 
            MusicoRefuerzo musicoRefuerzo = new MusicoRefuerzo(nombreMusicoRefuerzo, instrumentoMusicoRefuerzo, cantidad);
            actuacion.annadirParticipante(musicoRefuerzo);

            banda.annadirActuacion(actuacion);
            System.out.println("Actuación añadida a la banda '" + banda.getNombre() + "' con éxito.");
            guardarDatos();
        } catch (Exception e) {
            System.out.println("Error: Entrada inválida. Asegúrese de seguir el formato correcto.");
            sc.nextLine(); 
        }
    }

    private static void añadirBanda() {
        System.out.println("Ingrese el nombre de la nueva banda:");
        String nombreBanda = sc.nextLine();
        BandaMusica banda = new BandaMusica(nombreBanda);
        bandas.add(banda);
        System.out.println("Banda añadida con éxito.");
        guardarDatos();
    }

    private static void eliminarActuacion() {
        if (bandas.isEmpty()) {
            System.out.println("No hay bandas disponibles. No se pueden eliminar actuaciones.");
        } else {
            try {
                System.out.println("Ingrese la fecha de la actuación a eliminar (Formato: YYYY-MM-DD):");
                String fechaString = sc.nextLine();
                LocalDate fecha = LocalDate.parse(fechaString);

                System.out.println("Elija la banda de la que desea eliminar la actuación:");
                int index = 1;
                for (BandaMusica banda : bandas) {
                    System.out.println(index + ". " + banda.getNombre());
                    index++;
                }
                int seleccionBanda = sc.nextInt();
                sc.nextLine();

                if (seleccionBanda >= 1 && seleccionBanda <= bandas.size()) {
                    BandaMusica bandaSeleccionada = bandas.get(seleccionBanda - 1);
                    if (bandaSeleccionada.eliminarActuacion(fecha)) {
                        System.out.println(
                                "Actuación eliminada con éxito de la banda '" + bandaSeleccionada.getNombre() + "'.");
                                guardarDatos();
                    } else {
                        System.out.println("No se encontró una actuación con la fecha especificada en la banda '"
                                + bandaSeleccionada.getNombre() + "'.");
                    }
                } else {
                    System.out.println("Selección de banda no válida.");
                }
            } catch (Exception e) {
                System.out.println("Error: Entrada inválida. Asegúrese de seguir el formato correcto.");
                sc.nextLine();
            }
        }
    }
    private static final String NOMBRE_ARCHIVO = "Bandas.ser";

    private static void guardarDatos() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(NOMBRE_ARCHIVO))) {
            oos.writeObject(bandas);
            System.out.println("Datos guardados con éxito.");
        } catch (IOException e) {
            System.out.println("Error al guardar datos: " + e.getMessage());
        }
    }

    private static void cargarDatos() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(NOMBRE_ARCHIVO))) {
            Object obj = ois.readObject();
            if (obj instanceof List<?>) {
                bandas = (List<BandaMusica>) obj;
                System.out.println("Datos cargados con éxito.");
            } else {
                System.out.println("Error: El archivo no contiene una lista de bandas.");
            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("No se pudo cargar datos existentes: " + e.getMessage());
        }
    }
}

package main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import dominio.Agenda;
import interfaz.Interfaz;


public class Principal {

    public static void main(String[] args) {
        Agenda agenda = cargarAgenda();
        new Interfaz(agenda);
        guardarAgenda(agenda);
    }


    private static Agenda cargarAgenda() {
        Agenda agenda = null;
        try (FileInputStream fileInputStream = new FileInputStream("agenda.ser");
             ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream)) {
            agenda = (Agenda) objectInputStream.readObject();
            System.out.println("Agenda cargada exitosamente.");
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("Error al cargar la agenda. Se creara una agenda vacía.");
        }
        return agenda != null ? agenda : new Agenda();
    }


    private static void guardarAgenda(Agenda agenda) {
        try (FileOutputStream fileOutputStream = new FileOutputStream("agenda.ser");
             ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)) {
            objectOutputStream.writeObject(agenda);
            System.out.println("Agenda guardada exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al guardar la agenda.");
        }
    }
}

package dominio;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.*;

public class OficinaPadron implements Serializable{
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);
        volcarContactos();
    }

    public void eliminar(Habitante habitanteAEliminar) {
        Iterator<Habitante> iterator = habitantesPadron.iterator();
        while (iterator.hasNext()) {
            Habitante habitante = iterator.next();
            if (habitante.getNombre().equals(habitanteAEliminar.getNombre()) &&
                    habitante.getApellido1().equals(habitanteAEliminar.getApellido1()) &&
                    habitante.getApellido2().equals(habitanteAEliminar.getApellido2())) {
                iterator.remove();
            }
        }
        volcarContactos();
    }
    public ArrayList<Habitante> getHabitantesPadron() {
        return habitantesPadron;
    }

    public int calcularNumeroHabitantes() {
        int suma = 0;
        for (Habitante habitante : habitantesPadron) {
            suma++;
        }
        return suma;
    }

    private void cargarHabitantes() {
        try {
            File fichero = new File("padron.dat");
            if (fichero.exists()) {
                FileInputStream fileInputStream = new FileInputStream(fichero);
                ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

                Object obj = objectInputStream.readObject();
                if (obj instanceof ArrayList<?>) {
                    ArrayList<?> lista = (ArrayList<?>) obj;
                    if (!lista.isEmpty() && lista.get(0) instanceof Habitante) {
                        habitantesPadron = (ArrayList<Habitante>) obj;
                    } else {
                        System.out.println("El archivo no contiene una lista de Habitantes.");
                    }
                } else {
                    System.out.println("El archivo no contiene una lista.");
                }

                objectInputStream.close();
                fileInputStream.close();
            }
        } catch (IOException | ClassNotFoundException ex) {
            System.out.println("No hay habitantes inscritos");
        }
    }


    public OficinaPadron() {
        cargarHabitantes();
    }

    public void volcarContactos() {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream("padron.dat");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            objectOutputStream.writeObject(habitantesPadron);

            objectOutputStream.close();
            fileOutputStream.close();
        } catch (IOException ex) {
            System.err.println(ex);
        }
    }
}
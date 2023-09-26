import java.io.File;
import java.io.IOException;
import java.util.*;

public class OficinaPadron {
    private ArrayList<Habitante> habitantesPadron = new ArrayList<>();

    public void annadir(Habitante habitante) {
        habitantesPadron.add(habitante);
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
            File fichero = new File("padron.csv");
            fichero.createNewFile();
            Scanner sc = new Scanner(fichero);
            sc.useDelimiter(",|\n");
            while (sc.hasNext()) {
                Habitante habitante = new Habitante(sc.next(), sc.next(), sc.next());
                habitantesPadron.add(habitante);
            }
            sc.close();
        } catch (IOException ex) {
            System.out.println("No hay habitantes inscritos");
        }
    }

    public OficinaPadron() {
        cargarHabitantes();
    }
}
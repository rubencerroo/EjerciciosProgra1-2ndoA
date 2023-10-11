package Ejercicio21.dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Localidad> localidades = new ArrayList<>();

    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return totalHabitantes;
    }

    @Override
    public String toString() {
        return "Municipio [localidades=" + localidades + "]";
    }
}

package Ejercicio21.dominio;

import java.util.ArrayList;
import java.util.List;

public class Municipio {
    private List<Localidad> localidades = new ArrayList<>();

    
    /** 
     * @param localidad
     */
    public void agregarLocalidad(Localidad localidad) {
        localidades.add(localidad);
    }

    /**
     * Calculates the total number of inhabitants.
     *
     * @return the total number of inhabitants.
     */
    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Localidad localidad : localidades) {
            totalHabitantes += localidad.getNumeroDeHabitantes();
        }
        return totalHabitantes;
    }

    /**
     * Converts the object to a string representation.
     *
     * @return  a string representing the object
     */
    @Override
    public String toString() {
        return "Municipio [localidades=" + localidades + "]";
    }
}

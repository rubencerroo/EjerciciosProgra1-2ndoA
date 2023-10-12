package Ejercicio21.dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private List<Municipio> municipios = new ArrayList<>();

    
    /** 
     * @param municipio
     */
    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    /**
     * Counts the total number of inhabitants in all the municipalities.
     *
     * @return the total number of inhabitants
     */
    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return totalHabitantes;
    }

    /**
     * Returns a string representation of the Provincia object.
     *
     * @return         	a string representation of the Provincia object
     */
    @Override
    public String toString() {
        return "Provincia [municipios=" + municipios + "]";
    }
}

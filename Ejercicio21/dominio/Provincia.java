package Ejercicio21.dominio;

import java.util.ArrayList;
import java.util.List;

public class Provincia {
    private List<Municipio> municipios = new ArrayList<>();

    public void agregarMunicipio(Municipio municipio) {
        municipios.add(municipio);
    }

    public int contarHabitantes() {
        int totalHabitantes = 0;
        for (Municipio municipio : municipios) {
            totalHabitantes += municipio.contarHabitantes();
        }
        return totalHabitantes;
    }

    @Override
    public String toString() {
        return "Provincia [municipios=" + municipios + "]";
    }
}

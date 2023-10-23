package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Provincia implements Serializable {
    private static final long serialVersionUID = 2L;
    private String nombre;
    private List<Municipio> municipios = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
        return "Provincia [nombre=" + nombre + ", municipios=" + municipios + "]";
    }

    public List<Municipio> getMunicipios() {
        return municipios;
    }
}

package dominio;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Municipio implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private List<Localidad> localidades = new ArrayList<>();

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

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
        return "Municipio [nombre=" + nombre + ", localidades=" + localidades + "]";
    }

    public List<Localidad> getLocalidades() {
        return localidades;
    }
}
package dominio;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BandaMusica implements Serializable {
    private static final long serialVersionUID = 1L;
    private String nombre;
    private List<Actuacion> actuaciones;

    public BandaMusica(String nombre) {
        this.nombre = nombre;
        this.actuaciones = new ArrayList<>();
    }

    public void annadirActuacion(Actuacion actuacion) {
        this.actuaciones.add(actuacion);
    }

    public List<Actuacion> getActuaciones() {
        return actuaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean eliminarActuacion(LocalDate fecha) {
        Iterator<Actuacion> iterator = actuaciones.iterator();
        while (iterator.hasNext()) {
            Actuacion actuacion = iterator.next();
            if (actuacion.getFecha().equals(fecha)) {
                iterator.remove();
                System.out.println("Actuación eliminada con éxito.");
                return true; 
            }
        }

        System.out.println("No se encontró una actuación con la fecha especificada.");
        return false; 
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("BANDA DE MÚSICA " + nombre + "\n\n");

        for (Actuacion actuacion : actuaciones) {
            sb.append(actuacion.toString()).append("\n\n");
        }

        return sb.toString();
    }
}

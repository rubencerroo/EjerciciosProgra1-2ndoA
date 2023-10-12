package Ejercicio21.dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    
    /** 
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Sets the nombre property of the object.
     *
     * @param  nombre	the new value for the nombre property
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Retrieves the number of inhabitants.
     *
     * @return the number of inhabitants
     */
    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    /**
     * Sets the number of inhabitants.
     *
     * @param  numeroDeHabitantes  the new number of inhabitants
     */
    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    /**
     * Returns a string representation of the Localidad object.
     *
     * @return         	a string representation of the Localidad object
     */
    @Override
    public String toString() {
        return "Localidad [nombre=" + nombre + ", numeroDeHabitantes=" + numeroDeHabitantes + "]";
    }
}

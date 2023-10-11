package Ejercicio21.dominio;

public class Localidad {
    private String nombre;
    private int numeroDeHabitantes;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDeHabitantes() {
        return numeroDeHabitantes;
    }

    public void setNumeroDeHabitantes(int numeroDeHabitantes) {
        this.numeroDeHabitantes = numeroDeHabitantes;
    }

    @Override
    public String toString() {
        return "Localidad [nombre=" + nombre + ", numeroDeHabitantes=" + numeroDeHabitantes + "]";
    }
}

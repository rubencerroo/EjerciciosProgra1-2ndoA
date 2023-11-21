package dominio;

public class Participante {
    private String nombre;

    public Participante(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
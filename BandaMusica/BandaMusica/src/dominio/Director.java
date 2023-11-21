package dominio;

public class Director extends Participante {
    public Director(String nombre) {
        super(nombre);
    }

    @Override
    public String toString() {
        return super.toString() + ", director";
    }
}
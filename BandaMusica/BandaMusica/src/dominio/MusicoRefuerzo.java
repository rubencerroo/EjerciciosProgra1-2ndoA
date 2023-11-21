package dominio;

import java.math.BigDecimal;

public class MusicoRefuerzo extends Musico {
    private BigDecimal cantidad;

    public MusicoRefuerzo(String nombre, String instrumento, BigDecimal cantidad) {
        super(nombre, instrumento);
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return super.toString() + ", " + cantidad + " €";
    }
}
package dominio;

public class Furgoneta extends Vehiculo {
    private double capacidadM3;

    public Furgoneta(String marca, String modelo, double precioBase, double capacidadM3) {
        super(marca, modelo, precioBase);
        this.capacidadM3 = capacidadM3;
    }

    @Override
    public double calcularPrecioFinal() {
        return precioBase * 0.5 * Math.cbrt(capacidadM3);
    }
}
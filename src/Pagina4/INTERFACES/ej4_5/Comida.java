package Pagina4.INTERFACES.ej4_5;

public class Comida implements Imponible {
    private double calorias;

    public Comida(double calorias) {
        this.calorias = calorias;
    }
    @Override
    public double calcularImpuestos() {
        return impuestos;
    }
}

package Pagina4.INTERFACES.ej4_5;

public interface Imponible {
    double impuestos = 0.06;

    double getPrecio();

    public default double calcularImpuestos() {
        return impuestos;
    }
}

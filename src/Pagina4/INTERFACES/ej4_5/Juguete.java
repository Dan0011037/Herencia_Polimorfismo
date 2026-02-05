package Pagina4.INTERFACES.ej4_5;

public class Juguete implements Imponible{
    private int edadMinima;

    public Juguete(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    @Override
    public double calcularImpuestos() {
        return impuestos;
    }
}

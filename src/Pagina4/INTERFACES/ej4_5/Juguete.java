package Pagina4.INTERFACES.ej4_5;

public class Juguete extends Bienes implements Imponible{
    private int edadMinima;

    public Juguete(int edadMinima, String descripcion, double precio) {
        super(descripcion, precio);
        this.edadMinima = edadMinima;
    }

    public double calcularImpuestos() {
        return getPrecio() + (impuestos * getPrecio());
    }

    @Override
    public String toString() {
        return ("edad: " + edadMinima + " | descripcion: " + getDescripcion());
    }
}

package Pagina4.INTERFACES.ej4_5;

public class Libro extends Bienes implements Imponible{
    private String autor;

    public Libro(String autor, String descripcion, double precio) {
        super(descripcion, precio);
        this.autor = autor;
    }

    public double calcularImpuestos() {
        return getPrecio()+(impuestos * getPrecio());
    }

    @Override
    public String toString(){
        return ("autor: " + autor + " | descripcion: " + getDescripcion());
    }
}

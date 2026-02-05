package Pagina4.INTERFACES.ej4_5;

public class Libro implements Imponible{
    private String autor;

    public Libro(String autor) {
        this.autor = autor;
    }

    @Override
    public double calcularImpuestos() {
        return impuestos;
    }
}

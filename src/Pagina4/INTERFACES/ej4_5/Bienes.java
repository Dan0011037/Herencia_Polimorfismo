package Pagina4.INTERFACES.ej4_5;

public class Bienes implements Imponible{
    private String descripcion;
    private double precio;

    public Bienes(String descripcion, double precio) {
        this.descripcion = descripcion;
        this.precio = precio;
    }

    @Override
    public double getPrecio(){
        return this.precio;
    }
    public String getDescripcion(){
        return this.descripcion;
    }
}

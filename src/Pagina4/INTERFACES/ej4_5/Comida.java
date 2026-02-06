package Pagina4.INTERFACES.ej4_5;

public class Comida extends Bienes{
    private double calorias;

    public Comida(double calorias, String descripcion, double precio) {
        super(descripcion, precio);
        this.calorias = calorias;
    }
}

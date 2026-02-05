package Pagina3.EJ4;

public class Rectangulo extends Forma{
    private double longitud;
    private double ancho;

    public Rectangulo(String nombre, double longitud, double ancho) {
        super(nombre);
        this.longitud = longitud;
        this.ancho = ancho;
    }

    double area;
    public double area(){
        return (longitud * ancho);
    }
}

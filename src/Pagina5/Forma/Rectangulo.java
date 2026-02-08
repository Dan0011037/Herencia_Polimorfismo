package Pagina5.Forma;

public class Rectangulo extends Forma{

    private double ancho;
    private double alto;

    public Rectangulo(int numLados, double ancho, double alto) {
        super(numLados);
        this.ancho=ancho;
        this.alto=alto;
    }

    @Override
    public double getArea() {
        return ( ancho * alto);
    }

    @Override
    public double getPerimeter() {
        return (2 * (ancho + alto));
    }
}

package Pagina5.Forma;

public class Triangulo extends Forma{
    private double ancho;
    private double alto;

    public Triangulo(int numLados, double ancho, double alto) {
        super(numLados);
        this.ancho=ancho;
        this.alto= alto;
    }

    @Override
    public double getArea() {
         return ((alto*ancho)/2);
    }

    @Override
    public double getPerimeter() {
        return (ancho + ancho + ancho);
    }
}

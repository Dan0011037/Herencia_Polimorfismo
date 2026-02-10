package Pagina5.Forma;

public class Rectangulo extends Forma implements Redimensionable, Comparable<Rectangulo>{
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

    @Override
    public void redimensionar(int x) {
        this.ancho = this.ancho * x;
        this.alto = this.alto * x;
    }

    @Override
    public int compareTo(Rectangulo o) {
        if (this.getArea() > o.getArea()){
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;
        }else {
            return 0;
        }
    }
}

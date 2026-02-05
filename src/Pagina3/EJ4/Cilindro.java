package Pagina3.EJ4;

public class Cilindro extends Forma {
    private double radio;
    private double altura;

    public Cilindro(String nombre, double radio, double altura) {
        super(nombre);
        this.radio = radio;
        this.altura = altura;
    }

    double area;

    public double area() {
        return (Math.PI * (radio * radio) * altura);
    }
}



package Pagina3.EJ4;

public class Esfera extends Forma{
    private double radio;

    public Esfera(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }

    double area;
    public double area(){
        return (getRadio()*getRadio()) * Math.PI* 4;
    }


}

package Pagina1.EJ13;

public class Circulo {
    double radio;

    public Circulo(double radio) {
        if (radio < 0){
            this.radio = 0;
        }else {
            this.radio = radio;
        }
    }

    public double getRadio() {
        return radio;
    }

    double area;
    public double getArea(){
        return radio * radio * Math.PI;
    }

    @Override
    public String toString(){
        return "Pagina1.EJ13.Circulo: (radio= " + radio + ", area= " + getArea() + ")";
    }
}

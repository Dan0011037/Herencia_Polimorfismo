package Pagina1.EJ13;

public class Cilindro extends Circulo {
    double altura;

    public Cilindro(double radio, double altura) {
        super(radio);
        this.altura = altura;
        if (altura < 0){
            altura = 0;
        }
    }
    public double getAltura() {
        return altura;
    }

    double volumen;
    public double getVolumen(){
        return getArea() * altura;
    }

    @Override
    public String toString(){
        return "Pagina1.EJ13.Cilindro: (altura= " + altura + ", radio= " + radio + ", volumen= " + getVolumen() + ")";
    }
}

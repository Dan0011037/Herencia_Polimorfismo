package Pagina4.INTERFACES.ejemplos;

public class Madera extends Cubo implements Incinerable{
    public Madera(String nombre) {
        super(nombre);
    }

    @Override
    public void incinerar() {
        System.out.println("fuegooooo!!!");
    }
}
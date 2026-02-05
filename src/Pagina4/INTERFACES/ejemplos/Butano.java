package Pagina4.INTERFACES.ejemplos;

public class Butano extends Cubo implements Incinerable,Explotable{
    public Butano(String nombre) {
        super(nombre);
    }

    @Override
    public void explotar() {
        System.out.println("Bataboooo!!!");
    }

    @Override
    public void incinerar() {
        System.out.println("Fuegoonnnn!!!");
    }
}
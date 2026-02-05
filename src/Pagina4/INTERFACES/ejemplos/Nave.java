package Pagina4.INTERFACES.ejemplos;

public class Nave implements Explotable{
    String nombre;
    @Override
    public void explotar() {
        System.out.println("Exxxxxploooosiooooon!!!!");
    }
}
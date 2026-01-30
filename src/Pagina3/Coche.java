package Pagina3;

public class Coche {
    private String modelo;
    private boolean motor = true;
    private int ruedas = 4;
    private int cilindros;

    public Coche(String modelo, int cilindros) {
        this.modelo = modelo;
        this.cilindros = cilindros;
    }

    public void arrancar(){
        System.out.println("El coche arranca...");
    }
    public void acelerar(){
        System.out.println("El coche acelera!");
    }
    public void frenar(){
        System.out.println("El coche frena!");
    }

}


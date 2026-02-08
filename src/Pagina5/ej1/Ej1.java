package Pagina5.ej1;

public abstract class Ej1 {
    private String descripcion;

    public Ej1(String descripcion) {
        this.descripcion = descripcion;
        System.out.println("Este es un constructor de clase abstracta.");
    }

    public abstract void abstract_method();

    public void method(){
        System.out.println("Este es un método normal de clase abstracta.");
    }
}

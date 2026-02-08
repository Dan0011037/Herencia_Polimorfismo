package Pagina5.ej1;

public class subClase extends Ej1{
    public subClase(String descripcion) {
        super(descripcion);
    }

    @Override
    public void abstract_method() {
        System.out.println("Este es un método abstracto implementado en una clase no abstracta.");}
}

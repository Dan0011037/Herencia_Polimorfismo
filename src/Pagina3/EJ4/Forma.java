package Pagina3.EJ4;

public class Forma {
     String nombre;

    public Forma(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public double area(){
        return 0;
    }

    @Override
    public String toString(){
        return ("La forma es " + nombre);
    }

}

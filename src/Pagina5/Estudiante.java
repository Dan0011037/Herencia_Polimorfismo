package Pagina5;

import Pagina5.Forma.Redimensionable;

public class Estudiante implements Redimensionable, Comparable <Estudiante>{
    private String nombre;
    private int edad;
    private int altura;

    public Estudiante(String nombre, int edad, int altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public void redimensionar(int x) {
    }

    @Override
    public int compareTo(Estudiante o) {
        if (this.altura > o.altura) {
            return 1;
        } else if (this.altura < o.altura) {
            return -1;
        } else {
            if (this.edad > o.edad) {
                return 1;
            } else if (this.edad < o.edad) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    public String toString() {
        return getNombre() + " - Altura: " + getAltura() + " - Edad: " + getEdad();
    }
}

package Pagina2.EJ1_2.EJ12;

public class Habitacion {
    private String nombre;
    private Pared pared1;
    private Pared pared2;
    private Pared pared3;
    private Pared pared4;
    private Techo techo;
    private Cama cama;
    private Lampara lampara;

    public Habitacion(String nombre, Pared pared1, Pared pared3, Pared pared2, Pared pared4, Techo techo, Lampara lampara, Cama cama) {
        this.nombre = nombre;
        this.pared1 = pared1;
        this.pared3 = pared3;
        this.pared2 = pared2;
        this.pared4 = pared4;
        this.techo = techo;
        this.lampara = lampara;
        this.cama = cama;
    }

    public Lampara getLampara() {
        return lampara;
    }

    public Cama hacerLaCama() {
        System.out.println("Se esta haciendo la cama...");
        cama.hacer();
        return cama;
    }

    public Cama cogerPeluche(){
        System.out.println("Buscando peluche...");
        cama.tenerP();
        return cama;
    }


}

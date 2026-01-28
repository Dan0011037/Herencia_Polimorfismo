import Pagina1.EJ13.Cilindro;
import Pagina1.EJ13.Circulo;
import Pagina2.EJ1_2.*;

public class Main {
    public static void main(String[] args) {

        /* 13.
        Circulo circulo = new Circulo(3);
        Cilindro cilindro = new Cilindro(5, 23);
        System.out.println(circulo.toString());
        System.out.println(cilindro.toString());
        */

        //1.2
        Pared pared1 = new Pared("norte");
        Pared pared2 = new Pared("Sur");
        Pared pared3 = new Pared("Este");
        Pared pared4 = new Pared("Oeste");
        Techo techo = new Techo("Blanco", 2);
        Lampara lampara = new Lampara("Rococo",true, 10);
        Cama cama = new Cama(3, "Coquette", 1, 3, 1, -3);
        Habitacion habitacion = new Habitacion("Mi habitacion", pared1, pared2, pared3, pared4, techo, lampara, cama);

        habitacion.hacerLaCama();
        System.out.println("---");
        habitacion.getLampara().encender();
        System.out.println("---");
        habitacion.cogerPeluche();



    }

}
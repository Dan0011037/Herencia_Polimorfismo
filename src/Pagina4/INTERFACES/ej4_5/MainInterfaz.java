package Pagina4.INTERFACES.ej4_5;

public class MainInterfaz {

        /*public static void main(String[] args){
        Bienes bienes = new Bienes("si señor", 3);
        Comida comida = new Comida(457, "comida", 3);
        Juguete juguete = new Juguete(6,"juguete", 12);
        Libro libro = new Libro("Daniela", "autobiografia", 10);

        System.out.println("El precio total del libro es: " + libro.calcularImpuestos() + "€");
        System.out.println("El precio total del juguete es: " + juguete.calcularImpuestos() + "€");
        System.out.println("La comida no tiene impuestos, vale " + comida.getPrecio() + "€");
        */

        //con arrays
    public static void muchosImpuestos(Imponible[] imponibles) {
        for (Imponible imponible:imponibles) {
            imponible.calcularImpuestos();
        }

    }

    public static void main(String[] args){
        Imponible[] muchosImpuestos= new Imponible[2];
        muchosImpuestos[0]= new Juguete(6,"juguete", 12);
        muchosImpuestos[1] = new Libro("Daniela", "autobiografia", 10);
        System.out.println(muchosImpuestos[0]);
        System.out.println(muchosImpuestos[1]);

        muchosImpuestos(muchosImpuestos);
    }
}

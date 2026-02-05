package Pagina2.EJ1_2.EJ3;

class MainEncapsulacion {

    public static void main(String[] args) {
        Impresora impresora = new Impresora(25,34,true);

        System.out.println("Toner añadido: " + impresora.setToner(0));
        System.out.println("Caras impresas: " + impresora.calculoNumPag(50));

    }
}
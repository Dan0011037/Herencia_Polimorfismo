package Pagina3.EJ4;

public class MainPintura {
    public static void main(String[] args){

        Pintura pintura = new Pintura(95);

        Forma rectangulo = new Rectangulo("uno", 35, 20);
        Forma esfera = new Esfera("dos", 12);
        Forma cilindro = new Cilindro("tres", 30, 60);

        System.out.println("Pintura necesaria para rectángulo: " + pintura.pinturaNecesaria(rectangulo));
        System.out.println("Pintura necesaria para esfera: " + pintura.pinturaNecesaria(esfera));
        System.out.println("Pintura necesaria para Cilindro: " + pintura.pinturaNecesaria(cilindro));
    }
}

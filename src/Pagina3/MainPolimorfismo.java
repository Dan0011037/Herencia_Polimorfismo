package Pagina3;

import Pagina3.EJ3.*;

public class MainPolimorfismo {
    public static void main(String[] args){
        //3
        CocheElectrico cocheElectrico = new CocheElectrico("Audi", 3);
        CocheDeGasolina cocheDeGasolina = new CocheDeGasolina("BMW", 5);
        CocheHibrido cocheHibrido = new CocheHibrido("Honda", 4);

        cocheElectrico.isMotor();
        cocheHibrido.isMotor();
        cocheDeGasolina.isMotor();


        /* Ejemplo interfaz 1
        TelefonoMovil iphone5=new TelefonoMovil(555456789);
        iphone5.imprimirImpuesto();

        //Variable de tipo Impuesto que contiene objeto Movil. Usa el polimorfismo
        Impuesto impuestoMovil = new TelefonoMovil(123456789);
        impuestoMovil.imprimirImpuesto();


        // Ejemplo interfaz 2
        //podemos crear un dinamita y explotarla
        Dinamita dim1 = new Dinamita("DinamitaCat1");
        dim1.explotar();

        Madera mad1 = new Madera("Pino");
        mad1.incinerar();

        Butano but1 = new Butano("But10Litros");
        but1.incinerar();
        but1.explotar();

        Cesped cesp1 = new Cesped("artificial");

*/

    }

}

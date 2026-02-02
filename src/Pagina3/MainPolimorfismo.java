package Pagina3;

import Pagina3.EJ3.CocheDeGasolina;
import Pagina3.EJ3.CocheElectrico;
import Pagina3.EJ3.CocheHibrido;

public class MainPolimorfismo {
    public static void main(String[] args){
        //3
        CocheElectrico cocheElectrico = new CocheElectrico("Audi", 3);
        CocheDeGasolina cocheDeGasolina = new CocheDeGasolina("BMW", 5);
        CocheHibrido cocheHibrido = new CocheHibrido("Honda", 4);

        cocheElectrico.isMotor();
        cocheHibrido.isMotor();
        cocheDeGasolina.isMotor();


        //4
    }

}

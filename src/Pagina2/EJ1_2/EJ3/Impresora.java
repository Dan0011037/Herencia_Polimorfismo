package Pagina2.EJ1_2.EJ3;

import javax.crypto.spec.PSource;

public class Impresora {
    private int toner;
    private int numPaginasImpresas;
    private boolean impDobleCara;

    public Impresora(int toner, int numPaginasImpresas, boolean impDobleCara) {
        this.toner = toner;
        this.numPaginasImpresas = numPaginasImpresas;
        this.impDobleCara = impDobleCara;
    }

    public boolean isImpDobleCara() {
        if (true){
            System.out.println("Puede imprimir doble cara.");
        }else {
            System.out.println("No puede imrpimir doble cara.");
        }
        return impDobleCara;
    }

    public int getNumPaginasImpresas() {return numPaginasImpresas;
    }

    public int getToner(){
        toner =- numPaginasImpresas;
        return toner;
    }

    public int añadirToner(){
        if (toner < 0){
            System.out.println("ERROR -1");
        }if (toner <= 10 || toner > 0){
            System.out.println("Toner actual= " + toner);
            System.out.println("Poco toner, añadiendo...");
            toner=+50;
        }else{
            if (toner > 10 || toner < 100){
                System.out.println("Toner actual= " + toner);
                System.out.println("Toner suficiente, imprimiendo...");
            }
        }
        return toner++;
    }
}

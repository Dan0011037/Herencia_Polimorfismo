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
        if (this.impDobleCara){
            System.out.println("Puede imprimir doble cara.");
        }else {
            System.out.println("No puede imrpimir doble cara.");
        }
        return impDobleCara;
    }

    public int getNumPaginasImpresas() {
        return numPaginasImpresas;
    }

    public int setNumPaginasImpresas() {
        if (impDobleCara) {
            System.out.println("Impresion doble cara, se imprimirá el doble.");
            return numPaginasImpresas * 2;
        }
        return numPaginasImpresas++;
    }

    public int getToner(){
        return toner;
    }

    public int setToner(int anadirCantidad){
        if (anadirCantidad < 0 || anadirCantidad > 100){
            System.out.println("Imposible añaidr.");
            return -1;
        }else if (toner + anadirCantidad >= 100){
            System.out.println("Imposible añadir, toner actual + añadido es demasiado.");
            return -1;
        }else if (toner <= 0){
            numPaginasImpresas = 0;
            System.out.println("Toner insuficiente.");
        }
        return anadirCantidad;
    }
}

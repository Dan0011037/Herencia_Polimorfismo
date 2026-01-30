package Pagina2.EJ1_2.EJ3;

public class Paginas extends Impresora {
    private int paginasAImprimir;

    public Paginas(int toner, int numPaginasImpresas, boolean impDobleCara, int paginasAImprimir) {
        super(toner, numPaginasImpresas, impDobleCara);
        this.paginasAImprimir = paginasAImprimir;
    }

    public int getPaginasAImprimir() {
        if (super.getToner() <= 0){
            System.out.println("No se puede imprimir");
            paginasAImprimir = 0;
        } else if (isImpDobleCara()) {
            paginasAImprimir +=2;
        }else {
            paginasAImprimir++;
        }
        return paginasAImprimir;
    }
}

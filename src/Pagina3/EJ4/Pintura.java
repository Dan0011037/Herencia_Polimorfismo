package Pagina3.EJ4;

public class Pintura {
    private double cobertura;

    public Pintura (double cobertura){
        this.cobertura = cobertura;
    }

    public double pinturaNecesaria(Forma forma){
        //modificar
        return forma.area()/cobertura;
    }
}

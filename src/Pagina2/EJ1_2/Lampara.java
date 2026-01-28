package Pagina2.EJ1_2;

public class Lampara {
    private String estilo;
    private boolean bateria;
    private int calificacion;


    public Lampara(String estilo, boolean bateria, int calificacion) {
        this.estilo = estilo;
        this.bateria = bateria;
        this.calificacion = calificacion;
    }

    public void encender(){
        if (bateria){
            System.out.println("La lámpara se ha encendido.");
        }else{
            System.out.println("No se puede encender la lampara.");
        }
    }

    public String getEstilo() {
        return estilo;}

    public boolean hayBateria() {
        return bateria;}

    public int getCalificacion() {
        return calificacion;}
}

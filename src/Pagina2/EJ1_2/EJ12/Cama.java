package Pagina2.EJ1_2.EJ12;

public class Cama {
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;
    private int peluche;

    public Cama(int almohadas, String estilo, int altura, int sabanas, int colcha, int peluche) {
        this.almohadas = almohadas;
        this.estilo = estilo;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
        this.peluche = peluche;
    }

    public void hacer() {
        if (sabanas <= 0 || colcha <= 0) {
            System.out.println("No se puede hacer la cama.");
        } else {
            System.out.println("Se ha hecho la cama.");
        }
    }

    public void tenerP(){
        if (peluche <= 0){
            System.out.println("No tiene ningun peluche.");
        }else {
            System.out.println("Hay peluche(s).");
        }
    }

    public int getAlmohadas() {
        return almohadas;}

    public String getEstilo() {
        return estilo;}

    public int getAltura() {
        return altura;}

    public int getSabanas() {
        return sabanas;}

    public int getColcha() {
        return colcha;}
}

package Pagina2;

public class Cama {
    private String estilo;
    private int almohadas;
    private int altura;
    private int sabanas;
    private int colcha;

    public Cama(int almohadas, String estilo, int altura, int sabanas, int colcha) {
        this.almohadas = almohadas;
        this.estilo = estilo;
        this.altura = altura;
        this.sabanas = sabanas;
        this.colcha = colcha;
    }

    public void hacer() {
        if (sabanas <= 0 || colcha <= 0) {
            System.out.println("No se puede hacer la cama.");
        } else {
            System.out.println("Se ha hecho la cama.");
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

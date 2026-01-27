package Pagina1.VIDEO;

public class Video {
    private String titulo;
    private int minutos;
    private int precio;

    public Video(String titulo, int minutos, int precio){
        this.titulo = titulo;
        this.minutos = minutos;
        this.precio = precio;
    }
    @Override
    public String toString(){
        return "Pagina1.VIDEO.Video (titulo= "+ titulo+ ", minutos= "+minutos + ", precio= "+ precio + ")";
    }
}


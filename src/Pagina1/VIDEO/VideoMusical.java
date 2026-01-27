package Pagina1.VIDEO;

public class VideoMusical extends Video {
    String artista;
    String categoria;

    public VideoMusical(String titulo, int minutos, int precio, String artista, String categoria) {
        super(titulo, minutos, precio);
        this.artista = artista;
        this.categoria = categoria;
    }

    @Override
    public String toString(){
        return "Pagina1.VIDEO.Video musical (artista= "+ artista+ ", categoria= "+categoria +")";
    }
}

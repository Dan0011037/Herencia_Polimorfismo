package VIDEO;

public class Pelicula extends Video {
    private String director;
    private int valoracion;

    public Pelicula(String titulo, int minutos,int precio , String director, int valoracion){
        super(titulo, minutos, precio);
        this.director = director;
        this. valoracion = valoracion;
    }
    @Override
    public String toString(){
        return "VIDEO.Pelicula (director= "+ director+ ", valoracion= "+ valoracion + ")";
    }


}

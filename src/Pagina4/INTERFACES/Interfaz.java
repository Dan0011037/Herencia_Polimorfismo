package Pagina4.INTERFACES;

public interface Interfaz {
    public double methodB();
    public static final int aConstant = 32;
    public static final double pi = 3.14159;
    public void methodA( int x );

    public final int x = 32;
    // public double y; //es una constante que habria que inicializar
    // public double addup();
    // public boolean addup();
    //no se pueden llamar dos metodos iguales en  la misma interfaz aunque tengan distitntos tipos de retorno
}

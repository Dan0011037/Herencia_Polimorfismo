package Pagina3.EJ3;

public class CocheHibrido extends Coche{
    public CocheHibrido(String modelo, int cilindros) {
        super(modelo, cilindros);
    }
    @Override
    public boolean isMotor(){
        System.out.println(getModelo() + " es de combustion y electrico.");
        return true;
    }
}

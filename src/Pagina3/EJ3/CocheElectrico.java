package Pagina3.EJ3;

public class CocheElectrico extends Coche{
    public CocheElectrico(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public boolean isMotor(){
        System.out.println(getModelo() + " tiene motor electrico.");
        return false;
    }
}

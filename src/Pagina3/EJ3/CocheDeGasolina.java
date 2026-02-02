package Pagina3.EJ3;

public class CocheDeGasolina extends Coche{

    public CocheDeGasolina(String modelo, int cilindros) {
        super(modelo, cilindros);
    }

    @Override
    public boolean isMotor(){
        System.out.println(getModelo() + " motor de combustion.");
        return true;
    }
}

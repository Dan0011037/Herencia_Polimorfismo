package Pagina5.empleado;

public class HourlyEmployee extends Employee{
    private double tasaDePago;
    private int horasTrabajadas;

    public HourlyEmployee(String nombre, String cargo, double tasaDePago, int horasTrabajadas) {
        super(nombre, cargo);
        this.tasaDePago = tasaDePago;
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTasaDePago() {return tasaDePago;}
    public int getHorasTrabajadas() {return horasTrabajadas;}

    public void setTasaDePago(double tasaDePago) {
        this.tasaDePago = tasaDePago;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    @Override
    public double calculateWeeklyPay() {
        return tasaDePago * horasTrabajadas;
    }
}

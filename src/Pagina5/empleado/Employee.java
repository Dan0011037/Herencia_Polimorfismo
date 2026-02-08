package Pagina5.empleado;

public abstract class Employee {
    private String nombre;
    private String cargo;

    public Employee(String nombre, String cargo) {
        this.nombre = nombre;
        this.cargo = cargo;
    }

    public abstract double calculateWeeklyPay();

    public String getCargo() {return cargo;}

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getNombre() {return nombre;}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}

package Pagina5;

import Pagina5.Forma.Rectangulo;
import Pagina5.Forma.Triangulo;
import Pagina5.ej1.subClase;
import Pagina5.empleado.HourlyEmployee;
import Pagina5.empleado.SalaryEmployee;

public class MainAbstraccion {
    public static void main(String[] args) {
        /*
        ej 1

        subClase miSubClase = new subClase("si");
        miSubClase.method();
        miSubClase.abstract_method();
        */

        /*
        ej 2
        HourlyEmployee miHourlyEmployee = new HourlyEmployee("Maria", "señora",345, 45);
        SalaryEmployee miSalaryEmployee = new SalaryEmployee("Daniela", "jefa", 3000);

        System.out.println("El salario semanal de " + miSalaryEmployee.getNombre() + " es " + miSalaryEmployee.calculateWeeklyPay());
        System.out.println("El pago semanal es de " + miHourlyEmployee.getNombre() + " es " + miHourlyEmployee.calculateWeeklyPay());
        */

        // ej 3
        Rectangulo miRectangulo = new Rectangulo(4, 5, 10);
        Triangulo miTriangulo = new Triangulo(3, 7, 25);

        System.out.println("El area del Rectangulo es " + miRectangulo.getArea());
        System.out.println("El perimetro del Rectangulo es " + miRectangulo.getPerimeter());
        System.out.println("EL area del Triangulo es " + miTriangulo.getArea());
        System.out.println("El perimetro del Triangulo es " + miTriangulo.getPerimeter());

    }
}

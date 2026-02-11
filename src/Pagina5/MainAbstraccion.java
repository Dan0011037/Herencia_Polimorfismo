package Pagina5;

import Pagina5.Forma.Rectangulo;
import Pagina5.Forma.Triangulo;
import Pagina5.ej1.subClase;
import Pagina5.empleado.HourlyEmployee;
import Pagina5.empleado.SalaryEmployee;

import java.lang.reflect.Array;
import java.util.Arrays;

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

        /* ej 3
        Rectangulo miRectangulo = new Rectangulo(4, 2, 3);
        Rectangulo miRectangulo1 = new Rectangulo(4, 4, 7);
        Rectangulo miRectangulo2 = new Rectangulo(4, 32, 65);
        Rectangulo miRectangulo3 = new Rectangulo(4, 12, 23);
        Rectangulo miRectangulo4 = new Rectangulo(4, 5, 7);
        Rectangulo miRectangulo5 = new Rectangulo(4, 43, 12);
        Rectangulo miRectangulo6 = new Rectangulo(4, 76, 45);
        Rectangulo miRectangulo7 = new Rectangulo(4, 9, 15);
        Rectangulo miRectangulo8 = new Rectangulo(4, 82, 45);
        Rectangulo miRectangulo9 = new Rectangulo(4, 91, 32);
        Rectangulo miRectangulo10 = new Rectangulo(4, 27, 10);

        Triangulo miTriangulo = new Triangulo(3, 7, 25);

        if (miRectangulo7.compareTo(miRectangulo9) < 0){
            System.out.println("Mi rectangulo es menor.");
        }else if (miRectangulo7.compareTo(miRectangulo9) > 0){
            System.out.println("Mi rectangulo es mayor.");
        }
        miRectangulo.redimensionar(2);

        System.out.println("El area del Rectangulo es " + miRectangulo.getArea());
        System.out.println("El perimetro del Rectangulo es " + miRectangulo.getPerimeter());
         */

        //ej 7
        Estudiante estudiante1 = new Estudiante("Patri", 12, 170);
        Estudiante estudiante2 = new Estudiante("Manuel", 43, 173);
        Estudiante estudiante3 = new Estudiante("Javier", 72, 189);
        Estudiante estudiante4 = new Estudiante("Alicia", 52, 168);
        Estudiante estudiante5 = new Estudiante("Alberto", 35, 189);

        Estudiante array[] = {estudiante1, estudiante2, estudiante3, estudiante4, estudiante5};
        Arrays.sort(array);
        array[0] = estudiante1;
        array[1] = estudiante2;
        array[2] = estudiante3;
        array[3] = estudiante4;
        array[4] = estudiante5;

        for (int i = 0; i < array.length; i++){
            System.out.println(i + ". " + array[i].toString());
        }
    }
}

{
    public static void main(String[] args) {

        /*
        1.
        a. ¿Cuántos tipos de automóviles hay en el diagrama?
          hay 1 tipo, ford

        b. ¿Cuántos objetos de automóvil hay en el diagrama?
          4
         */


        /*
        2.
        a. ¿Es Nissan una clase derivada de Automobile?
          sip

        b. ¿Es Nissan el padre de Sentra?
          La clase padre es automovil, es una subclase de una subclase

        c. ¿Cuántos hijos tiene Ford?
          0

        d. ¿Sentra heredará los atributos de Automobile?
          sip, y tambien los de nissan

        e. Ford extiende de Automobile. ¿Podríamos tener una clase “Truck” de la que también
        extienda Ford, es decir, herede de ella? Razona tu respuesta
          si, igual que nissan tiene a sentra, es una clase derivada con mas atributos que
          no tiene porque tenerlas ford
         */


        /*
        3.
        a. ¿Qué se hereda a nivel de código de una clase base a una clase derivada?
          hereda atributos y metodos, constructores no
        b. ¿Una clase hija hereda tanto atributos como métodos?
          sip

        c. ¿Qué palabra reservada se utiliza para invocar al constructor de la clase padre desde la
        clase hija?
          super

        d. ¿Un constructor hijo siempre invoca a un constructor padre?
          si

        e. Si la clase padre no tiene constructor definido por el desarrollador y la clase hija si tiene,
        ¿se generará un error en el constructor de la clase hija si no invocamos al constructor
         padre? Explica tu respuesta.
          si no tiene un constructor definido no tiene porque dar error, en el caso de que si tuviera y
          y no se invocara si que daria un error
         */


        /*
        4. Pon tres ejemplos de herencia. No hace falta que incluyas atributos o métodos, solo los nombres
        de las clases y señala quiénes son las clases hijas y las clases padres.
          persona -> estudiante, docente.
          transporte -> moto, coche.
          animal -> perro, gato
         */


        /*
        6. ¿Qué problema surgiría si se permitiese la herencia múltiple en Java? Razona tu respuesta con
        un ejemplo.
          con la herencia múltiple, a veces es difícil saber qué padre contribuyó con qué características al hijo.
         */


        /*
        7.
        a. La clase A es una clase padre de la clase C.
        b. La clase B es nada de la clase C.
        c. La clase E es una subclase de la clase A.
        d. La clase D es una subclase de la clase B.
        e. La clase A es una clase padre de la clase D
         */


        /*
        8.
        lectura ->
        -> periódico
        -> libro -> novela
         */


        /*
        9. en la sobrecarga tenemos
         varios métodos con el mismo nombre pero diferentes parámetros
         */

        //11.
        Video ob1 = new Video("VHS", 90, 34);
        Pelicula ob2 = new Pelicula("ET", 120, 34, "Spielberg", 10 );
        VideoMusical ob3 = new VideoMusical("algo", 3, 34, "yo", "si");
        System.out.println(ob1.toString());
        System.out.println(ob2.toString());
        System.out.println(ob3.toString());
    }

}

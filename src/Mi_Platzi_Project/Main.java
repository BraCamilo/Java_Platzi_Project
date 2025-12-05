package Mi_Platzi_Project;

import Mi_Platzi_Project.Contenido.Pelicula;




public class Main {
    static void main() {
        Pelicula p1 = new Pelicula();
        p1.setTitulo("Halo");
        p1.setYear("2002");
        p1.setDisponible();
        p1.calificar(5);
        System.out.println(p1.obtener());

        /*The Scanner class can be used to obtain data from the keyboard, files and strings.*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");

        String nombre = scanner.nextLine();
        System.out.println("Hola "+ nombre + " bienvenido a Java");

        System.out.println(nombre + " ¿Cuántos años tienes?");
        int edad = scanner.nextInt();

        System.out.println(nombre +" tu edad, que es: "+edad+", permite que aprendas Java");*/

    }
}
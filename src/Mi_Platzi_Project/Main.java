package Mi_Platzi_Project;

import Mi_Platzi_Project.Contenido.Pelicula;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hola mundo");

        /*The Scanner class can be used to obtain data from the keyboard, files and strings.*/
       /* Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");

        String nombre = scanner.nextLine();
        System.out.println("Hola "+ nombre + " bienvenido a Java");

        System.out.println(nombre + " ¿Cuántos años tienes?");
        int edad = scanner.nextInt();

        System.out.println(nombre +" tu edad, que es: "+edad+", permite que aprendas Java");*/
        Pelicula pelicula1 = new Pelicula();
        pelicula1.titulo = "Halo";
        pelicula1.duracion = "120 mn";
        pelicula1.year = "2007";
        pelicula1.descripcion = "Es una pelicula de ciencia ficcion";
        pelicula1.genero = "Accion";

        pelicula1.calificar(2.1);

        System.out.println(pelicula1.obtener());
    }
    //COMO TAREA HAS DE NUEVO ESTO MAS ORDENADO Y CREANDO UNA CLASE NUEVA QUE SEA USUARIO Y PONLA A INTERACTUAR DE ALGUNA FORMA ACA EN EL MAIN
}
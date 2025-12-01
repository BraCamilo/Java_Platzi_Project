package Mi_Platzi_Project;

import java.util.Scanner;

public class Main {
    static void main() {
        System.out.println("Hola mundo");

        /*The Scanner class can be used to obtain data from the keyboard, files and strings.*/
        Scanner scanner = new Scanner(System.in);
        System.out.println("¿Cuál es tu nombre?");

        String nombre = scanner.nextLine();
        System.out.println("Hola "+ nombre + " bienvenido a Java");

        System.out.println(nombre + " ¿Cuántos años tienes?");
        int edad = scanner.nextInt();

        System.out.println(nombre +" tu edad, que es: "+edad+", permite que aprendas Java");


    }
}
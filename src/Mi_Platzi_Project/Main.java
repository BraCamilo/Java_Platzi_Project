package Mi_Platzi_Project;

import Mi_Platzi_Project.Contenido.Pelicula;




public class Main {
    static void main(String[] args) {
        /*Pelicula p1 = new Pelicula();
        p1.setTitulo("Halo");
        p1.setYear("2002");
        p1.setDisponible();
        p1.calificar(5);
        System.out.println(p1.obtener());*/ //Forma de hacerlo sin constructor

        Pelicula p1 = new Pelicula("Halo", "2002", "Accion");
        Pelicula p2 = new Pelicula("Sirenita", "2005", "Infantil");

        p1.setDisponible(true);
        p2.setDisponible(true);

        String Resena1 = p1.agregarResena("Hola, me parece que la pelicula fue muy mala, lasmita que le cambiaron toda la trama del juego");
        String Resena2 = p2.agregarResena("A mi esposa le gusta");

        System.out.println("Nueva reseña para " + p1.getTitulo() + ": " + Resena1);

        System.out.println();

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
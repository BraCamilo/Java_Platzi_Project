package Mi_Platzi_Project;

import Mi_Platzi_Project.Contenido.Pelicula;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Main {
    static void main() {
        Pelicula p1 = new Pelicula();
        p1.setTitulo("Halo");
        p1.setDisponible(true);
        p1.calificar(5);
        p1.setFechaEstreno(LocalDate.of(2005, 10,15));
        System.out.println(p1.obtener());

        usuario user1 = new usuario();
        user1.setFechaRegistro(LocalDateTime.now());
        DateTimeFormatter formate = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String fechaFormateada = user1.getFechaRegistro().format(formate);
        System.out.println(user1.getFechaRegistro());
        System.out.println(fechaFormateada);


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
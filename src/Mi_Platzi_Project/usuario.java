package Mi_Platzi_Project;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class usuario {
    private String user;
    private String nombre;
    public String fechaRegistro;

    //GETTER
    public String getUser(){
        return user;
    }

    //SETTER


    //CONTRUCTOR USER
    public usuario(String user, String nombre){
        //saludo
        System.out.println("Creando nuevo usuario...");
        try {
            Thread.sleep(1000); // pausa de 1 segundo
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //fecha de registro
        LocalDateTime fecha = LocalDateTime.now();
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm:ss");
        this.fechaRegistro = fecha.format(f);
        //datos del usuario
        this.user = user;
        this.nombre = nombre;


    }
}

package Mi_Platzi_Project;

import java.time.LocalDateTime;

public class usuario {
    private String user;
    private String nombre;
    public LocalDateTime fechaRegistro;

    //GETTERS
    public LocalDateTime getFechaRegistro(){
        return fechaRegistro;
    }

    //SETTERS
    public void setFechaRegistro(LocalDateTime fechaRegistro){
        this.fechaRegistro = fechaRegistro;
    }
}

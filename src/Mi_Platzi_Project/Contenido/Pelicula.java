package Mi_Platzi_Project.Contenido;

import org.w3c.dom.ls.LSOutput;

import java.time.LocalDate;
import java.util.Date;

public class Pelicula {
    //Atributos
    private String titulo;
    private String descripcion;
    private String duracion;
    private String genero;
    private double calificacion;
    private boolean disponible;
    private LocalDate fechaEstreno;


    //Getters
    public String getTitulo(){
        return titulo;
    }
    
    public double getCalificacion(){
        return calificacion;
    }
    public boolean getDisponible(){
        return disponible;
    }

    //Setters
    public void setTitulo(String newTitulo){
        this.titulo = newTitulo;
    }
    public void setDisponible(){
        this.disponible = disponible;
    }

    //Metodos
    public void reproducir(){
        System.out.println("Reproduciendo "+ titulo);
    }
    public String obtener(){
        return "El titulo de la pelicula es: "+ getTitulo()+"\nEl ano de estreno es: " + "\nDispobinilidad: " + getDisponible() +"\nY su actual calificacion es: " + getCalificacion();
    }
    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        }

    }
    public boolean esPopular(){
        return calificacion >= 4;
    }
}


//COMENTARIOS
//El color lila hace referencia a que se esta mencionando el atributo de la clase y el blanco como tal a la variable que se esta usando en la funcion
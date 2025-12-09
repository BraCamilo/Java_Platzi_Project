package Mi_Platzi_Project.Contenido;

public class Pelicula {
    //Atributos
    private String titulo;
    private String descripcion;
    private String duracion;
    private String genero;
    private String year;
    private double calificacion;
    private boolean disponible;

    //Getters
    public String getTitulo(){
        return titulo;
    }
    public String getYear(){
        return year;
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
    public void setYear(String newYear){
        this.year = newYear;
    }
    public void setDisponible(boolean b){
        this.disponible = b;
    }

    //Metodos
    public void reproducir(){
        System.out.println("Reproduciendo "+ titulo);
    }
    public String obtener(){
        return "El titulo de la pelicula es: "+ getTitulo()+"\nEl ano de estreno es: " + getYear() + "\nDispobinilidad: " + getDisponible() +"\nY su actual calificacion es: " + getCalificacion();
    }
    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        }

    }
    public String agregarResena(String texto){
        return texto;
    }

    //CONSTRUCTOR
    public Pelicula(String titulo, String year, String genero) {
    }



    public boolean esPopular(){
        return calificacion >= 4;
    }

}


//COMENTARIOS
//El color lila hace referencia a que se esta mencionando el atributo de la clase y el blanco como tal a la variable que se esta usando en la funcion

//Pendiente crear un constructor y agregar el resto de cosas que el "Jefe solicito"> https://chatgpt.com/c/69332988-09f0-832f-b9be-dcbee08bc81d
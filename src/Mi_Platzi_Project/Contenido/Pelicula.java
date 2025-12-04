package Mi_Platzi_Project.Contenido;

public class Pelicula {
    public String titulo;
    public String descripcion;
    public String duracion;
    public String genero;
    public String year;
    public double calificacion;
    public boolean disponible;


    //Metodos
    public void reproducir(){
        System.out.println("Reproduciendo "+ titulo);
    }

    public String obtener(){
        return titulo + "(" + year + ")\n" +
                "Genero: " + genero + "\n" +
                "Duracion: " + duracion + "\n" +
                "Descripcion: " + descripcion + "\n" +
                "Calificacion: " + calificacion + "5/" + "\n" +
                "Disponible: " + disponible + ".";
    }
    //El color lila hace referencia a que se esta mencionando el atributo de la clase y el blanco como tal a la variable que se esta usando en la funcion
    public void calificar(double calificacion) {
        if (calificacion >= 0 && calificacion <= 5){
            this.calificacion = calificacion;
        }

    }

    public boolean esPopular(){
        return calificacion >= 4;
    }
}

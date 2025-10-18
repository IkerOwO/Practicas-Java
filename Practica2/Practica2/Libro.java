package Practica2;
import java.time.LocalDate;

public class Libro {
    public String titulo;
    public Autor autor;
    public String editorial;
    public LocalDate fechaPublicacion;
    public String lsbn;
    public double precio;

    public Libro(String titulo, Autor autor, String editorial, LocalDate fechaPublicacion, String lsbn, double precio){
        this.titulo = titulo;
        this.autor = autor;
        this.editorial = editorial;
        this.fechaPublicacion = fechaPublicacion;
        this.lsbn = lsbn;
        this.precio = precio;
    }
    
    // GETTERS
    public String getTitulo(){
        return titulo;
    }
    public Autor getAutor(){
        return autor;
    }
    public String getEditorial(){
        return editorial;
    }
    public LocalDate getFechaPublicacion(){
        return fechaPublicacion;
    }
    public String getLsbn(){
        return lsbn;
    }
    public double getPrecio(){
        return precio;
    }

    // SETTERS
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setAutor(Autor autor){
        this.autor = autor;
    }
    public void setEditorial(String editorial){
        this.editorial = editorial;
    }
    public void setFechaPublicacion(LocalDate fechaPublicacion){
        this.fechaPublicacion = fechaPublicacion;
    }
    public void setLsbn(String lsbn){
        this.lsbn = lsbn;
    }
    public void setPrecio(double precio){
        this.precio = precio;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Titulo: "+titulo+"\n"+"Autor: "+autor+"\n"+"Fecha publicacion: "+fechaPublicacion+"\n"+"Lsbn: "+lsbn+"\n"+"Precio: "+precio;
    }

}

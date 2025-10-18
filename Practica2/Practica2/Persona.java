package Practica2;
import java.time.LocalDate;

public class Persona {
    public String nombre;
    public String apellido;
    public LocalDate fechaNacimiento;

    public Persona(String nombre, String apellido, LocalDate fechaNacimiento){
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaNacimiento = fechaNacimiento;
    }

    //GETTERS
    public String getNombre(){
        return nombre;
    }
    public String getApellido(){
        return apellido;
    }
    public LocalDate getFechaNacimiento(){
        return fechaNacimiento;
    }

    //SETTERS
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellido(String apellido){
        this.apellido = apellido;
    }
    public void setFechaNaciemiento(LocalDate fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
    }

    //TO STRING
    @Override
    public String toString() {
        return "Nombre: "+nombre+"\n"+"Apellido: "+apellido+"\n"+"Fecha nacimiento: "+fechaNacimiento;
    }
}

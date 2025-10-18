package Practica2;

import java.time.LocalDate;

public class Autor extends Persona {

   private GeneroLiterario generoLiterario;

    public Autor(String nombre, String apellido, LocalDate fechaNacimiento, GeneroLiterario generoLiterario) {
        super(nombre, apellido, fechaNacimiento);
        this.generoLiterario = generoLiterario;
    }

    // GETTERS
    public String getGeneroLiterario() {
        return this.generoLiterario.getNombre();
    }

    // SETTERS
    public void setGeneroLiterario(GeneroLiterario generoLiterario) {
        this.generoLiterario = generoLiterario;
    }

    // TO STRING
    @Override
    public String toString() {
        return "Autor [generoLiterario=" + generoLiterario.getNombre() + ", " + super.toString() + "]";
    }

}

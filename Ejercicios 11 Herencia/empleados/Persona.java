package empleados;

public class Persona {
    private String p_dni;
    private int p_edad;
    private String p_estado;
    private String p_nombre;

    public Persona(String dni, int edad, String estado, String nombre){
        p_dni = dni;
        p_edad = edad;
        p_estado = estado;
        p_nombre = nombre;
    }

    /* GETTERS */
    public String getNif(){
        return p_dni;
    }
    public int getEdad(){
        return p_edad;
    }
    public String getEstado(){
        return p_estado;
    }
    public String getNombre(){
        return p_nombre;
    }
    public int getCumpleaños(){
        return 2025/p_edad;
    }

    /* SETTERS */
    public void setEdad(int edad){
        p_edad = edad;
    }
    public void setEstado(String estado){
        p_estado = estado;
    }

    /* TO STRING */
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + p_nombre + '\'' +
                ", dni='" + p_dni + '\'' +
                ", Estado='" + p_estado + '\'' +
                ", Edad='" + p_edad + '\'' +
                ", Cumpleaños='"+ getCumpleaños() + '\'' +
                '}';
    }
}

package Ejercicio4;

public class Persona {
    private String p_nombre;
    private String p_apellido1;
    private String p_apellido2;
    private String p_dni; // Por la letra del final del DNI
    private String p_profesion;
    private int p_edad;

    public Persona(String nombre, String apellido1, String apellido2, String dni, String profesion, int edad){
        p_nombre = nombre;
        p_apellido1 = apellido1;
        p_apellido2 = apellido2;
        p_dni = dni;
        p_profesion = profesion;
        p_edad = edad;
    }
    
    public static Persona[] trabajaEnSector(Persona[] personas, String[] profesiones) {
        // Contar cuántas cumplen
        int contador = 0;
        for (Persona p : personas) {
            for (String prof : profesiones) {
                if (p.Profesion().equalsIgnoreCase(prof)) {
                    contador++;
                    break; // ya no necesitamos seguir comparando
                }
            }
        }

        // Array del tamaño exacto
        Persona[] resultado = new Persona[contador];

        // Llenar el array
        int i = 0;
        for (Persona p : personas) {
            for (String prof : profesiones) {
                if (p.Profesion().equalsIgnoreCase(prof)) {
                    resultado[i] = p;
                    i++;
                    break;
                }
            }
        }

        return resultado;
    }
    // Getters
    public String Nombre(){
        return p_nombre;
    }
    public String Apellido1(){
        return p_apellido1;
    }
    public String Apellido2(){
        return p_apellido2;
    }
    public String Dni(){
        return p_dni;
    }
    public String Profesion(){
        return p_profesion;
    }
    public int Edad(){
        return p_edad;
    }
    public boolean esMayorque(Persona other){
        return Edad() > other.Edad(); 
    }
    public boolean esTocayoDe(Persona other){
        return Nombre() == other.Nombre();
    }
    public boolean esFamiliarDe(Persona other){
        return Apellido1() == other.Apellido1();
    }
    public boolean tieneApellidoCompuesto(){
        if(Apellido1().contains("-") && Apellido2().contains("-")){
            return true;
        }
        return false;
    }

    // Mostrar
    public void Mostrar(){
        System.out.println("El nombre es: "+p_nombre);
        System.out.println("El Primer apellido es: "+p_apellido1);
        System.out.println("El Segundo apellido es: "+p_apellido2);
        System.out.println("El DNI es: "+p_dni);
        System.out.println("La profesion es: "+p_profesion);
        System.out.println("La edad es: "+p_edad);
    }

    // Setters
    public void setNombre(String nombre){
        p_nombre = nombre;
    }
    public void setApellido1(String apellido1){
        p_apellido1 = apellido1;
    }
    public void setApellido2(String apellido2){
        p_apellido2 = apellido2;
    }
    public void setDni(String dni){
        p_dni = dni;
    }
    public void setProfesion(String profesion){
        p_profesion = profesion;
    }
    public void setEdad(int edad){
        p_edad = edad;
    }
    public void esJubilado(){
        if(Edad()>67){
            p_profesion = "Jubilado";
        }
    }
    public boolean esMenor(){
        return Edad()<18;
    }
}

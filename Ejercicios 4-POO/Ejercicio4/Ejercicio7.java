package Ejercicio4;

public class Ejercicio7 {
    public static void main(String[] args){
        Persona ejercicio4 = new Persona("Jose", "Martinez-Gomez", "Rodriguez", "27354650E", "Profesor", 80);
        Persona ejercicio7 = new Persona("Juan", "Perez", "Rodriguez", "27354658A", "Carpintero", 56);
        System.out.println("Ejercicio 7");
        if(ejercicio4.esFamiliarDe(ejercicio7)){
            System.out.println(ejercicio4.Nombre()+ " Y "+ejercicio7.Nombre()+ " Son hermanos");
        } else{
            System.out.println("No son hermanos");
        }
    } 
}

package Ejercicio4;

public class Ejercicio9 {
    public static void main(String[] args) {
        Persona ejercicio9 = new Persona("Juan", "Perez", "Rodriguez", "27354658A", "Carpintero", 56);
        System.out.println("Ejercicio 9");
        if(ejercicio9.esMenor()){
            System.out.println("Es menor de edad");
        } else{
            System.out.println("No es menor de edad");
        }
    }
}

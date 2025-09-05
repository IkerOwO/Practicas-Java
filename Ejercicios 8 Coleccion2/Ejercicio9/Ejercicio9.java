package Ejercicio9;
import java.util.Scanner;

/* 9. Escribir un programa que pida una cadena y la divida en palabras y presente las palabras en orden inverso. */
public class Ejercicio9 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce una cadena de palabras: ");
        String cadena = s.nextLine();
        s.close();
        StringBuilder reversed = new StringBuilder(cadena);
        System.out.println("Reversed phrase: " + reversed.reverse().toString());
    }
}

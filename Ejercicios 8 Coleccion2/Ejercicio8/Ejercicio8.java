package Ejercicio8;
import java.util.Scanner;

/* 8. Escribir un programa que lea una frase y nos diga cuántas palabras la componen. */
public class Ejercicio8 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = s.nextLine();
        int palabras = frase.split("\\s").length;
        System.out.println("La frase se compone de: "+palabras+" palabras");
        s.close();
    }
}

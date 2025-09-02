package Ejercicios5;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = s.nextInt();
        System.out.println("El numero "+num+ " tiene "+String.valueOf(num).length()+" cifras");
        s.close();
    }   
}

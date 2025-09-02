package Ejercicios1;
import java.util.Scanner;

public class Ejercicio1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int a = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int b = s.nextInt();
        if(a>b){
            int resta = a-b;
            System.out.println("El resultado es: "+resta);
        } else{
            int resta = b-a;
            System.out.println("El resultado es: "+resta);
        }
        s.close();
    }
}
package Ejercicios5;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = s.nextInt();
        if(num%2==0 && num%3==0){
            System.out.println("El numero "+num+" es multiplo de 2 y de 3");
        } else if(num%2==0 && num%5==0){
            System.out.println("El numero "+num+" es multiplo de 2 y de 5");
        } else if(num%3==0 && num%5==0){
            System.out.println("El numero "+num+" es multiplo de 3 y de 5");
        } else if(num%2==0 && num%3==0 && num%5==0){
            System.out.println("El numero "+num+" es multiplo de 2 de 3 y de 5");
        } else if(num%2==0){
            System.out.println("El numero "+num+" es multiplo de 2");
        } else if(num%3==0){
            System.out.println("El numero "+num+" es multiplo de 3");
        } else if(num%5==0){
            System.out.println("El numero "+num+" es multiplo de 5");
        }
        s.close();  
    }
}

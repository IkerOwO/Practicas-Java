package Ejercicios5;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero distinto: ");
        int num2 = s.nextInt();
        if(num1==num2){
            System.out.println("Introduce un numero distinto");
        }else{
            if(num1>num2){
                for(int i=num1;i>=num2;i--){
                    System.out.print(i+" ");
                }
            } else {
                for(int i=num2;i>=num1;i--){
                    System.out.print(i+" ");
                }
            }

        }
        s.close();
    }
}

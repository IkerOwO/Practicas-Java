package Ejercicio1;
import java.util.Scanner;

/* 1. Realizar un programa que imprima todos los números de un rango de valores. El programa 
pedirá dos números (el menor y el mayor) y llamará a un método auxiliar encargado de 
imprimir todos los que se encuentren en su rango.
*/

public class Ejercicio1{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();
        if(num1==num2){
            System.out.println("Numeros Iguales, introduce numeros distintos");
        }
        Rango(num1, num2);
        s.close();
    }
    
    public static void Rango(int num1, int num2){
        for(int i=num1;i<=num2;i++){
            System.out.print(i+" ");
        }
    }
}
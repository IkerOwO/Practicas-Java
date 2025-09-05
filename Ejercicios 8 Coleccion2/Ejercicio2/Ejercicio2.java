package Ejercicio2;

import java.util.Scanner;

/*2. Reutilizando el programa anterior escribir solo los números pares en el rango de valores. 
El método auxiliar encargado de imprimir todos los valores que se encuentren en su rango 
tiene que hacer uso de otra función llamada esPar(int num) que devolverá un booleano 
indicando si el número es par o no. */

public class Ejercicio2 {
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
            esPar(i);
        }
    }
    public static boolean esPar(int i){
        if(Math.abs(i%2)==0){
            System.out.println(i+" Es par");
        } else{
            System.out.println(i);
        }
        return true;
    }
}

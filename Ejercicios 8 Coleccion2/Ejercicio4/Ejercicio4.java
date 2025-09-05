package Ejercicio4;
import java.util.Scanner;
/*4. Repetir el ejercicio anterior con una versión que devuelva el mayor de tres números pero 
reutilizando el método mayor de dos números. 
*/
public class Ejercicio4 {
    public static void esMayor(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.println("El numero "+num1+" es mayor que "+num2+" y que "+num3);
        } else if(num2>num1 && num2>num3){
            System.out.println("El numero "+num2+" es mayor que "+num1+" y que "+num3);
        } else if(num3>num1 && num3>num2){
            System.out.println("El numero "+num3+" es mayor que "+num1+" y que "+num2);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num3 = s.nextInt();
        esMayor(num1,num2, num3);
        s.close();
    }    
}

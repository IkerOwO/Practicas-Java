package Ejercicio3;
import java.util.Scanner;
/*3. Realizar un programa que determine cuál es el mayor de dos números. El programa tendrá un 
método mayor que recibirá dos valores de tipo entero y devolverá cual es el mayor. Desde el 
método main se pedirá al usuario los valores y se llamará al método mayor. 
*/

public class Ejercicio3 {
    public static void esMayor(int num1, int num2){
        if(num1>num2){
            System.out.println("El numero "+num1+" es mayor que "+num2);
        } else{
            System.out.println("El numero "+num2+" es mayor que "+num1);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();
        esMayor(num1,num2);
        s.close();
    }   
}

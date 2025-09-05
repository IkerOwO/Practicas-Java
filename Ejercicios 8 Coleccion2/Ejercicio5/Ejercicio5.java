package Ejercicio5;
import java.util.Scanner;
/* 5. Realizar un programa que permita simular una calculadora. El programa tendrá un método calculadora 
que recibirá dos valores de tipo double y un carácter que indicará la operación a realizar (+,-,*,/,). 
Desde el método main se pedirá al usuario los valores y la operación y se llamará al método calculadora.
*/
public class Ejercicio5 {
    public static void Calculadora(double num1, double num2, String op){
        if(op.equals("+")){
            double suma = num1+num2;
            System.out.println(num1+" + "+num2+" = "+suma);
        } else if(op.equals("-")){
            double resta = num1-num2;
            System.out.println(num1+" - "+num2+" = "+resta);
        } else if(op.equals("*")){
            double mult = num1*num2;
            System.out.println(num1+" * "+num2+" = "+mult);
        } else if(op.equals("/")){
            double div = num1/num2;
            System.out.println(num1+" / "+num2+" = "+div);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        double num1 = s.nextDouble();
        System.out.print("Introduce el otro numero: ");
        double num2 = s.nextDouble();
        System.out.print("Que operacion se va a realizar? (+,-,*,/): ");
        String op = s.next();
        Calculadora(num1, num2, op);
        s.close();
    }
}

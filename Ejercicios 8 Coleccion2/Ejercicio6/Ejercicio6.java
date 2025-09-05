package Ejercicio6;
import java.util.Scanner;
/*6. Añadir la programa anterior las operaciones de potencia y raíz cuadrada*/

public class Ejercicio6 {
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
    public static void PotenciaRaiz(double num, String op){
        if(op.equals("r2")){
            double raiz = Math.sqrt(num);
            System.out.println("la raiz de "+num+" es: "+raiz);
        } else if(op.equals("p")){
            double potencia = Math.pow(num, 2);
            System.out.println("El cuadrado de "+num+" es: "+potencia);
        }
    }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Que operacion se va a realizar? (+,-,*,/,r2,p): ");
        String op = s.next();
        if(op.equals("r2")|| op.equals("p")){
            System.out.print("Introduce el numero: ");
            double num = s.nextDouble();
            PotenciaRaiz(num, op);
        }
        System.out.print("Introduce un numero: ");
        double num1 = s.nextDouble();
        System.out.print("Introduce el otro numero: ");
        double num2 = s.nextDouble();
        Calculadora(num1, num2, op);
        s.close();
    }
}

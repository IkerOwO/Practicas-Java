package Ejercicios4;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int mult=1;
        System.out.print("Introduce un numero del 1 al 20: ");
        int num = s.nextInt();
        if(num>20 || num<0){
            System.out.println("Numero Invalido");
        } else{
            for(int i=1;i<=num;i++){
            mult*=i;
        }
        System.out.println("El factorial de "+num +" es: "+mult);
        s.close();
        }
    }
}

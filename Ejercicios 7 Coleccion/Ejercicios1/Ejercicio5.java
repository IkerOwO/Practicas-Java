package Ejercicios1;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        int muestra=1;
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.print("Introduce el numero mostrado "+muestra+" : ");
            int n = sc.nextInt();
            if(n==muestra){
                muestra+=1;
            } else {
                System.out.println("Numero equivocado...");
                break;
            }
        }
        sc.close();
    }
}

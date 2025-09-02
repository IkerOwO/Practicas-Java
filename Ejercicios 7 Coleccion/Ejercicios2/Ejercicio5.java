package Ejercicios2;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner n = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = n.nextInt();
        for(int i=0;i<=num;i++){
            System.out.print("A");
        }
        n.close();
    }
}

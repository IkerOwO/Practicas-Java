package Ejercicios3;
import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la base del triangulo: ");
        float base = s.nextFloat();
        System.out.print("Introduce la altura del triangulo: ");
        float altura = s.nextFloat();
        float area = ((base*altura)/2);
        System.out.println("El area del triangulo es: "+area);
        s.close();
    }
}

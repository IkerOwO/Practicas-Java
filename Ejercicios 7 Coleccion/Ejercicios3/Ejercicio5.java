package Ejercicios3;
import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce la base: ");
        float base = s.nextFloat();
        System.out.print("Introduce la altura: ");
        float altura = s.nextFloat();
        if(base>altura && Math.abs(base%altura)==0){
            float area = (base*altura);
            System.out.println("El area del rectangulo es: "+area);
        } else{
            System.out.println("El area no se puede calcular");
        }
        s.close();
    }
}

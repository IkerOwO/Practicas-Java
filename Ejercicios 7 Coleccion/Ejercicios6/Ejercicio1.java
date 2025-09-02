package Ejercicios6;
import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero en binario: ");
        String binario = s.nextLine();
        if(binario.contains("0") && binario.contains("1")){
            int num = Integer.parseInt(binario, 2);
            System.out.println("El numero en binario "+binario+ " es: "+num);
            s.close();
        } else {
            System.out.println("El numero no esta en binario");
        }
    }   
}

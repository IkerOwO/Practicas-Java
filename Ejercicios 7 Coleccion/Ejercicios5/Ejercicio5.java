package Ejercicios5;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> num = new ArrayList<Integer>();
        int cont = 0;
        while(cont<3){
            System.out.print("Introduce un numero: ");
            int numS = s.nextInt();
            num.add(numS);
            cont+=1;
        }
        Collections.sort(num); // Ordenar de mayor a menor
        for(int i : num){
            System.out.println(i);
        }
        s.close();
    }
}

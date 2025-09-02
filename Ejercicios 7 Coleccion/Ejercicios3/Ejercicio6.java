package Ejercicios3;

public class Ejercicio6 {
    public static void main(String[] args){
        int num = 12;
        int cant = 0;
        for(int i=num;i>=1;i--){
            if(Math.abs(num%i)==0){
                System.out.println(i);
                cant+=1;
            }     
        }
        System.out.println("Cantidad de divisores: "+cant);
    }
}

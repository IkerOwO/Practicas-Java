package Ejercicios4;

public class Ejercicio1 {
    public static void main(String[] args){
        int num=12;
        int mult=1;
        for(int i=1;i<=num;i++){
            mult*=i;
        }
        System.out.println("El factorial de "+num +" es: "+mult);
    }
}

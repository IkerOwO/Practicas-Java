package Ejercicios3;

public class Ejercicio2 {
    public static void main(String[] args){
        int suma = 0;
        for(int i=1;i<=40;i++){
            if(!String.valueOf(i).contains("5")){
                suma+=i;
            }
        }
        System.out.println("La suma es: "+suma);
    }
}

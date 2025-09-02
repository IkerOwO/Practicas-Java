package Ejercicios2;

public class Ejercicio4 {
    public static void main(String[] args){
        for(int i=1;i<=200;i++){
            if(i%2==0 && !String.valueOf(i).contains("0")){ // Valor de i no contiene 0
                System.out.println(i);
            }
        }
    }
}

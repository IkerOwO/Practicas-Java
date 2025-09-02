package Ejercicios3;

public class Ejercicio1 {
    public static void main(String[] args){
        int suma = 0;
        for(int i=33;i<=66;i++){
            if (i%3== 0){
                suma+=i;
            }
        }
        System.out.println("La suma de los múltiplos de 3 entre 33 y 66 es: " + suma);
    }
}

package Ejercicios5;

public class Ejercicio3 {
    public static void main(String[] args){
        System.out.println("Bucle 1");
        for(int i=1;i<=20;i++){
            System.out.print(i+" ");
        }

        System.out.println();
        System.out.println("Bucle 2");
        int cont = 1;
        while(cont<=20){
            System.out.print(cont+" ");
            cont+=1;
        }

        System.out.println();
        System.out.println("Bucle 3");
        int cont2 = 1;
        do{
            System.out.print(cont2+" ");
            cont2+=1;
        } while(cont2<=20);
    }
}

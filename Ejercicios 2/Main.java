import java.util.Scanner;

public class Main{
    
    public static void Ejercicio1(){
    /*
        1. Realizar un programa que imprima todos los números de un rango de valores. El programa pedirá dos 
        números (el menor y el mayor) y llamará a un método auxiliar encargado de imprimir todos los que se 
        encuentren en su rango. 
    */
        System.out.println("Ejercicio 1");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero menor: ");
        int menor = s.nextInt();
        System.out.print("Introduce el numero mayor: ");
        int mayor = s.nextInt();
        printNumbers(menor, mayor);
        s.close();
    }
    public static void printNumbers(int menor, int mayor){
        for(int i=menor;i<=mayor;i++){
            System.out.println(i);
        }
    }

    public static void Ejercicio2(){
    /*
        2. Reutilizando el programa anterior escribir solo los números pares en el rango de valores. El método 
        auxiliar encargado de imprimir todos los valores que se encuentren en su rango tiene que hacer uso de 
        otra función llamada esPar(int num) que devolverá un booleano indicando si el número es par o no.  
    */
        System.out.println("Ejercicio 2");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce el numero menor: ");
        int menor = s.nextInt();
        System.out.print("Introduce el numero mayor: ");
        int mayor = s.nextInt();
        printNumbersEjer2(menor, mayor);
        s.close();
    }
    public static void printNumbersEjer2(int menor, int mayor){
        for(int i=menor;i<=mayor;i++){
            System.out.println(i);
            esPar(i);
        }
    }
    public static boolean esPar(int i){
        boolean par = true;
        if(i%2==0){
            System.out.println(par);
            return true;
        } else{
            par = false;
            System.out.println(par);
            return false;
        }
    }

    public static void Ejercicio3(){
        /*
        3. Realizar un programa que determine cuál es el mayor de dos números. El programa tendrá un método 
        mayor que recibirá dos valores de tipo entero y devolverá cual es el mayor. Desde el método main se 
        pedirá al usuario los valores y se llamará al método mayor. 
        */
        System.out.println("Ejercicio 3");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();
        CualEsMayor(num1, num2);
        s.close();
    }
    public static void CualEsMayor(int num1, int num2){
        if(num1>num2){
            System.out.print("El numero "+num1+ " es mayor que "+num2);
        } else{
            System.out.print("El numero "+num2+ " es mayor que "+num1);
        }
    }

    public static void Ejercicio4(){
        /*
        4. Repetir el ejercicio anterior con una versión que devuelva el mayor de tres números pero reutilizando 
        el método mayor de dos números. 
        */
        System.out.println("Ejercicio 4");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num1 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num2 = s.nextInt();
        System.out.print("Introduce otro numero: ");
        int num3 = s.nextInt();
        CualEsMayorEjer4(num1, num2, num3);
        s.close();
    }
    public static void CualEsMayorEjer4(int num1, int num2, int num3){
        if(num1>num2 && num1>num3){
            System.out.print("El numero "+num1+ " es mayor que "+num2+ " y que "+num3);
        } else if(num2>num1 && num2>num3){
            System.out.print("El numero "+num2+ " es mayor que "+num1+ " y que "+num3);
        } else if(num3>num1 && num3>num2){
            System.out.print("El numero "+num3+ " es mayor que "+num2+ " y que "+num1);
        }
    }

    public static void main(String[] args){
        Scanner m = new Scanner(System.in);
        System.out.print("Que ejercicio quieres ver (1-5): ");
        int opc = m.nextInt();
        switch (opc) {
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            default:
                break;
        }
        m.close();
    }
}
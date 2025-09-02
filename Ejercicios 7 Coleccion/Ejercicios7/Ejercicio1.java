package Ejercicios7;
import java.util.Scanner;

public class Ejercicio1 {
    public static int MAX_VALID_YR = 2200;
    public static int MIN_VALID_YR = 1500;

    public static boolean esBisiesto(int year) {
        return (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0));
    }

    public static boolean isValidDate(int d,int m,int y) {
        // Si no estan dentro del rango
        if (y > MAX_VALID_YR || y < MIN_VALID_YR)
            return false;
        if (m < 1 || m > 12)
            return false;
        if (d < 1 || d > 31)
            return false;

        // Febrero si es Bisiesto
        if (m == 2){
            if (esBisiesto(y))
                return (d <= 29);
            else
                return (d <= 28);
        }
        // Meses que tienen 30 o menos dias
        if (m == 4 || m == 6 || m == 9 || m == 11)
            return (d <= 30);
        return true;
    }

    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un dia (1-31): "); 
        int dia = s.nextInt();
        System.out.print("Introduce un dia (1-12): ");
        int mes = s.nextInt();
        System.out.print("Introduce un dia (1500-2200): ");
        int año = s.nextInt();
        System.out.println("Fecha Introducida: "+dia+"/"+mes+"/"+año);
        if (isValidDate(dia, mes, año)){
            System.out.println("Fecha valida");
        }else {
            System.out.println("Fecha NO valida");
        }
        s.close();
    }
}

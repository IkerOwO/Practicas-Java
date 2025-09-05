package Ejercicio7;
import java.util.Scanner;

/*7. Escribir un programa al que se le pasa un número de teléfono de la forma: 91-8885566. El programa 
deberá extraer el código de la comunidad y el resto del número, convertir el código de la comunidad 
en int y el resto en long, y presentarlo por pantalla
*/

public class Ejercicio7 {
  public static void main(String[] args){
    Scanner s = new Scanner(System.in);
    System.out.print("Introduce un numero de telefono de la siguiente forma(91-8885566): ");
    String num = s.nextLine();
    codigoComunidad(num);
    restoNumero(num);
    s.close();
  }

  /* Sacar codigo de la comunidad */
  public static void codigoComunidad(String num){
    String[] partes = num.split("-"); // Divide en ["91"-"8885566"]
    String prefijo = partes[0]; // El primer elemento es el prefijo
    System.out.println("Prefijo: " + "+"+Integer.parseInt(prefijo)); // Para convertir a INT
  }

  /* Resto del numero */
  public static void restoNumero(String num){
    String[] resto = num.split("-"); // Divide en ["91"-"8885566"]
    String restoNumero = resto[1]; // Lo demas es el resto del numero, sin contar el prefijo
    System.out.println("Resto del numero: "+ Long.parseLong(restoNumero)); // Para convertitr a Long

  }
}

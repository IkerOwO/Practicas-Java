package Ejercicio10;
import java.util.Scanner;
/*10. Crear un array de x posiciones, siendo x un número aleatorio entre 1 y 10. A continuación, rellenar 
dicho array con frases que solicitemos al usuario. Una vez creado el vector presentar el siguiente menú.

    1) Mostrar contenido vector
    2) Mostrar todo el contenido en minúsculas
    3) Mostrar todo el contenido en mayúsculas
    4) Mostrar el contenido, la primera letra  de cada palabra en mayúsculas
    5) Mostrar el número de vocales y de consonantes de cada texto en cada posición
    6) Mostrar el contenido más largo
    7) Salir 
*/
public class Ejercicio10 {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int randomNum = (int)Math.floor(Math.random()*10+1); // Numero random del 1 al 10
        String[] array = new String[randomNum]; // Array con las posiciones del numero random
        System.out.println(randomNum);
        for(int i=0;i<randomNum;i++){
            System.out.print("Introduce una frase: ");
            String frases = s.nextLine();
            array[i] = frases;
        }
        System.out.println("\n1) Mostrar contenido vector\r\n" + 
                        "2) Mostrar todo el contenido en minúsculas\r\n" + 
                        "3) Mostrar todo el contenido en mayúsculas\r\n" + 
                        "4) Mostrar el contenido, la primera letra de cada palabra en mayúsculas\r\n" + 
                        "5) Mostrar el número de vocales y de consonantes de cada texto en cada posición\r\n" + 
                        "6) Mostrar el contenido más largo\r\n" + 
                        "7) Salir ");
        System.out.print("Introduce una opcion: ");
        int opc = s.nextInt();
        switch (opc) {
            case 1:
                contenidoArray(array);
                break;
            case 2:
                contenidoMinusculas(array);
                break;
            case 3:
                contenidoMayusculas(array);
                break;
            case 4:
                primerLetra(array);
                break;
            case 5:
                mostrarVocCons(array);
                break;
            case 6:
                contenidoLargo(array);
                break;
            case 7:
            System.out.println("Saliendo del programa...");
                break;
        
            default:
            System.out.println("Opcion no valida");
                break;
        }
        s.close();
    }    
    public static void contenidoArray(String[] array){
        System.out.println("\nContenido del array:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Frase " + (i+1) + ": " + array[i]);
        }
    }
    public static void contenidoMinusculas(String[] array){
        System.out.println("\nContenido del array en minusculas:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Frase " + (i+1) + ": " + array[i].toLowerCase());
        }
    }
    public static void contenidoMayusculas(String[] array){
        System.out.println("\nContenido del array en mayusculas:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Frase " + (i+1) + ": " + array[i].toUpperCase());
        }
    }   
    public static void primerLetra(String[] array){
        for (int i=0;i<array.length;i++) {
        // Separamos la frase en palabras
            String[] palabras = array[i].split(" ");
            for (int j=0;j<palabras.length;j++) {
                if (!palabras[j].isEmpty()) { // evitar errores con espacios dobles
                    String primeraLetra = palabras[j].substring(0, 1).toUpperCase();
                    String resto = "";
                    if (palabras[j].length() > 1) {
                        resto = palabras[j].substring(1).toLowerCase(); 
                    }
                    palabras[j] = primeraLetra + resto;
                }
            }
            // Volvemos a unir las palabras en una frase
            array[i] = String.join(" ", palabras);
        }
        for (String frase : array) {
            System.out.println(frase);
        }
    }
    public static void mostrarVocCons(String[] array){
        int vocales = 0;
        int consonantes = 0;

        for (String palabra : array) {
                palabra = palabra.toLowerCase(); // para evitar problemas con mayúsculas
                for (int i = 0; i < palabra.length(); i++) {
                    char c = palabra.charAt(i);
                    if (Character.isLetter(c)) { // solo contamos letras
                        if ("aeiou".indexOf(c) != -1) {
                            vocales++;
                        } else {
                            consonantes++;
                        }
                    }
                }
            }
        System.out.println("El array contiene " + vocales + " vocales y " + consonantes + " consonantes.");
    }
    public static void contenidoLargo(String[] array){
        String max = "";
        for (int i = 0; i < array.length; i++) {
            // Separamos cada frase en palabras
            String[] palabras = array[i].split(" ");
            for (int j = 0; j < palabras.length; j++) {
                if (palabras[j].length() > max.length()) {
                    max = palabras[j]; // actualizamos si encontramos una más larga
                }
            }
        }
        System.out.println("La palabra más larga de todo el array es '" + max + "' con una longitud de " + max.length() + " caracteres");
    }
}

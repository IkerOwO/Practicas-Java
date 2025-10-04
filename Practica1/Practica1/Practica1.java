package Practica1;
import java.util.Arrays;
import java.util.Scanner;
/*
    1. Debe contener al menos una letra mayúscula. -> Hecho
    2. Debe contener al menos una letra minúscula. -> Hecho
    3. Debe contener al menos un dígito (0-9). -> Hecho
    4. Debe contener al menos un carácter entre los siguientes: * + - _ # $ % & -> Hecho
    5. No  se  considerarán  caracteres  válidos  las  vocales  con  tilde  o  diéresis,  ya  sean 
    mayúsculas o minúsculas, así como cualquier otro no incluido expresamente en 
    las reglas anteriores. -> Hecho
    6. No puede contener espacios en blanco. -> Hecho
    7. La longitud de la contraseña no puede ser inferior a 8 caracteres. -> Hecho
 */

public class Practica1{
    public static void main(String[] args){
        String[] charPermitidos = {"*","+","-","_","#","$","%","&"};
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Introduce una contraseña: ");
            String pass = s.next();
            // Comprobar si contiene el array de charPermitidos
            boolean contains = Arrays.stream(charPermitidos).anyMatch(pass::contains);
            if(pass.matches(".*[A-Z].*") // Tiene Mayusculas
            && pass.matches(".*[a-z].*") // Tiene Minusculas
            && pass.matches(".*[0-9].*") // Tiene Numeros
            && contains // Contiene el array de charPermitidos
            && pass.length() >= 8 // Tiene mas de 8 caracteres
            && !pass.contains(" ") // No tiene espacios en blanco
            && !pass.matches(".*[áéíóúÁÉÍÓÚ].*")) // No tiene tildes en mayusculas ni en minusculas
            {
                System.out.println("Contraseña válida");
            } else {
                System.out.println("Error creando la contraseña");
            }
             s.close();
        } catch (Exception e) {
            System.out.println(e);
        } 
    }
}
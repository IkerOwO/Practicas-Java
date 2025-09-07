package Ejercicio1;
import listas.*;
/*Ejercicio 1 
Crea  la  clase  “Producto”  dentro  del  paquete  “listas”,  teniendo  en  cuenta  que  se 
deberá guardar el código, nombre, tipo, precio y existencias de este.  Crea los métodos getters/setters de todos los atributos
*/

public class Ejercicio1{
    public static void main(String[] args){
        Productos producto = new Productos(12342, "Zapatillas", "Deportivas", 55.99, 10);
        producto.Mostrar();
    }
}
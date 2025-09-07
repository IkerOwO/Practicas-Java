package Ejercicio4;
import listas.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Probar_lista {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Productos> listaProductos = new ArrayList<>();
        while(true){
            System.out.print("Codigo: ");
            int codigo = s.nextInt();
            if(codigo == 0){
                break;
            }             
            System.out.print("Nombre: ");
            String nombre = s.next();
            System.out.print("Tipo: ");
            String tipo = s.next();
            System.out.print("Precio: ");
            double precio = s.nextDouble();
            System.out.print("Existencias: ");
            int existencias = s.nextInt();
            Productos producto = new Productos(codigo, nombre, tipo, precio, existencias);
            listaProductos.add(producto);
        } // End while
        /* Imprimir el array */
        for (Productos p : listaProductos) {
            p.Mostrar();
            System.out.println("----------------------");
        }
        s.close();
    }
}

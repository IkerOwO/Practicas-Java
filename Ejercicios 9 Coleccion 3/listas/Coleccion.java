package listas;
import java.util.ArrayList;

/*
Crea la clase “Colección” dentro del paquete “listas”  la  cual  tiene  un  arrayList  de 
Productos (atributos lista). Para esta clase implementa los métodos: 
- Devolver el tamaño de una lista 
- Recibe un objeto Producto y lo incorpora a la lista 
- Recibe  un  número  entero  con  la  posición  del  producto que quiere eliminar de la lista 
- Recibe un número entero y devuelve el producto de dicha posición 
*/

public class Coleccion {
    static final ArrayList<Productos> Listproductos = new ArrayList<>();
    /* Devolver tamaño */
    public static void devolverSize(ArrayList<String> productos){
        System.out.println(productos.size());
    }
    /* Recibir un objeto e incorporarlo */
    public static void recibirProducto(int codigo, String nombre, String tipo, double precio, int exist){
        Productos productos = new Productos(codigo, nombre, tipo, precio, exist);
        Listproductos.add(productos);
    }
    /* Recibir un numero con la posicion del producto que se quiere borrar */
    public static void borrarProducto(int borrar){
        Listproductos.remove(borrar);
    }
    /* Recibir un numero entero y devolver producto de esa posicion */
    public static void devolverProducto(int product){
        Listproductos.get(product);
    }
    /* Aumentar el precio un 10% */
    public static void aumentarPrecio(double precio){
        double percentual = 10.0 / 100.0; 
        double valorFinal = precio + (percentual * precio);
        System.out.println("El precio es: "+valorFinal);
    }
}

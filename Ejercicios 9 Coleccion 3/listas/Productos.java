package listas;

public class Productos {
    private int p_codigo;
    private String p_nombre;
    private String p_tipo;
    private double p_precio;
    private int p_existencias;

    public Productos(int codigo, String nombre, String tipo, double precio, int existencias){
        p_codigo = codigo;
        p_nombre = nombre;
        p_tipo = tipo;
        p_precio = precio;
        p_existencias = existencias;
    }
    // GETTERS
    public int codigo(){
        return p_codigo;
    }
    public String nombre(){
        return p_nombre;
    }
    public String tipo(){
        return p_tipo;
    }
    public double precio(){
        return p_precio;
    }
    public int existencias(){
        return p_existencias;
    }
    public double aumentarPrecio(){
        double percentual = 10.0 / 100.0; 
        double valorFinal = p_precio + (percentual * p_precio);
        return valorFinal;
    }
    // MOSTRAR
    public void Mostrar(){
        System.out.println("El codigo del producto es: "+p_codigo);
        System.out.println("El nombre del producto es: "+p_nombre);
        System.out.println("El Tipo de producto es: "+p_tipo);
        System.out.println("El precio del producto es: "+aumentarPrecio());
        System.out.println("Las existencias del producto son: "+p_existencias);
    }

    // SETTERS
    public void setCodigo(int codigo){
        p_codigo = codigo;
    }
    public void setNombre(String nombre){
        p_nombre = nombre;
    }
    public void setTipo(String tipo){
        p_tipo = tipo;
    }
    public void setPrecio(double precio){
        p_precio = precio;
    }
    public void setExistencias(int existencias){
        p_existencias = existencias;
    }

}

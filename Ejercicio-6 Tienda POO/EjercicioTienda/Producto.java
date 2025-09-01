package EjercicioTienda;

public class Producto {
    private final int id;             
    private final String nombre;
    private final int precioCent;     
    private int cantidad;            

    public Producto(int id, String nombre, int precioCent) {
        this.id = id;
        this.nombre = nombre;
        this.precioCent = precioCent;
        this.cantidad = 0;
    }

    public void addUnidades(int unidades) {
        if (unidades < 0) throw new IllegalArgumentException("Unidades negativas");
        this.cantidad += unidades;
    }

    public long getImporteCent() {
        return (long) cantidad * (long) precioCent;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public int getPrecioCent() { return precioCent; }
    public int getCantidad() { return cantidad; }
}

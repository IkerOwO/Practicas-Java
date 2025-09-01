package EjercicioTienda;

public class Tienda {
    private final String nombre;

    public Tienda(String nombre) {
        this.nombre = (nombre == null ? "" : nombre.trim());
    }

    public String getNombre() { return nombre; }
}
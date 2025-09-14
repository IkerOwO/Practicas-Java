package empleados;

public class Empresa {
    private String e_cif;
    private String e_nombre;

    public Empresa(String cif, String nombre){
        e_cif = cif;
        e_nombre = nombre;
    }

    /* GETTERS */
    public String getNombre(){
        return e_nombre;
    }
    public String getCif(){
        return e_cif;
    }

    /* SETTERS */
    public void setNombre(String nombre){
        e_nombre = nombre;
    }
    public void setCif(String cif){
        e_cif = cif;
    }

    /* TO STRING */
    @Override
    public String toString(){
        return "Empresa{" +
                "Nombre='" + e_nombre + '\'' +
                "Cif='" + e_cif + '\'' +
                '}';
    }

}

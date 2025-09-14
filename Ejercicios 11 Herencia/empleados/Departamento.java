package empleados;
import java.util.ArrayList;

public class Departamento {
    ArrayList<Empleado> empleados = new ArrayList<>();
    private Empresa d_empresa;
    private String d_id;
    private String d_localizacion;
    private String d_nombre;
    
    public Departamento(Empresa empresa, String id, String localizacion, String nombre){
        d_empresa = empresa;
        d_id = id;
        d_localizacion = localizacion;
        d_nombre = nombre;
    }

    public void altaEmpleado(Empleado empleado){
        empleados.add(empleado);
    }
    public void bajaEmpleado(Empleado empleado){
        empleados.remove(empleado);
    }

    /* GETTERS */
    public ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    public Empresa getEmpresa(){
        return d_empresa;
    }
    public String getId(){
        return d_id;
    }
    public String getLocalizacion(){
        return d_localizacion;
    }
    public String getNombre(){
        return d_nombre;
    }

    /* SETTERS */
    public void setEmpresa(Empresa empresa){
        d_empresa = empresa;
    }
    public void setId(String id){
        d_id = id;
    }
    public void setLocalizacion(String localizacion){
        d_localizacion = localizacion;
    }
    public void setNombre(String nombre){
        d_nombre = nombre; 
    }

    /* TO STRING */
    @Override
    public String toString(){
        return "Departamento{" +
                "Empresa='" + d_empresa + '\'' +
                "Nombre='" + d_nombre + '\'' +
                ", Id='" + d_id + '\'' +
                ", Localizacion='" + d_localizacion + '\'' +
                '}';
    }
}

package empleados;

public class Empleado {
    private String e_cargo;
    private Departamento e_departamento;
    private double e_sueldo;

    public Empleado(String cargo, Departamento departamento, double sueldo){
        e_cargo = cargo;
        e_departamento = departamento;
        e_sueldo = sueldo;
    }

    /* GETTERS */
    public String getCargo(){
        return e_cargo;
    }
    public Departamento getDepartamento(){
        return e_departamento;
    }
    public double getSueldo(){
        return e_sueldo;
    }

    /* SETTERS */
    public void setCargo(String cargo){
        e_cargo = cargo;
    }
    public void setDepartamento(Departamento departamento){
        e_departamento = departamento;
    }
    public void setSueldo(double sueldo){
        e_sueldo = sueldo;
    }

    /* TO STRING */
    @Override
    public String toString(){
        return "Empleado{" +
                "Cargo='" + e_cargo + '\'' +
                ", Departamento='" + e_departamento + '\'' +
                ", Sueldo='" + e_sueldo + '\'' +
                '}';
    }
}

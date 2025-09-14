import empleados.*;

public class Main{
    public static void main(String[] args){
        Empresa empresa = new Empresa("45059445E", "Indra");
        Departamento dep1 = new Departamento(empresa, "405E", "Madrid", "Informatica");
        Departamento dep2 = new Departamento(empresa, "404A", "Barcelona", "Personal");
        Empleado emp1 = new Empleado("Junior Dev", dep1, 1200.50);
        Empleado emp2 = new Empleado("Senior Dev", dep1, 1500.99);
        Empleado emp3 = new Empleado("Atencion al cliente", dep2, 1140.45);

        emp1.getDepartamento();
        emp2.getCargo();
        emp3.getSueldo();
    }
}
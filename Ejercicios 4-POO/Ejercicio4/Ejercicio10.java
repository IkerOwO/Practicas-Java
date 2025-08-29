package Ejercicio4;

public class Ejercicio10 {
    public static void main(String[] args) {
        Persona persona1 = new Persona("Jose", "Martinez-Gomez", "Rodriguez", "27354650E", "Profesor", 80);
        Persona persona2 = new Persona("Juan", "Perez", "Rodriguez", "27354658A", "Carpintero", 56);
        Persona[] personas = {persona1, persona2};

        // Array de profesiones
        String[] profesiones = {"Profesor", "Medico", "Programador", "Carpintero"};

        // Filtrar
        Persona[] filtradas = Persona.trabajaEnSector(personas, profesiones);

        // Mostrar
        for (Persona p : filtradas) {
            System.out.println(
                p.Nombre() + " " + p.Apellido1() + " " + p.Apellido2() +
                " - " + p.Profesion() + " - DNI: " + p.Dni()
            );
        }
    }
}


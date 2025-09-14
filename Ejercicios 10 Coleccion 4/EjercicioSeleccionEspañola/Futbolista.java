package EjercicioSeleccionEspañola;

public class Futbolista{
    public String f_nombre;
    public int f_posicion;
    public int f_dorsal;
    public String f_equipo;
    public int f_edad;
    public int f_goles;
    public int f_minutos;

    public Futbolista(String nombre, int posicion, int dorsal, String equipo, int edad, int goles, int minutos){
        f_nombre = nombre;
        f_posicion = posicion; // 1:portero, 2:defensa, 3:centrocampista, 4:delantero 
        f_dorsal = dorsal;
        f_equipo = equipo;
        f_edad = edad;
        f_goles = goles;
        f_minutos = minutos;
    }

    /* GETTERS */
    public String nombre(){
        return f_nombre;
    }
    public int posicion(){
        return f_posicion;
    }
    public int dorsal(){
        return f_dorsal;
    }
    public String equipo(){
        return f_equipo;
    }
    public int edad(){
        return f_edad;
    }
    public int goles(){
        return f_goles;
    }
    public int minutos(){
        return f_minutos;
    }

    /* MOSTRAR */
    public void getFutbolista(){
        System.out.println("//////////////////////////////////////");
        System.out.println("El nombre es del jugador es: "+f_nombre);
        System.out.println("La posicion es: "+f_posicion);
        System.out.println("El dorsal es: "+f_dorsal);
        System.out.println("El equipo es: "+f_equipo);
        System.out.println("La edad del jugador es: "+f_edad);
        System.out.println("El numero de goles es: "+f_goles);
        System.out.println("Los minutos jugados: "+f_minutos);
        System.out.println("////////////////////////////////");
    }

    /* SETTERS */
    public void setNombre(String nombre){
        f_nombre = nombre;
    }
    public void setPosicion(int posicion){
        f_posicion = posicion;
    }
    public void setDorsal(int dorsal){
        f_dorsal = dorsal;
    }
    public void setEquipo(String equipo){
        f_equipo = equipo;
    }
    public void setEdad(int edad){
        f_edad = edad;
    }
    public void setGoles(int goles){
        f_goles = goles;
    }
    public void setMinutos(int minutos){
        f_minutos = minutos;
    }
}
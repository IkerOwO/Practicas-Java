package EjercicioCompeticionSalto;

public class Jugador {
    public String j_nombre;
    public int j_dorsal;
    public int j_posicion;

    public Jugador(String nombre, int dorsal, int posicion){
        j_nombre = nombre;
        j_dorsal = dorsal;
        j_posicion = posicion;
    }

    /* GETTERS */
    public String nombre(){
        return j_nombre;
    }
    public int dorsal(){
        return j_dorsal;
    }
    public int posicion(){
        return j_posicion;
    }

    /* MOSTRAR */
    public void Mostrar(){
        System.out.println(j_nombre+" Posicion: "+j_posicion+" numero de dorsal: "+j_dorsal);
    }

    @Override
    public String toString() {
        return "Nombre: " + j_nombre + ", Posición: " + j_posicion+" Dorsal: "+j_dorsal;
    }

    /* SETTERS */
    public void setName(String nombre){
        j_nombre = nombre;
    }
    public void setDorsal(int dorsal){
        j_dorsal = dorsal;
    }
    public void setPosicion(int posicion){
        j_posicion = posicion;
    }
}

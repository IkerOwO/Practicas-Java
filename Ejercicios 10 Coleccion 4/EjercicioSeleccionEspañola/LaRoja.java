package EjercicioSeleccionEspañola;
import java.util.ArrayList;

public class LaRoja {
    public static void main(String[] args){
        ArrayList<Futbolista> posiciones = new ArrayList<>();
        /* Porteros */
        Futbolista futbolista1 = new Futbolista("Iker Casillas", 1, 1, "Real Madrid", 31, 1, 570);
        Futbolista futbolista2 = new Futbolista("Jose Manuel Reina", 1, 23, "Liverpool", 29, 0, 0);
        /* Defensas */
        Futbolista futbolista3 = new Futbolista("Sergio Ramos", 2, 15, "Real Madrid", 26, 0, 570);
        Futbolista futbolista4 = new Futbolista("Jordi Alba", 2, 18, "Barcelona", 23, 1, 570);
        Futbolista futbolista5 = new Futbolista("Alvaro Arbeloa", 2, 17, "Real Madrid", 27, 0, 570);
        /* CM */
        Futbolista futbolista6 = new Futbolista("Xabi Alonso", 3, 14, "Real Madrid", 26, 2, 570);
        Futbolista futbolista7 = new Futbolista("Juan Mata", 3, 13, "Chelsea", 23, 1, 3);
        Futbolista futbolista8 = new Futbolista("David Silva", 3, 21, "Man. City", 31, 2, 570);
        /* Delanteros */
        Futbolista futbolista9 = new Futbolista("Fernando Torres", 4, 9, "Chelsea", 28, 3, 570);
        Futbolista futbolista10 = new Futbolista("Negredo", 4, 11, "Sevilla", 26, 0, 55);
        
        /* Añadir al Arraylist */
        posiciones.add(futbolista1);
        posiciones.add(futbolista2);
        posiciones.add(futbolista3);
        posiciones.add(futbolista4);
        posiciones.add(futbolista5);
        posiciones.add(futbolista6);
        posiciones.add(futbolista7);
        posiciones.add(futbolista8);
        posiciones.add(futbolista9);
        posiciones.add(futbolista10);

        /* Mostrar ArraList */
    /*  for (Futbolista i : posiciones) {
            System.out.println(i);
        }
    */

        /* Max Goleador */
        Futbolista maxGoleador = null;
        for (Futbolista f : posiciones) {
            if (f.posicion() != 1) { 
                if (maxGoleador == null || f.goles() > maxGoleador.goles()) {
                    maxGoleador = f;
                }
            }
        }

        if (maxGoleador != null) {
            System.out.println("Datos del Maximo Goleador");
            maxGoleador.getFutbolista();
        } else {
            System.out.println("No hay jugadores (que no sean porteros) con goles.");
        }

    }
}

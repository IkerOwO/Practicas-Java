package Ejercicio2y3;

import Ejercicio1.Localidad;

public class Main {

    public static void main(String[] args){
        /* Ejercicio 1 */
        Localidad ejercicio1 = new Localidad("Zaragoza", "Zaragoza", 6000, 760, 5000, 124);
        ejercicio1.mostrar();

        /* Ejercicio 2 */
        Localidad ejercicio2 = new Localidad("Madrid", "Madrid", 40000, 2000, 1200, 506);
        ejercicio2.mostrar();

        if(ejercicio1.tieneMasPoblacion(ejercicio2)){
            System.out.println(ejercicio1.Nombre()+" tiene mas poblacion que "+ejercicio2.Nombre());
        } else if(ejercicio2.tieneMasPoblacion(ejercicio1)){
            System.out.println(ejercicio2.Nombre()+" tiene mas poblacion que "+ejercicio1.Nombre());
        }
        /* Ejercicio 3 */
        System.out.println("La Densidad de poblacion de "+ejercicio1.Nombre()+ " es "+ejercicio1.densidadDePoblacion());
    }
}

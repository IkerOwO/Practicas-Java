package Ejercicio1;
        /*    Ejercicio 1
        Crea una clase Localidad con los siguientes atributos: nombre, provincia, numHabitantes,
        distanciaACapital, superficie, rentaPerCapita.

        Los atributos deben ser privados y declarados del tipo que consideres más conveniente 
        para cumplir la función que se intuye por su nombre.

        También debe tener métodos para poder asignar valor y obtenerlo de sus atributos, 
        así como un constructor que reciba por parámetros los datos de los atributos.

        Crea un objeto de esa clase, asígnale valores a sus atributos y muestra algunos de 
        ellos por pantalla.

        Ejercicio 2
        Codifica el método tieneMasPoblacion  de la clase Localidad que comprueba si un objeto 
        de esa clase tiene más población que el objeto Localidad que recibe por parámetro. 
        El resultado será un valor lógico. Declara varios objetos para probar el método.

        Ejercicio 3
        Codifica el método densidadDePoblacion  de la clase Localidad que calcula la densidad 
        de población. El resultado será un valor numérico. Declara varios objetos para probar 
        el método.

     */
        public class Localidad{
            private String n_nombre;
            private String n_provincia;
            private float n_numHabitantes;
            private float n_distanciaACapital;
            private float n_superficie;
            private float n_rentaPerCapita;

            public Localidad(String nombre, String provincia, float numHabitantes, float distanciaACapital, float superficie, float rentaPerCapita){
                n_nombre = nombre;
                n_provincia = provincia;
                n_numHabitantes = numHabitantes;
                n_distanciaACapital = distanciaACapital;
                n_superficie = superficie;
                n_rentaPerCapita = rentaPerCapita;
            }

            // GETTERS
            public String Nombre(){
                return n_nombre;
            }
            public String Provincia(){
                return n_provincia;
            }
            public float NumHabitantes(){
                return n_numHabitantes;
            }
            public float DistanciaCapital(){
                return n_distanciaACapital;
            }
            public float Superficie(){
                return n_superficie;
            }
            public float RentaPerCapita(){
                return n_rentaPerCapita;
            }
            public boolean tieneMasPoblacion(Localidad other){
                return NumHabitantes() > other.NumHabitantes(); 
            }
            public float densidadDePoblacion() {
                return NumHabitantes() / Superficie();
            }

            public void mostrar(){
                System.out.println("El nombre es: "+Nombre());
                System.out.println("La provincia es: "+Provincia());
                System.out.println("El numero de habitantes es: "+NumHabitantes());
                System.out.println("La distancia a la capital: "+DistanciaCapital());
                System.out.println("La superficie: "+Superficie());
                System.out.println("La renta per capita: "+RentaPerCapita());
            }

            // SETTERS
            public void setNombre(String nombre){
                n_nombre = nombre ;
            }
            public void setProvincia(String provincia){
                n_provincia = provincia;
            }
            public void setHabitantes(float habitantes){
                n_numHabitantes = habitantes;
            }
            public void setDistancia(float distancia){
                n_distanciaACapital = distancia;
            }
            public void setSuperficie(float superficie){
                n_superficie = superficie;
            }
            public void setRenta(float rentaPerCapita){
                n_rentaPerCapita = rentaPerCapita;
            }
        }

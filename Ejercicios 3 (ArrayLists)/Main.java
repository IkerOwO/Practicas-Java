import java.util.Scanner;
import java.util.ArrayList;

/* Ejemplo de un ArrayList
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
 */

public class Main{

    public static void Ejercicio1(){
        /*1.- Crear un ArrayList de palabras, luego mostrarlo.*/
        ArrayList<String> palabras = new ArrayList<String>();
        palabras.add("Hola");
        palabras.add("Perro");
        palabras.add("Gato");
        palabras.add(":3");
        for(int i=0;i<palabras.size();i++){
            System.out.println(palabras.get(i));
        }
    }

    public static void Ejercicio2(){
        /*2.- Almacenar en un ArrayList los números del 0 al 9.*/
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        for(int i=0;i<=9;i++){
            numeros.add(i);
        }
        for(int i=0;i<numeros.size();i++){
            System.out.println(numeros.get(i));
        }
    }

    public static void Ejercicio3(){
        /*3.- Leer una línea en la que se recogerán separados por espacios, cantidades que representan dinero, termina 
        en 0 Guardar estas cantidades en un ArrayList (cajero) 
        250  420  580  120  235  638  1850  0  
        */
        Scanner s = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int cont = 0;
        while(cont <= 5) {
            System.out.print("Introduce cantidades por favor (acabadas en cero): ");
        // se asume que el 0 siempre es el último valor de la secuencia
            for (String cantidad : s.nextLine().trim().split(" ")) {
                if (!cantidad.equals("0")) {
                    numeros.add(Integer.parseInt(cantidad)); 
                }
            }
            cont+=1;
        }
        System.out.println("Lista de cantidades:");
        int indice = 0;
        for (Integer cantidad : numeros) {
            System.out.println("Cantidad #" + ((indice++) + 1) + ": " + cantidad); // Indice++ es para que salga al lado de cantidad el numero 1, 2, 3...
        }
        s.close();
    }

    public static void Ejercicio4(){
        /*4.- Leer una lista de números hasta introducir -1, se introducirá uno por línea. 
        1 
        13 
        5 
        150 
        1326 
        824 
        Guardar las entradas en un ArrayList. (centro numérico) 
        */
        Scanner n = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int ListNumeros = 0;
        while(true){
            System.out.print("Introduce un numero mayor que -1: ");
            int num = n.nextInt();
            if(num<=-1){
                System.out.println("Numero negativo detectado...\nArrayList:");
                break;
            }
            ListNumeros = num;
            numeros.add(ListNumeros);
        }
        // Bucle para imprimir el ArrayList
        for(int i=0; i<numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
        n.close();
    } 

    public static void Ejercicio5(){
        /*    
        5.- Leer por teclado un valor numérico que representa la cantidad de luchadores (L) de un campeonato. A continuación se 
        procesarán L líneas que van a contener 2 números que indican peso en gramos y altura en centímetros de cada participante. 
        
        5 
        54000 1700 
        45000 1680 
        63000 1800 
        61000 1690 
        73000 1900 
        
        Guardar las entradas de peso y altura en un ArrayList. Procesa a continuación todo el ArrayList para extraer 
        de cada línea el peso y la altura.
    */
        Scanner s = new Scanner(System.in);
        /* Creamos la clase luchador */
        class Luchador {
        int peso;
        int altura;

        Luchador(int peso, int altura) {
            this.peso = peso;
            this.altura = altura;
        }
    }
        /* Hacemos el ArrayList */
        ArrayList<Luchador> luchadores = new ArrayList<>();
        
        System.out.print("Cuantos luchadores son: ");
        int numLuch = s.nextInt();
        for (int i = 0; i < numLuch; i++) {
            System.out.print("Peso en gramos: ");
            int numPeso = s.nextInt();
            System.out.print("Altura en CM: ");
            int numAltura = s.nextInt();
            luchadores.add(new Luchador(numPeso, numAltura));
    }
        for (Luchador l : luchadores) {
            System.out.println(l.peso + ";" + l.altura);
        }
        s.close();
    }


    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.print("Que ejercicio quieres ver (1-5): ");
        int opc = s.nextInt();
        switch (opc) {
            case 1:
                Ejercicio1();
                break;
            case 2:
                Ejercicio2();
                break;
            case 3:
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5:
                Ejercicio5();
                break;
        
            default:
                break;
        }
        s.close();
    }
}
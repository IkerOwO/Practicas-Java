package EjercicioCompeticionSalto;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class Competicion {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        ArrayList<Jugador> jugadorArray = new ArrayList<>(); // ArrayList
        int end = 0;
        do{
            System.out.println("1- Inscribir un participante. \r\n" + //
                        "2- Borrar un participante. \r\n" + //
                        "3- Mostrar listado de participantes. \r\n" + //
                        "4- Mostrar listado de participantes ordenados por dorsal. \r\n" + //
                        "5- Finalizar el programa. ");
            System.out.print("Selecciona un opcion: ");
            int opc = s.nextInt(); 
            switch(opc){ 
            case 1:
                System.out.print("Introduce el nombre del participante: ");
                String nombre = s.next();
                System.out.print("Introduce el dorsal de "+nombre+": ");
                int dorsal = s.nextInt();
                System.out.print("Introduce la posicion de "+nombre+": ");
                int pos = s.nextInt();
                Jugador jugador = new Jugador(nombre, dorsal, pos); // Agregar a la instancia de Jugador
                jugadorArray.add(jugador); // Agregar al ArrayList 
                break; 
                
            case 2: 
                System.out.print("Introduce el dorsal del jugador al que quiere borrar: ");
                int eliDorsal = s.nextInt();
                String dorsalExists = Integer.toString(eliDorsal); 
                if(dorsalExists.isEmpty()){
                        System.out.println("El jugador con el dorsal "+eliDorsal+" no existe");
                } else{
                    jugadorArray.removeIf(p->eliDorsal==p.dorsal());
                    System.out.println("Se ha eliminado correctamente al jugador");   
                }
                
                break; 
                
            case 3: 
                if (jugadorArray.isEmpty()) {
                        System.out.println("No hay participantes inscritos.");
                } else {
                        System.out.println("Listado de participantes:");
                        for (Jugador j : jugadorArray) {
                        System.out.println(j);
                        }
                }
                break; 
                
            case 4: 
                jugadorArray.sort(Comparator.comparing(Jugador::dorsal));
                for (Jugador j : jugadorArray) {
                    System.out.println("Dorsal: " + j.dorsal() + ", Nombre: " + j.nombre());
                }
                break; 
            case 5: 
                System.out.println( "FIN DE LA APLICACIÓN."); 
                end+=1;
                break;  
            default: 
                    
        } 
            }while(end==0);
        s.close();
    }    
}

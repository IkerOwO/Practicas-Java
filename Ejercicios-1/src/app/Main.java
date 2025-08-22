import java.util.Scanner;

public class Main{

    public static void Ejercicio1(){
    /*
        1. LEER UN Nº Y MOSTRAR SU CUADRADO, REPETIR ESTE PROCESO HASTA QUE EL  USUARIO 
        INTRODUZCA UN NUMERO NEGATIVO.
    */
        System.out.println("Ejercicio 1:");
        Scanner n = new Scanner(System.in);
        while(true){
            System.out.print("Introduce un numero: ");
            int num = n.nextInt();
            if(num < 0){
                System.out.print("Numero negativo detectado...\nSaliendo del programa ");
                break;
            } else
            System.out.println("El cuadrado de "+num +" es igual a: "+num*num);
        }
        n.close();
    }

    public static void Ejercicio2(){
    /*
        2. PEDIR NUMEROS AL USUARIO, INDICAR  SI ES PAR O IMPAR. SE PARA DE PEDIR NUMEROS  
        CUANDO INTRODUZCA UN CERO.
    */
        System.out.println("Ejercicio 2:");
        Scanner j = new Scanner(System.in);
        while(true){
            System.out.print("Introduce un numero: ");
            int num = j.nextInt();
            if(num == 0){
                break;
            } else
            if(num%2 == 0){
                System.out.println("El numero "+num+" es Par");
            } else if (num%2 != 0) {
                System.out.println("El numero "+num+" es Impar");
            }
        }
        j.close();
    }

    public static void Ejercicio3(){
    /*
        3. PEDIR NUMS AL USUARIO HASTA QUE INTRODUZCA  NUM NEGATIVO. MOSTRAR CUÁNTOS NUMS 
        SE HAN INTRODUCIDO,   LA SUMA DE TODOS ELLOS Y EL PROMEDIO.
    */
        System.out.println("Ejercicio 3:");
        Scanner i = new Scanner(System.in);
        int numeros = 0;
        int sumaSecuencia = 0;
        while(true){
            System.out.print("Introduce un numero: ");
            int numero = i.nextInt();
            numeros+=1;
            sumaSecuencia += numero;
            if(numero < 0){
                numeros-=1; // Para que no cuente el numero negativo
                System.out.println("El total de numeros enteros es: "+numeros);
                System.out.println("La suma de todos ellos es: "+sumaSecuencia);
                System.out.println("El promedio es: "+sumaSecuencia/numeros);
                break;
            }
        }
        i.close();
    }

    public static void Ejercicio4(){
    /*
        4. PEDIR UN NUMERO N Y MOSTRAR TODOS LOS NUMEROS DEL 1 HASTA N.
    */
    System.out.println("Ejercicio 4");
    Scanner x = new Scanner(System.in);
    System.out.print("Introduce un numero: ");
    int num = x.nextInt();
    for(int i=1; i<=num;i++){
        System.out.println(i);
    }
    x.close();
    }

    public static void Ejercicio5(){
    /*
        5. ESCRIBIR TODOS LOS NUMEROS DEL 100 AL 0 DE 7 EN 7.
    */
        System.out.println("Ejercicio 5");
        for(int i=100;i>=0;i-=7){ // Vamos quitando 7 al bucle
            System.out.println(i);
        }
    }

    public static void Ejercicio6(){
    /*
        6. PEDIR 10 NUMEROS. MOSTRAR LA MEDIA DE LOS NUMEROS POSITIVOS  LA MEDIA DE LOS 
        NUMEROS NEGATIVOS Y LA CANTIDAD DE CEROS.
    */
        System.out.println("Ejercicio 6");
        Scanner q = new Scanner(System.in);
        int numerosPos = 0;
        int numerosNeg = 0;
        int ceros = 0;
        int contador = 0;
        while(true){
            System.out.print("Dame un numero: ");
            int num = q.nextInt();
            contador+=1;
            if(num > 0){
                numerosPos += num;
            } else if(num < 0){
                numerosNeg += num;
            } else if(num == 0){
                ceros+=1;
            }
            if (contador >= 10) {
                System.out.println("La media de los numeros positivos es: "+numerosPos/10);
                System.out.println("La media de los numeros negativos es: "+numerosNeg/10);
                System.out.println("La cantidad de ceros es: "+ceros);
                break;
            }   
        }
        q.close();
    }

    public static void Ejercicio7(){
    /*
        7. PEDIR UN Nº DEL 0 AL 10 Y MOSTRAR SU TABLA DE MULTIPLICAR
    */
        System.out.println("Ejercicio 7");
        Scanner r = new Scanner(System.in);
        System.out.print("Dame un numero del 1 al 10: ");
        int num = r.nextInt();
        for(int i=0;i<=10;i++){
            System.out.println(i+" * "+num +" = " +i*num);
        }
        r.close();
    }

    public static void Ejercicio8(){
    /*
        8. Una empresa que se dedica a la venta de desinfectantes  necesita un programa para 
        gestionar las facturas.  En cada factura figura: el código del artículo, la cantidad 
        vendida en litros y el precio por litro.
        
        - Se pide de 5 facturas introducidas: Facturación total, cantidad en litros  
        vendidos del artículo 1 y cuantas facturas se emitieron de más de 600 €.    
    */
        System.out.println("Ejercicio 8");
        Scanner y = new Scanner(System.in);
        int factTotal = 0;
        int fact600 = 0;
        int litrosTot = 0;
        int contador = 0;
        while(contador <= 5){
            System.out.print("Codigo de articulo (1-100): ");
            int codArt = y.nextInt();
            System.out.print("Cantidad vendida en litros: ");
            int cant = y.nextInt();
            if(codArt == 1){
                litrosTot += cant;
            }
            System.out.print("Precio por litro: ");
            float precio = y.nextFloat();
            factTotal += precio;
            if(factTotal > 600){
                fact600 += 1;
            }
            if(contador>5){
                System.out.println("Facturacion total: "+factTotal);
                System.out.println("Cantidad de litros del articulo 1: "+litrosTot);
                System.out.println("Facturas de mas de 600 euros: "+fact600);
            }
        }
        y.close();
    }

    public static void Ejercicio9(){
    /*
        9. Igual que el anterior pero suponiendo que no se introduce el precio por litro. 
        Solo existen tres productos con precios:
            
        1.- 0,6 €/litro, 2- 3 €/litro y 3- 1,25 €/litro.
    */
     System.out.println("Ejercicio 9");
        Scanner b = new Scanner(System.in);
        int factTotal = 0;
        int fact600 = 0;
        int litrosTot = 0;
        double art1l = 0.6;
        int art2l = 3;
        double art3l = 1.25;
        int contador = 0;
        while(contador <= 5){
            System.out.print("Codigo de articulo (1-3): ");
            int codArt = b.nextInt();
            System.out.print("Cantidad vendida en litros: ");
            int cant = b.nextInt();
            if(codArt == 1){
                litrosTot += cant;
            }
            if(codArt == 1){
                factTotal += art1l;
            } else if(codArt == 2){
                factTotal += art2l;
            } else if(codArt == 3){
                factTotal += art3l;
            }
            if(factTotal > 600){
                fact600 += 1;
            }
            contador+=1;
            if(contador>5){
                System.out.println("Facturacion total: "+factTotal);
                System.out.println("Cantidad de litros del articulo 1: "+litrosTot);
                System.out.println("Facturas de mas de 600 euros: "+fact600);
            }
        }
        b.close();
    }

    public static void Ejercicio10(){
    /*   
        10. PEDIR UN NUMERO AL USUARIO E INDICAR SI ES UN NÚMERO PRIMO.
    */
        System.out.println("Ejercicio 10");
        Scanner s = new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        int num = s.nextInt();
        for(int i=2;2*i<=num;i++) {
            if(num%i==0){
                System.out.println("No es primo");
            } else {
                System.out.println("El numero es primo");
            }
        }
        s.close();
    }

    public static void main(String[] args){
        Scanner e = new Scanner(System.in);
        System.out.print("Que ejercicio quieres ver?(1-10): ");
        int numEjer = e.nextInt();
        switch (numEjer) {
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
            case 6:
                Ejercicio6();
                break;
            case 7:
                Ejercicio7();
                break;
            case 8:
                Ejercicio8();
                break;
            case 9:
                Ejercicio9();
                break;
            case 10:
                Ejercicio10();
                break;
        
            default:
                break;
        } 
        e.close();
    }
}
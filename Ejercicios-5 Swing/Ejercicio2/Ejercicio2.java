package Ejercicio2;

import javax.swing.JFrame;

public class Ejercicio2 {
    public static void main(String[] args){
        Interfaz interfaz = new Interfaz();
        interfaz.setTitle("BotonesTexto");
        interfaz.setSize(500,250);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

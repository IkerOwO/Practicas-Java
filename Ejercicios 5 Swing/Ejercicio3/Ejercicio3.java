package Ejercicio3;

import javax.swing.JFrame;

public class Ejercicio3 {
    public static void main(String[] args){
        Interfaz interfaz = new Interfaz();
        interfaz.setTitle("Calculadora");
        interfaz.setSize(300,400);
        interfaz.setVisible(true);
        interfaz.setResizable(false);
        interfaz.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
} 

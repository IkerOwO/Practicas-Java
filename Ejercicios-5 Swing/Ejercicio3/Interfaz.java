package Ejercicio3;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

public class Interfaz extends JFrame {
    public JLabel calcLabel, op1, op2, resLbl;
    public JTextArea op1Area, op2Area, resArea;
    public JButton sumBtn, resBtn, multBtn, divBtn; 

    public Interfaz(){
        setLayout(new BorderLayout());
        /* Labels */
        calcLabel = new JLabel("CALCULADORA");
        calcLabel.setBounds(100, 10, 100, 20);
        add(calcLabel);

        op1 = new JLabel("Operando 1: ");
        op1.setBounds(10, 50, 100, 20);
        op2 = new JLabel("Operando 2: ");
        op2.setBounds(10, 100, 100, 20);
        resLbl = new JLabel("RESULTADO: ");
        resLbl.setBounds(10,300,100,20);
        add(op1);
        add(op2);
        add(resLbl);

        /* TextArea */
        op1Area = new JTextArea();
        op1Area.setBorder(new LineBorder(Color.BLACK, 1));
        op1Area.setBounds(100,50,100,20);
        add(op1Area);
        op2Area = new JTextArea();
        op2Area.setBorder(new LineBorder(Color.BLACK, 1));
        op2Area.setBounds(100,100,100,20);
        add(op2Area);
        resArea = new JTextArea();
        resArea.setBorder(new LineBorder(Color.BLACK, 1));
        resArea.setBounds(100,300,100,20);
        add(resArea);

        /* Botones */
        sumBtn = new JButton("+");
        resBtn = new JButton("-");
        multBtn = new JButton("*");
        divBtn = new JButton("/");

        /* Buttons Panel */
        JPanel panelBotones = new JPanel(new GridBagLayout());
        // Panel interno para poner los botones lado a lado
        JPanel panelInterno = new JPanel();
        panelInterno.add(sumBtn);
        panelInterno.add(resBtn);
        panelInterno.add(multBtn);
        panelInterno.add(divBtn);
        panelBotones.add(panelInterno);
        // Centrar el panel
        add(panelBotones, BorderLayout.CENTER);
        sumBtn.addActionListener(this::sumar);
        resBtn.addActionListener(this::restar);
        multBtn.addActionListener(this::multiplicar);
        divBtn.addActionListener(this::dividir);
    }

    public void sumar(ActionEvent e){
        String op1 = op1Area.getText();
        String op2 = op2Area.getText();
        if(!op1.isEmpty() && !op2.isEmpty()){
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);
            int suma = num1+num2;
            String sumaFormated = Integer.toString(suma);
            resArea.setText(sumaFormated);
        } else {
            resArea.setText("Rellena todos los campos");
        }
    }
    
    public void restar(ActionEvent e){
        String op1 = op1Area.getText();
        String op2 = op2Area.getText();
        if(!op1.isEmpty() && !op2.isEmpty()){
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);
            int resta = num1-num2;
            String restaFormated = Integer.toString(resta);
            resArea.setText(restaFormated);
        } else {
            resArea.setText("Rellena todos los campos");
        }
    }
    
    public void multiplicar(ActionEvent e){
        String op1 = op1Area.getText();
        String op2 = op2Area.getText();
        if(!op1.isEmpty() && !op2.isEmpty()){
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);
            int mult = num1*num2;
            String multiFormated = Integer.toString(mult);
            resArea.setText(multiFormated);
        } else {
            resArea.setText("Rellena todos los campos");
        }
    }
    
    public void dividir(ActionEvent e){
        String op1 = op1Area.getText();
        String op2 = op2Area.getText();
        if(!op1.isEmpty() && !op2.isEmpty()){
            int num1 = Integer.parseInt(op1);
            int num2 = Integer.parseInt(op2);
            int div = num1/num2;
            String divFormated = Integer.toString(div);
            resArea.setText(divFormated);
        } else {
            resArea.setText("Rellena todos los campos");
        }
    }
}

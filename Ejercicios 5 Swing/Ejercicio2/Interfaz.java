package Ejercicio2;

import javax.swing.*;
import javax.swing.border.LineBorder;
import java.awt.event.*;
import java.awt.*;

public class Interfaz extends JFrame{
    public JPanel panelBtn;
    public JButton borrarBtn, minusculasBtn, mayusculasBtn;
    public JTextField textfield;
    public JLabel label, resultLbl, errorLbl;

    public Interfaz(){
        setLayout(new BorderLayout());
        /* Text Label */
        label = new JLabel("Introduce un texto y pulsa a copiar");
        label.setBounds(40, 40, 200, 20);
        add(label);
        errorLbl = new JLabel("No hay texto introducido");
        errorLbl.setBounds(300, 160, 160, 20);
        errorLbl.setForeground(Color.RED);
        errorLbl.setVisible(false);
        add(errorLbl);

        /* TextField */
        textfield = new JTextField();
        textfield.setBounds(250, 40, 120, 20);
        add(textfield);

        /* Result Label */
        resultLbl = new JLabel();
        resultLbl.setBounds(300, 160, 160, 20);
        resultLbl.setBorder(new LineBorder(Color.BLACK, 2));
        add(resultLbl);
        /* Buttons */
        borrarBtn = new JButton("Borrar");
        minusculasBtn = new JButton("Minusculas");
        mayusculasBtn = new JButton("Mayusculas");
        /* Buttons Panel */
        JPanel panelBotones = new JPanel(new GridBagLayout());
        // Panel interno para poner los botones lado a lado
        JPanel panelInterno = new JPanel();
        panelInterno.add(borrarBtn);
        panelInterno.add(mayusculasBtn);
        panelInterno.add(minusculasBtn);
        panelBotones.add(panelInterno);
        // Centrar el panel
        add(panelBotones, BorderLayout.CENTER);
        borrarBtn.addActionListener(this::borrar);
        minusculasBtn.addActionListener(this::minusculas);
        mayusculasBtn.addActionListener(this::mayusculas);
    }

    public void minusculas(ActionEvent e){
        String text = textfield.getText();
        if(text.isEmpty()){
            errorLbl.setVisible(true);
        } else{
            errorLbl.setVisible(false);
            resultLbl.setText(text.toLowerCase());
        }
    }

    public void mayusculas(ActionEvent e){
        String text = textfield.getText();
        if(text.isEmpty()){
            errorLbl.setVisible(true);
        } else{
            errorLbl.setVisible(false);
            resultLbl.setText(text.toUpperCase());
        }
    }
    
    public void borrar(ActionEvent e){
        resultLbl.setText(" ");
    }
    
}

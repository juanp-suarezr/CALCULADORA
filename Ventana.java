package CALCULADORA;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.Border;



public class Ventana extends JFrame{

    Color colorAzul1=new Color(100, 95, 138);
    

    public Ventana() {
        
        setSize(500, 500);
        
        setTitle("CALCULADORA");
        
        // setBounds(500, 100, 500, 500); --- para colocar el tamaño y la ubicacion de la pantalla

        //para ubicar la pantalla en la mitad
        setLocationRelativeTo(null);

        cajatexto_calculadora();
        botones_cal();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        


    }
 
    public void cajatexto_calculadora() {

        JPanel pantalla_cal = new JPanel();  //creacion de panel
        pantalla_cal.setBackground(colorAzul1);
        getContentPane().add(pantalla_cal, BorderLayout.NORTH);
        JTextField caja_texto = new JTextField();
        caja_texto.setSize(500, 200);
        caja_texto.setFont(new Font("default", Font.ITALIC, 20));
        pantalla_cal.add(caja_texto);
    
    }
     
    public void botones_cal(){
        JPanel botones_1 = new JPanel();  //creacion de panel
        botones_1.setLayout(new GridLayout(5, 4));
        
        getContentPane().add(botones_1);
       
        JButton botonAC = new JButton("AC");
        botonAC.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonAC);

        JButton botonmas_menos = new JButton("+/-");
        botonmas_menos.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonmas_menos);

        JButton boton_borrar = new JButton("BORRAR");
        boton_borrar.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(boton_borrar);

        JButton botones_1division = new JButton("÷");
        botones_1division.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_1division);

        JButton botones7 = new JButton("7");
        botones7.setBackground(colorAzul1);
        botones_1.add(botones7);

        JButton botones8 = new JButton("8");
        botones8.setBackground(colorAzul1);
        botones_1.add(botones8);

        JButton botones9 = new JButton("9");
        botones9.setBackground(colorAzul1);
        botones_1.add(botones9);
        
        JButton botones_menos = new JButton("-");
        botones_menos.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_menos);

        JButton botones4 = new JButton("4");
        botones4.setBackground(colorAzul1);
        botones_1.add(botones4);
        
        JButton botones5 = new JButton("5");
        botones5.setBackground(colorAzul1);
        botones_1.add(botones5);
        
        JButton botones6 = new JButton("6");
        botones6.setBackground(colorAzul1);
        botones_1.add(botones6);

        JButton botones_mas = new JButton("+");
        botones_mas.setFont(new Font("default", Font.BOLD, 20));
         botones_1.add(botones_mas);

        JButton botones1 = new JButton("1");
        botones1.setBackground(colorAzul1);
        botones_1.add(botones1);

        JButton botones2 = new JButton("2");
        botones2.setBackground(colorAzul1);
        botones_1.add(botones2);

        JButton botones3 = new JButton("3");
        botones3.setBackground(colorAzul1);
        botones_1.add(botones3);

        JButton botonesX = new JButton("X");
        botonesX.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonesX);

        JButton botones_1_porcentaje = new JButton("%");
        botones_1_porcentaje.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_1_porcentaje);

        JButton botones0 = new JButton("0");
        botones0.setBackground(colorAzul1);
        botones_1.add(botones0);

        JButton botonescoma = new JButton(",");
        botones0.setBackground(colorAzul1);
        botones_1.add(botonescoma);

        JButton botonesigual = new JButton("=");
        botonesigual.setFont(new Font("default", Font.BOLD, 30));
        botones_1.add(botonesigual);
        
    }
    
    public void eventoscalculadora() {

        MouseListener ms = new MouseListener() {


            public void mouseClicked(java.awt.event.MouseEvent e) {

                
                
                
            }

            
            public void mousePressed(java.awt.event.MouseEvent e) {
            }

            
            public void mouseReleased(java.awt.event.MouseEvent e) {
            }

            
            public void mouseEntered(java.awt.event.MouseEvent e) {   
            }

            
            public void mouseExited(java.awt.event.MouseEvent e) {
            
            }
        };
    
    }
}
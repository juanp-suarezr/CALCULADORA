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
    String text1 = "";
    String text2 = "";
    Float num1;
    Float num2;
    Float workop;
    String resultado;
    protected int operacion;
    protected Integer validar=0;
    JPanel pantalla_cal;
    JLabel caja_texto;
    JButton botonAC; JButton botonmas_menos; JButton boton_borrar; JButton botones_1division;
    JButton botones7; JButton botones8; JButton botones9; JButton botones_menos;
    JButton botones6; JButton botones5; JButton botones4; JButton botones_mas;
    JButton botones1; JButton botones2; JButton botones3; JButton botonesX;
    JButton botones_1_porcentaje; JButton botones0; JButton botonescoma; JButton botonesigual;


    Color colorAzul1=new Color(100, 95, 138);
    
    public Ventana() {
        
        setSize(500, 500);
        
        setTitle("CALCULADORA");
        
        // setBounds(500, 100, 500, 500); --- para colocar el tamaño y la ubicacion de la pantalla

        //para ubicar la pantalla en la mitad
        setLocationRelativeTo(null);

        cajatext1o_calculadora();
        botones_cal();
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        


    }
 
    public void cajatext1o_calculadora() {

        pantalla_cal = new JPanel();  //creacion de panel
        
        getContentPane().add(pantalla_cal, BorderLayout.NORTH);
        caja_texto = new JLabel();
        caja_texto.setText("---");
        caja_texto.setBackground(colorAzul1);
        caja_texto.setFont(new Font("default", Font.ITALIC, 20));
        pantalla_cal.add(caja_texto);
    
    }
     
    public void botones_cal(){
        JPanel botones_1 = new JPanel();  //creacion de panel
        botones_1.setLayout(new GridLayout(5, 4));
        
        getContentPane().add(botones_1);
       
        botonAC = new JButton("AC");
        botonAC.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonAC);

        botonmas_menos = new JButton("+/-");
        botonmas_menos.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonmas_menos);

        boton_borrar = new JButton("BORRAR");
        boton_borrar.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(boton_borrar);

        botones_1division = new JButton("÷");
        botones_1division.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_1division);

        botones7 = new JButton("7");
        botones7.setBackground(colorAzul1);
        botones_1.add(botones7);

        botones8 = new JButton("8");
        botones8.setBackground(colorAzul1);
        botones_1.add(botones8);

        botones9 = new JButton("9");
        botones9.setBackground(colorAzul1);
        botones_1.add(botones9);
        
        botones_menos = new JButton("-");
        botones_menos.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_menos);

        botones4 = new JButton("4");
        botones4.setBackground(colorAzul1);
        botones_1.add(botones4);
        
        botones5 = new JButton("5");
        botones5.setBackground(colorAzul1);
        botones_1.add(botones5);
        
        botones6 = new JButton("6");
        botones6.setBackground(colorAzul1);
        botones_1.add(botones6);

        botones_mas = new JButton("+");
        botones_mas.setFont(new Font("default", Font.BOLD, 20));
         botones_1.add(botones_mas);

        botones1 = new JButton("1");
        botones1.setBackground(colorAzul1);
        botones_1.add(botones1);

        botones2 = new JButton("2");
        botones2.setBackground(colorAzul1);
        botones_1.add(botones2);

        botones3 = new JButton("3");
        botones3.setBackground(colorAzul1);
        botones_1.add(botones3);

        botonesX = new JButton("X");
        botonesX.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botonesX);

        botones_1_porcentaje = new JButton("%");
        botones_1_porcentaje.setFont(new Font("default", Font.BOLD, 20));
        botones_1.add(botones_1_porcentaje);

        botones0 = new JButton("0");
        botones0.setBackground(colorAzul1);
        botones_1.add(botones0);

        botonescoma = new JButton(",");
        botones0.setBackground(colorAzul1);
        botones_1.add(botonescoma);

        botonesigual = new JButton("=");
        botonesigual.setFont(new Font("default", Font.BOLD, 30));
        botones_1.add(botonesigual);

        eventos();
        
    }

    public void eventos() {
        ActionListener numero_1 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validar == 0) {
                    text1 = text1+botones1.getText();
                    caja_texto.setText(text1);
                    pantalla_cal.add(caja_texto);
                } else if (validar == 1) {
                    text2 = text2+botones1.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones1.addActionListener(numero_1);

        ActionListener numero_2 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones2.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones2.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones2.addActionListener(numero_2);

        ActionListener numero_3 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones3.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones3.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones3.addActionListener(numero_3);

        ActionListener numero_4 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones4.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones4.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones4.addActionListener(numero_4);

        ActionListener numero_5 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones5.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones5.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones5.addActionListener(numero_5);

        ActionListener numero_6 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones6.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones6.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones6.addActionListener(numero_6);

        ActionListener numero_7 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones7.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones6.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones7.addActionListener(numero_7);

        ActionListener numero_8 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones8.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones8.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones8.addActionListener(numero_8);

        ActionListener numero_9 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones9.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones9.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones9.addActionListener(numero_9);

        ActionListener numero_0 = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1+botones0.getText();
                caja_texto.setText(text1);
                pantalla_cal.add(caja_texto);

                if (validar == 1) {
                    text2 = text2+botones0.getText();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botones0.addActionListener(numero_0);

        ActionListener numero_borrar = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validar == 0) {
                    text1 = text1.substring(0, text1.length()-1);
                    caja_texto.setText(text1);
                    pantalla_cal.add(caja_texto); 
                } else if (validar == 1) {
                    text2 = text2.substring(0, text2.length()-1);
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto); 
            }
                
            }
        }; boton_borrar.addActionListener(numero_borrar);

        ActionListener numero_mas_menos = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validar == 0) {
                    num1 = Float.parseFloat(text1)*-1 ;
                    text1 = num1.toString();
                    caja_texto.setText(text1);
                    pantalla_cal.add(caja_texto);
                } else if (validar == 1) {
                    num2 = Float.parseFloat(text2)*-1 ;
                    text2 = num2.toString();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
            }
        }; botonmas_menos.addActionListener(numero_mas_menos);

        ActionListener resta = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja_texto.setText("");
                pantalla_cal.add(caja_texto);
                num1 = Float.parseFloat(text1);
                validar = 1;
                operacion = 1;
                
            }
        }; botones_menos.addActionListener(resta);

        ActionListener suma = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja_texto.setText("");
                pantalla_cal.add(caja_texto);
                num1 = Float.parseFloat(text1);
                validar = 1;
                operacion = 2;
                
            }
        }; botones_mas.addActionListener(suma);

        ActionListener multiplicar = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja_texto.setText("");
                pantalla_cal.add(caja_texto);
                num1 = Float.parseFloat(text1);
                validar = 1;
                operacion = 3;
                
            }
        }; botonesX.addActionListener(multiplicar);

        ActionListener dividir = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                caja_texto.setText("");
                pantalla_cal.add(caja_texto);
                num1 = Float.parseFloat(text1);
                validar = 1;
                operacion = 4;
                
            }
        }; botones_1division.addActionListener(dividir);

        ActionListener porcentaje = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validar == 0) {
                    num1 = Float.parseFloat(text1)/100 ;
                    text1 = num1.toString();
                    caja_texto.setText(text1);
                    pantalla_cal.add(caja_texto);
                } else if (validar == 1) {
                    num2 = Float.parseFloat(text2)/100 ;
                    text2 = num2.toString();
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
                
                
            }
        }; botones_1_porcentaje.addActionListener(porcentaje);

        ActionListener decimal = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (validar == 0) {
                    text1 = text1+".";
                    caja_texto.setText(text1);
                    pantalla_cal.add(caja_texto);
                } else if (validar == 1) {
                    text2 = text2+".";
                    num2 = Float.parseFloat(text2) ;
                    caja_texto.setText(text2);
                    pantalla_cal.add(caja_texto);
                }
                
                
            }
        }; botonescoma.addActionListener(decimal);

        ActionListener igual = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                num2 = Float.parseFloat(text2);
                switch(operacion) {
                    case 1: 
                    workop = num1-num2;
                    break;
                    case 2: 
                    workop= num1+num2;
                    break;
                    case 3: 
                    workop = num1*num2;
                    break;
                    case 4: 
                    workop = num1/num2;
                    break;
                }

                resultado = Float.toString(workop);
                caja_texto.setText("");
                pantalla_cal.add(caja_texto);
                caja_texto.setText(resultado);
                pantalla_cal.add(caja_texto);


                
            }
        }; botonesigual.addActionListener(igual);

        ActionListener cleanall = new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                text1 = text1.substring(0, text1.length()-text1.length());
                text2 = text2.substring(0, text2.length()-text2.length());
                resultado = resultado.substring(0, resultado.length()-resultado.length());
                caja_texto.removeAll();
                caja_texto.setText("--");
                pantalla_cal.add(caja_texto);
                
            }
        }; botonAC.addActionListener(cleanall);








    
    }
}
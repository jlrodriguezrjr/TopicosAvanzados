/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

 package com.mycompany.topicosavanzados;

 import javax.swing.*;
 import java.awt.event.*;
 
 public class TopicosAvanzados implements ActionListener {
     private JLabel etiqueta1;
     private JTextField campoDeTexto;
     private JButton boton;
     private JLabel etiqueta2;
 
     public TopicosAvanzados() {
         // *********************************************
         // CREACIÓN DEL INTERFAZ GRÁFICO
         // *********************************************
         // Crear la ventana de la aplicacion
         JFrame ventana = new JFrame(
                 "Conversor de Euros a pesetas");
         ventana.setSize(300, 200);
         ventana.setDefaultCloseOperation(
                 JFrame.EXIT_ON_CLOSE);
         // Crear los componentes
         etiqueta1 = new JLabel("Importe en Euros");
         campoDeTexto = new JTextField(20);
         boton = new JButton("Convertir");
         etiqueta2 = new JLabel("Pulse para obtener el "
                 + "importe en pesetas");
         // Crear un contenedor
         JPanel panelDeContenido = new JPanel();
         // Configurar el contenedor para mostrar los
         // componentes cuando se muestre.
         panelDeContenido.add(etiqueta1);
         panelDeContenido.add(campoDeTexto);
         panelDeContenido.add(boton);
         panelDeContenido.add(etiqueta2);
         // Configurar la ventana para mostrar el panel
         // cuando se muestre
         ventana.setContentPane(panelDeContenido);
         // *********************************************
         // ASOCIACIÓN DEL CÓDIGO DE MANEJO DE EVENTOS
         // *********************************************
         boton.addActionListener(this);
         // *********************************************
         // HACER VISIBLE LA VENTANA
         // *********************************************
         ventana.setVisible(true);
     }
 
     public static void main(String[] args) {
         new TopicosAvanzados();
     }
 
     public void actionPerformed(ActionEvent e) {
         // **********************************************
         // CÓDIGO DE MANEJO DE EVENTOS
         // **********************************************
         try {
             double euros = Double.parseDouble(
                     campoDeTexto.getText());
             double pesetas = euros * 166.386;
             etiqueta2.setText("Equivale a " + pesetas
                     + " pesetas");
         } catch (NumberFormatException e2) {
             etiqueta2.setText(
                     "En el campo de texto no hay un número");
         }
     }
 }
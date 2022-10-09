/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento_2_grafo;

import intento_1_grafo.Grafo;
import java.awt.Color;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.geom.Ellipse2D;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rubens1414
 */
public class Interfaz extends javax.swing.JFrame {

    //booleano que ayuda a controlar el otro click de mouse para unir la linea
    public static boolean eligioP = true;
    
    //coordenadas para generar la linea
    public static int x1, x2, y1, y2;
    
     //variables tipo booleano para los botones
    public static boolean l = false, s = false, o = false;
    
    //nombre del vertice
    public static String nombre;
    
    //clase grafo(esto no lo eh implementado)
    public static Grafo gra = new Grafo();
    
    // contador para verificar si hay por lo menos 2 vertices para generar arista(si es lazo habra que cambiarlo)
    public static int v = 0;
    
    // variable tipo graphics
    public static Graphics h;
    
    // arraylist tipo vertice del panel vertice(asi crea los vertices)
    public static ArrayList<vertice> panel = new ArrayList<>();
    
    
    // constructor
    public Interfaz() {
        initComponents();
        setTitle("Grafitos");
        //color de fondo
        this.getContentPane().setBackground(Color.orange);
        this.setResizable(false);
        //que todo lo que pinte sea en el panel 
        h = panela.getGraphics();
        //comienza desactivados los botones
        añadir_vertice.setEnabled(false);
        Añadir_arista.setEnabled(false);

    }
    //esto hace que interactue el mouse en el panel 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        ImageIcon icon = new ImageIcon(getClass().getResource("mapa.png"));
        Image image = icon.getImage();
        panela = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(image,0,0,getWidth(),getHeight(),this);
            }
        };
        jPanel1 = new javax.swing.JPanel();
        añadir_vertice = new javax.swing.JButton();
        Añadir_costo = new javax.swing.JButton();
        Añadir_arista = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        eliminar_vertice1 = new javax.swing.JButton();
        eliminar_arista = new javax.swing.JButton();
        nombre_vertice = new javax.swing.JTextField();
        Añadir_nombre = new javax.swing.JButton();

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panela.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelViewMouseClicked(evt);
            }
        });
        panela.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 102, 255)));
        panela.setPreferredSize(new java.awt.Dimension(317, 478));

        javax.swing.GroupLayout panelaLayout = new javax.swing.GroupLayout(panela);
        panela.setLayout(panelaLayout);
        panelaLayout.setHorizontalGroup(
            panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 315, Short.MAX_VALUE)
        );
        panelaLayout.setVerticalGroup(
            panelaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 476, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 102, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        añadir_vertice.setText("Añadir Vertice");
        añadir_vertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                añadir_verticeActionPerformed(evt);
            }
        });

        Añadir_costo.setText("Añadir costo");
        Añadir_costo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Añadir_costoActionPerformed(evt);
            }
        });

        Añadir_arista.setText("Añadir arista");
        Añadir_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Añadir_aristaActionPerformed(evt);
            }
        });

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        eliminar_vertice1.setText("Eliminar Vertice");
        eliminar_vertice1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_vertice1ActionPerformed(evt);
            }
        });

        eliminar_arista.setText("Eliminar arista");
        eliminar_arista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminar_aristaActionPerformed(evt);
            }
        });

        nombre_vertice.setText("Default");
        nombre_vertice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombre_verticeActionPerformed(evt);
            }
        });

        Añadir_nombre.setText("Añadir nombre");
        Añadir_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Añadir_nombreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(nombre_vertice)
                    .addComponent(añadir_vertice, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                    .addComponent(eliminar_vertice1, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eliminar_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Añadir_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(Añadir_costo, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addGap(22, 22, 22))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Añadir_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombre_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Añadir_nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(añadir_vertice, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Añadir_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eliminar_vertice1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eliminar_arista, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Añadir_costo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(panela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(354, 354, 354))
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(149, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panela, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(172, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void panelViewMouseClicked(java.awt.event.MouseEvent evt) {
        //condicional si el mouse esta o no en el panel y si el boton se activo
        if (panela.getMousePosition() != null&&l==true) {
            //prueba si se esta llamando
            System.out.println("xd");
            //obtenemos la posicion del mouse
            Point p = panela.getMousePosition().getLocation();
            if (l == true) {
                vertice prueba = new vertice();
                prueba.setBounds(p.x - 15, p.y - 10, 130, 71);
                panela.add(prueba);
                panel.add(prueba);
                prueba.dibuja(prueba.getGraphics());
                v++;
                l = false;
                //si hay mas de 2 vertices se activa la arista
                if (v >= 2) {
                    Añadir_arista.setEnabled(true);
                }

            }
        }
    }
    private void añadir_verticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_añadir_verticeActionPerformed

        l = true;
    }//GEN-LAST:event_añadir_verticeActionPerformed

    private void Añadir_costoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_costoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Añadir_costoActionPerformed

    private void Añadir_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_aristaActionPerformed

        s = true;
    }//GEN-LAST:event_Añadir_aristaActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void eliminar_vertice1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_vertice1ActionPerformed

        o = true;

    }//GEN-LAST:event_eliminar_vertice1ActionPerformed

    private void eliminar_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_aristaActionPerformed


    }//GEN-LAST:event_eliminar_aristaActionPerformed

    private void nombre_verticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_verticeActionPerformed

    }//GEN-LAST:event_nombre_verticeActionPerformed

    private void Añadir_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_nombreActionPerformed
       //verifica si la entrada de texto esta vacia o no
        nombre = nombre_vertice.getText();
        if (nombre != null) {
            añadir_vertice.setEnabled(true);
        }
        if (nombre_vertice.getText().isEmpty()) {
            añadir_vertice.setEnabled(false);
        }
    }//GEN-LAST:event_Añadir_nombreActionPerformed
    //pintar linea
    public static void pintarlinea(int x1, int y1, int x2, int y2) {

        h.setColor(Color.RED);
        h.drawLine(x1 + 15, y1 + 30, x2 + 15, y2 + 30);

    }

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        Interfaz si = new Interfaz();

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                si.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Añadir_arista;
    private javax.swing.JButton Añadir_costo;
    private javax.swing.JButton Añadir_nombre;
    private javax.swing.JButton añadir_vertice;
    private javax.swing.JButton eliminar_arista;
    private javax.swing.JButton eliminar_vertice1;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField nombre_vertice;
    public static javax.swing.JDesktopPane panela;
    // End of variables declaration//GEN-END:variables

}

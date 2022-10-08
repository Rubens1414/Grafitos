/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intento_1_grafo;

import java.awt.Color;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import javax.swing.ImageIcon;

/**
 *
 * @author Rubens1414
 */
public class Interfaz extends javax.swing.JFrame implements MouseListener {

    ArrayList<Ellipse2D> rcs;
    ArrayList<Integer> p;
    ArrayList<Integer> x;
    int tam = 30;
    boolean l = false, s = false;
    String nombre;

    public Interfaz() {
        initComponents();
        this.getContentPane().setBackground(Color.orange);
        this.setResizable(false);
        rcs = new ArrayList();
        p = new ArrayList();
        x = new ArrayList();
        panela.addMouseListener(this);
        añadir_vertice.setEnabled(false);

    }

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
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_vertice1ActionPerformed

    private void eliminar_aristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminar_aristaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminar_aristaActionPerformed

    private void nombre_verticeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombre_verticeActionPerformed

    }//GEN-LAST:event_nombre_verticeActionPerformed

    private void Añadir_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Añadir_nombreActionPerformed

        nombre = nombre_vertice.getText();
        if (nombre != null) {
            añadir_vertice.setEnabled(true);
        }
        if (nombre_vertice.getText().isEmpty()) {
            añadir_vertice.setEnabled(false);
        }
    }//GEN-LAST:event_Añadir_nombreActionPerformed

    public void start(int x, int y) {

        Graphics g = panela.getGraphics();
        this.pintar(g, x, y);
    }
    public void start2(int x1,int y1,int x2, int y2){
      Graphics g = panela.getGraphics();
      this.pintarlinea( g,  x1,  y1,  x2,  y2);
    }

    public void pintar(Graphics g, int x, int y) {
        Graphics2D g2 = (Graphics2D) g;
        for (Ellipse2D r : rcs) {

            g2.draw(r);
            g.drawString(nombre + "", x - 5, y + 40);
        }

    }

    public void pintarlinea(Graphics g, int x1, int y1, int x2, int y2) {
        g.drawLine(x1, y1, x2, y2);
    }

    public void mouseClicked(MouseEvent e) {

        // System.out.println(e.getPoint());
        //System.out.println(rcs);
        if (l == true) {
            p.add(e.getX());
            x.add(e.getY());
        }

        if (s == true) {
       
         

        }
        System.out.println(p);
        //System.out.println(x);
        if (l == true) {
            rcs.add(new Ellipse2D.Double(e.getX() - tam / 2, e.getY() - tam / 2, tam, tam));
            
            start(e.getX(), e.getY());
            l = false;
        }

    }

    public void mousePressed(MouseEvent e) {
    }

    public void mouseReleased(MouseEvent e) {
    }

    public void mouseEntered(MouseEvent e) {
    }

    public void mouseExited(MouseEvent e) {
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
    private javax.swing.JDesktopPane panela;
    // End of variables declaration//GEN-END:variables
}

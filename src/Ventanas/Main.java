/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ventanas;

import Clases.Grafo;
import Clases.Pintar;
import Clases.DJ;
import Clases.exp_min;
import Clases.Floyd;
import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {

    /**
     * Creates new form VentanaPincipal
     */
    Pintar pintar = new Pintar();
    Grafo grafo = new Grafo();
    //public static ArrayList<vertice> panel = new ArrayList<>();

    public static int ingresarNodoOrigen(String nodoOrige, String noExiste, int tope) {
        int nodoOrigen = 0;
        try {
            nodoOrigen = Integer.parseInt(JOptionPane.showInputDialog("" + nodoOrige));
            if (nodoOrigen >= tope) {
                JOptionPane.showMessageDialog(null, "" + noExiste + "\nDebe de ingresar  un Nodo existente");
                nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
            }
        } catch (Exception ex) {
            nodoOrigen = ingresarNodoOrigen(nodoOrige, noExiste, tope);
        }
        return nodoOrigen;
    }

    public int ingresarTamano(String tama) {
        int tamano = 0;
        try {
            tamano = Integer.parseInt(JOptionPane.showInputDialog("" + tama));
            if (tamano < 1) {
                JOptionPane.showMessageDialog(null, "Debe Ingresar un Tamaño Aceptado..");
                tamano = ingresarTamano(tama);//no es nesario hacer esto
            }
        } catch (HeadlessException | NumberFormatException ex) {
            tamano = ingresarTamano(tama);
        }
        return tamano;
    }

    public boolean cicDerechoSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {// consultamos si se ha sado  click sobre algun nodo 
            if ((xxx + 2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j) + 13) && (yyy + 2) > grafo.getCordeY(j) && yyy < (grafo.getCordeY(j) + 13)) {

                if (n == 0) {
                    id = j;
                    Pintar.repaint3(tope, grafo);
                    Pintar.clickSobreNodo(panelGrafo.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.orange);
                    n++;
                } else {
                    id2 = j;
                    n++;
                    Pintar.clickSobreNodo(panelGrafo.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.orange);
                    if (id == id2) {// si id == id2 por q se volvio a dar click sobre el mismos nodo, se cancela el click anterio
                        n = 0;
                        Pintar.pintarCirculo(panelGrafo.getGraphics(), grafo.getCordeX(id), grafo.getCordeY(id), String.valueOf(grafo.getNombre(id)), grafo.getNombre2(id));
                        id = -1;
                        id2 = -1;
                    }
                }
                nn = 0;
                return true;
            }
        }
        return false;
    }

    public void clicIzqSobreNodo(int xxx, int yyy) {
        for (int j = 0; j < tope; j++) {
            if ((xxx + 2) > grafo.getCordeX(j) && xxx < (grafo.getCordeX(j) + 13) && (yyy + 2) > grafo.getCordeY(j) && yyy < (grafo.getCordeY(j) + 13)) {
                if (nn == 0) {
                    nodoInicio = j;
                    Pintar.repaint3(tope, grafo);
                } else {
                    nodoFin = j;
                }
                nn++;
                n = 0;
                id = -1;
                Pintar.clickSobreNodo(panelGrafo.getGraphics(), grafo.getCordeX(j), grafo.getCordeY(j), null, Color.GREEN);
                break;
            }

        }

    }

    public Main() {
        initComponents();
        jDialog1.setLocationRelativeTo(null);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jFileChooser2 = new javax.swing.JFileChooser();
        panelGrafo = new javax.swing.JPanel();
        panelCosto = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        imgFondo = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArchivos = new javax.swing.JMenu();
        ExpMin = new javax.swing.JMenuItem();
        MFloyd = new javax.swing.JMenuItem();
        menuEliminar = new javax.swing.JMenu();
        eliminarNodo = new javax.swing.JMenuItem();
        eliminarArista = new javax.swing.JMenuItem();

        jDialog1.setMinimumSize(new java.awt.Dimension(700, 450));
        jDialog1.setResizable(false);
        jDialog1.getContentPane().setLayout(null);

        jFileChooser2.setMaximumSize(new java.awt.Dimension(21475, 21474));
        jFileChooser2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFileChooser2ActionPerformed(evt);
            }
        });
        jDialog1.getContentPane().add(jFileChooser2);
        jFileChooser2.setBounds(10, 20, 670, 390);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Grafitos");
        setCursor(new java.awt.Cursor(java.awt.Cursor.CROSSHAIR_CURSOR));
        setResizable(false);
        getContentPane().setLayout(null);

        panelGrafo.setBackground(new java.awt.Color(0, 149, 239));
        panelGrafo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        panelGrafo.setMinimumSize(new java.awt.Dimension(770, 522));
        panelGrafo.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                panelGrafoMouseMoved(evt);
            }
        });
        panelGrafo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                panelGrafoMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                panelGrafoMousePressed(evt);
            }
        });
        panelGrafo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                panelGrafoKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                panelGrafoKeyReleased(evt);
            }
        });
        panelGrafo.setLayout(null);

        panelCosto.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        panelCosto.setDisabledTextColor(new java.awt.Color(0, 51, 204));
        panelCosto.setEnabled(false);
        panelCosto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                panelCostoActionPerformed(evt);
            }
        });
        panelGrafo.add(panelCosto);
        panelCosto.setBounds(20, 610, 110, 30);

        jLabel3.setText("Costo Total");
        panelGrafo.add(jLabel3);
        jLabel3.setBounds(20, 590, 110, 16);

        jLabel2.setText("n -> Eliminar nodo");
        jPanel1.add(jLabel2);

        jLabel4.setText("a -> Eliminar arista");
        jPanel1.add(jLabel4);

        jLabel5.setText("f -> Matriz de Floyd");
        jPanel1.add(jLabel5);

        jLabel6.setText("click izq -> insertar nodo");
        jPanel1.add(jLabel6);

        jLabel7.setText("click izq sobre 2 nodos ->Insertar arista ");
        jPanel1.add(jLabel7);

        jLabel8.setText("click der sobre 2 nodos ->camino minimo al destino ");
        jPanel1.add(jLabel8);

        panelGrafo.add(jPanel1);
        jPanel1.setBounds(380, 560, 290, 110);

        imgFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Ventanas/mapaMario.jpg"))); // NOI18N
        panelGrafo.add(imgFondo);
        imgFondo.setBounds(10, 10, 1220, 660);

        getContentPane().add(panelGrafo);
        panelGrafo.setBounds(0, 0, 1240, 680);

        jLabel1.setFont(new java.awt.Font("AngsanaUPC", 2, 18)); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(220, 530, 400, 20);

        jMenuBar1.setBorder(null);

        ExpMin.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, 0));
        ExpMin.setText("Recubrir");
        ExpMin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExpMinActionPerformed(evt);
            }
        });
        menuArchivos.add(ExpMin);

        MFloyd.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, 0));
        MFloyd.setText("Matiz De Floyd");
        MFloyd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MFloydActionPerformed(evt);
            }
        });
        menuArchivos.add(MFloyd);

        jMenuBar1.add(menuArchivos);

        menuEliminar.setForeground(new java.awt.Color(255, 255, 255));
        menuEliminar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        eliminarNodo.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_N, 0));
        eliminarNodo.setText("Eliminar Nodo");
        eliminarNodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarNodoActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarNodo);

        eliminarArista.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, 0));
        eliminarArista.setText("Eliminar Arista");
        eliminarArista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eliminarAristaActionPerformed(evt);
            }
        });
        menuEliminar.add(eliminarArista);

        jMenuBar1.add(menuEliminar);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(1256, 710));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void panelGrafoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGrafoMousePressed
        int xxx, yyy;
        xxx = evt.getX();
        yyy = evt.getY();
        if (evt.isMetaDown()) {
            clicIzqSobreNodo(xxx, yyy);
            if (nn == 2) {
                nn = 0;
                int[][] Recorrido = new int[tope][tope];

                DJ Dijkstra = new DJ(grafo, tope, nodoInicio, nodoFin);
                Dijkstra.dijkstra();
                panelCosto.setText("" + Dijkstra.getAcumulado());

            }
        } else {
            if (!cicDerechoSobreNodo(xxx, yyy)) {// si  clik sobre  nodo es falso entra
                if (tope < 50) {
                    grafo.setCordeX(tope, xxx);
                    grafo.setCordeY(tope, yyy);
                    grafo.setNombre(tope, tope);
                    String res="nombre";
                    String nombre2 = JOptionPane.showInputDialog(null, res);
                    grafo.setNombre2(tope, nombre2);

                    Pintar.pintarCirculo(panelGrafo.getGraphics(), grafo.getCordeX(tope), grafo.getCordeY(tope), String.valueOf(grafo.getNombre(tope)), grafo.getNombre2(tope));
                    tope++;
                } else {
                    JOptionPane.showMessageDialog(null, "No se permirten mas nodos");
                }
            }
            if (n == 2) {
                n = 0;
                int ta = ingresarTamano("Ingrese Tamaño");
                if (aristaMayor < ta) {
                    aristaMayor = ta;
                }
                grafo.setmAdyacencia(id2, id, 1);
                grafo.setmAdyacencia(id, id2, 1);
                grafo.setmCoeficiente(id2, id, ta);
                grafo.setmCoeficiente(id, id2, ta);
                Pintar.pintarLinea(panelGrafo.getGraphics(), grafo.getCordeX(id), grafo.getCordeY(id), grafo.getCordeX(id2), grafo.getCordeY(id2), ta);
                Pintar.pintarCirculo(panelGrafo.getGraphics(), grafo.getCordeX(id), grafo.getCordeY(id), String.valueOf(grafo.getNombre(id)), grafo.getNombre2(id));
                Pintar.pintarCirculo(panelGrafo.getGraphics(), grafo.getCordeX(id2), grafo.getCordeY(id2), String.valueOf(grafo.getNombre(id2)), grafo.getNombre2(id2));
                id = -1;
                id2 = -1;
            }
        }
    }//GEN-LAST:event_panelGrafoMousePressed

    private void panelGrafoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelGrafoKeyPressed

    }//GEN-LAST:event_panelGrafoKeyPressed

    private void panelGrafoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_panelGrafoKeyReleased
//////////
    }//GEN-LAST:event_panelGrafoKeyReleased

    private void panelGrafoMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGrafoMouseMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_panelGrafoMouseMoved

    private void eliminarAristaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarAristaActionPerformed
        if (tope >= 2) {
            this.setEnabled(false);
            new EliminarAristas(pintar, grafo, tope, this).setVisible(true);
            panelGrafo.paint(panelGrafo.getGraphics());
            System.out.println("m");
            Pintar.repaint3(tope, grafo);
            System.out.println("m");
        } else {
            JOptionPane.showMessageDialog(null, "No hay aristas");
        }

    }//GEN-LAST:event_eliminarAristaActionPerformed

    private void eliminarNodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eliminarNodoActionPerformed
        int Eliminar = ingresarNodoOrigen("Ingrese Nodo a Eliminar ", "No existe", tope);
        if (Eliminar <= tope && Eliminar >= 0 && tope > 0) {
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope; k++) {
                    if (j == Eliminar || k == Eliminar) {
                        grafo.setmAdyacencia(j, k, -1);
                    }
                }
            }
            for (int l = 0; l < tope - 1; l++) {
                for (int m = 0; m < tope; m++) {
                    if (grafo.getmAdyacencia(l, m) == -1) {
                        grafo.setmAdyacencia(l, m, grafo.getmAdyacencia(l + 1, m));
                        grafo.setmAdyacencia(l + 1, m, -1);
                        grafo.setmCoeficiente(l, m, grafo.getmCoeficiente(l + 1, m));
                    }
                }
            }
            for (int l = 0; l < tope; l++) {
                for (int m = 0; m < tope - 1; m++) {

                    if (grafo.getmAdyacencia(l, m) == -1) {
                        grafo.setmAdyacencia(l, m, grafo.getmAdyacencia(l, m + 1));
                        grafo.setmAdyacencia(l, m + 1, -1);
                        grafo.setmCoeficiente(l, m, grafo.getmCoeficiente(l, m + 1));

                    }
                }
            }

            grafo.setCordeX(Eliminar, -10);
            grafo.setCordeY(Eliminar, -10);
            grafo.setNombre(Eliminar, -10);
            for (int j = 0; j < tope; j++) {
                for (int k = 0; k < tope - 1; k++) {
                    if (grafo.getCordeX(k) == -10) {
                        grafo.setCordeX(k, grafo.getCordeX(k + 1));
                        grafo.setCordeX(k + 1, -10);
                        grafo.setCordeY(k, grafo.getCordeY(k + 1));
                        grafo.setCordeY(k + 1, -10);
                        grafo.setNombre(k, grafo.getNombre(k + 1));
                        grafo.setNombre(k + 1, -10);
                    }
                }
            }
            for (int j = 0; j < tope; j++) {
                String nombre = grafo.getNombre2(j+1);
                grafo.setNombre(j, j);
                
                grafo.setNombre2(j, nombre);
            }
            for (int j = 0; j < tope + 1; j++) {
                for (int k = 0; k < tope + 1; k++) {
                    if (grafo.getmAdyacencia(j, k) != -1) {
                        grafo.setmAdyacencia(j, k, grafo.getmAdyacencia(j, k));
                    } else {
                        grafo.setmAdyacencia(j, k, 0);
                    }
                    if (grafo.getmCoeficiente(j, k) != -10) {
                        grafo.setmCoeficiente(j, k, grafo.getmCoeficiente(j, k));
                    } else {
                        grafo.setmCoeficiente(j, k, 0);
                    }
                }
            }
            tope--;
            panelGrafo.paint(panelGrafo.getGraphics());
            Pintar.repaint3(tope, grafo);
        }
    }//GEN-LAST:event_eliminarNodoActionPerformed

    private void panelGrafoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_panelGrafoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_panelGrafoMouseClicked

    private void panelCostoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_panelCostoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_panelCostoActionPerformed

    private void jFileChooser2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFileChooser2ActionPerformed

    }//GEN-LAST:event_jFileChooser2ActionPerformed

    private void ExpMinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExpMinActionPerformed
        if (tope < 1)
            JOptionPane.showMessageDialog(null, "Aun no se ha creado Un nodo");
        else {
            exp_min Prim = new exp_min(grafo, tope, aristaMayor);
            Prim.prim();
            panelCosto.setText("" + Prim.getCumulado());
        }
    }//GEN-LAST:event_ExpMinActionPerformed

    private void MFloydActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MFloydActionPerformed
        if (tope == 0)
            JOptionPane.showMessageDialog(null, "Aun no se ha credo un nodo : ");

        else {
            this.setEnabled(false);
            new Matrices(tope, grafo, this).setVisible(true);
        }
    }//GEN-LAST:event_MFloydActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

    }
    private int tope = 0;// lleva el # de nodos creado 
    private int nodoFin;
    private int nodoInicio;
    int n = 0, nn = 0, id, id2;// permite controlar que se halla dado click sobre un nodo
    private int aristaMayor;


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem ExpMin;
    private javax.swing.JMenuItem MFloyd;
    private javax.swing.JMenuItem eliminarArista;
    private javax.swing.JMenuItem eliminarNodo;
    private javax.swing.JLabel imgFondo;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JFileChooser jFileChooser2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu menuArchivos;
    private javax.swing.JMenu menuEliminar;
    private javax.swing.JTextField panelCosto;
    public static javax.swing.JPanel panelGrafo;
    // End of variables declaration//GEN-END:variables
}

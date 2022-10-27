/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Clases;

import Ventanas.Main;
import java.awt.BasicStroke;
import java.awt.Color;
import static Ventanas.Main.panelGrafo;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;


public class Pintar {   
    Color color;
    Grafo grafo;
    int i;
     
   
    public Pintar(){
        
        
    }
    
    public void repaint2(){
        for (int j = 0; j < i; j++) {
            for (int k = 0; k < i; k++) {
                if(grafo.getmAdyacencia(j, k) == 1)
                Pintar.pintarLinea(Main.panelGrafo.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < i; j++) {
            Pintar.pintarCirculo(Main.panelGrafo.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)), grafo.getNombre2(j));
           
       }
   }
    
    public static void repaint3(int tope, Grafo grafo){ 
        for (int j = 0; j < tope; j++) {
            for (int k = 0; k < tope; k++) {
                if(grafo.getmAdyacencia(j, k) == 1)
                     Pintar.pintarLinea(panelGrafo.getGraphics(),grafo.getCordeX(j),grafo.getCordeY(j), grafo.getCordeX(k), grafo.getCordeY(k),grafo.getmCoeficiente(j, k));
            }
        }
        for (int j = 0; j < tope; j++) 
            Pintar.pintarCirculo(panelGrafo.getGraphics(), grafo.getCordeX(j),grafo.getCordeY(j),String.valueOf(grafo.getNombre(j)), grafo.getNombre2(j));
                
   }
    
   public static void pintarCirculo(Graphics g,int x,int y,String n, String nombre){

       ((Graphics2D)g).setColor(Color.red);
       
        ((Graphics2D)g).fillOval(x, y, 18, 18);        
    
        ((Graphics2D)g).drawOval(x, y, 18, 18);
        
        ((Graphics2D)g).setColor(Color.BLACK);
        Font fuente=new Font("Monospaced",Font.BOLD, 16);
        g.setFont(fuente);
        ((Graphics2D)g).drawString(n, x, y);
        ((Graphics2D)g).drawString(nombre, x+3, y+28);
         
         
    }    
  
  public static void pintarLinea(Graphics g, int x1,int y1,int x2,int y2,int tam){
        int xAux = 0; int yAux = 0; 
        ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(2);
        ((Graphics2D)g).setStroke(stroke);         
       ((Graphics2D)g).drawLine(x1+13, y1+13, x2+13, y2+13);
       if(x1<=x2)
           xAux=((x2-x1)/2)+x1;       
        if(x1>x2)
           xAux=((x1-x2)/2)+x2;
        if(y1<y2)
           yAux=((y2-y1)/2)+y1;
        if(y1>=y2)
            yAux=((y1-y2)/2)+y2;        
        Font fuente=new Font("Monospaced",Font.PLAIN, 12);
        g.setFont(fuente);
      ((Graphics2D)g).drawString(String.valueOf(tam), xAux, yAux);
  }   
  public static void pintarCamino(Graphics g, int x1,int y1,int x2,int y2, Color color){
      ((Graphics2D)g).setRenderingHint(RenderingHints.KEY_ANTIALIASING,  RenderingHints.VALUE_ANTIALIAS_ON);
        BasicStroke stroke = new BasicStroke(4);
        ((Graphics2D)g).setStroke(stroke);
        g.setColor(color);
        g.drawLine(x1+13, y1+13, x2+13, y2+13);
  }
   public static void clickSobreNodo(Graphics g,int x,int y,String n,Color co){
       ((Graphics2D)g).setColor(co);    
        ((Graphics2D)g).fillOval(x, y, 18, 18);        
        ((Graphics2D)g).drawOval(x, y, 18, 18);
         
    }

}

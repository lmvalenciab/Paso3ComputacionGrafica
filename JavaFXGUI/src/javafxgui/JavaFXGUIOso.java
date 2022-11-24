/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author SoporteTI
 */
public class JavaFXGUIOso extends JFrame {

    public JavaFXGUIOso() {
        super("Gráficas 2D Java");
        setSize(700, 700);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        Polygon polygon = new Polygon();

        
        polygon.addPoint(150, 140);
        
        polygon.addPoint(100, 220);
        polygon.addPoint(120, 270);
        
        polygon.addPoint(180, 300);
        polygon.addPoint(200, 290);
        polygon.addPoint(220, 300);
        polygon.addPoint(280, 270);
        polygon.addPoint(300, 220);
        polygon.addPoint(250, 140);
        polygon.addPoint(200, 120);
        
        Polygon polygon2 = new Polygon();
        polygon2.addPoint(114, 110);
         polygon2.addPoint(150, 140);
        polygon2.addPoint(114, 200);
        polygon2.addPoint(90, 150);
        
        Polygon polygon3 = new Polygon();
        polygon3.addPoint(286, 110);
         polygon3.addPoint(250, 140);
        polygon3.addPoint(286, 200);
        polygon3.addPoint(310, 150);
        
        Polygon polygon4 = new Polygon();
         polygon4.addPoint(185, 180);
         polygon4.addPoint(150, 230);
         polygon4.addPoint(170, 250);
         polygon4.addPoint(180, 220);
        
         Polygon polygon5 = new Polygon();
         polygon5.addPoint(215, 180);
         polygon5.addPoint(250, 230);
         polygon5.addPoint(230, 250);
         polygon5.addPoint(220, 220);
         
         Polygon polygon6 = new Polygon();
         polygon6.addPoint(185, 305);
         polygon6.addPoint(180, 300);
        polygon6.addPoint(200, 290);
       
        polygon6.addPoint(220, 300);
         
         polygon6.addPoint(215, 305);
          polygon6.addPoint(200, 310);
          
          Polygon polygon7 = new Polygon();
        polygon7.addPoint(180, 280);
        polygon7.addPoint(200, 290);
        polygon7.addPoint(220, 280);
        
        Polygon polygon8 = new Polygon();
        polygon8.addPoint(185, 302);
        polygon8.addPoint(200, 298);
        polygon8.addPoint(215, 302);
        
       
         
        g.drawPolygon(polygon);
         g.drawPolygon(polygon2);
         g.setColor(Color.black);
        g.fillPolygon(polygon2);
         g.drawPolygon(polygon3);
         g.setColor(Color.black);
        g.fillPolygon(polygon3);
         g.drawPolygon(polygon4);
            g.setColor(Color.black);
        g.fillPolygon(polygon4);
         g.drawPolygon(polygon5);
                  g.setColor(Color.black);
        g.fillPolygon(polygon5);
         g.drawPolygon(polygon6);
         g.drawPolygon(polygon7);
         g.setColor(Color.black);
        g.fillPolygon(polygon7);
         g.drawPolygon(polygon8);
         g.setColor(Color.black);
        g.fillPolygon(polygon8);
         
         
         
         
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaFXGUIOso fXGUI = new JavaFXGUIOso();
        fXGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

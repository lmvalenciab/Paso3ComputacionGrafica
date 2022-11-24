/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javafxgui;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Line2D;
import java.awt.geom.Arc2D;
import java.awt.geom.CubicCurve2D;
import java.awt.Polygon;
import java.awt.geom.Ellipse2D;
import java.awt.geom.QuadCurve2D;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author SoporteTI
 */
public class JavaFXGUIAbeja extends JFrame {

    public JavaFXGUIAbeja() {
        super("Gráficas 2D Java");
        setSize(700, 700);
        setVisible(true);
    }
    
    public void paint(Graphics g2) {
        super.paint(g2);
        
        Graphics2D g3 = (Graphics2D)g2;
        
        g3.setStroke(new BasicStroke(6.0f));        
        Ellipse2D ojoIzq = new Ellipse2D.Float(170.0f, 92.0f, 98.0f, 110.0f);
        g3.setColor(Color.black);
        g3.draw(ojoIzq);        
        
        g3.setStroke(new BasicStroke(6.0f));
        Ellipse2D lineaNinaOIzq = new Ellipse2D.Float(206.0f, 127.0f, 27.0f, 29.0f);
        g3.fill(lineaNinaOIzq);
        g3.draw(lineaNinaOIzq);  
        
        g3.setStroke(new BasicStroke(6.0f));
        Ellipse2D lineaNinaODer= new Ellipse2D.Float(266.0f, 127.0f, 27.0f, 29.0f);
        g3.fill(lineaNinaODer);
        g3.draw(lineaNinaODer);
        
        g3.setStroke(new BasicStroke(6.0f));
        CubicCurve2D parte1OjoDer = new CubicCurve2D.Double(256,103,280,78,323,110,321,140);
        g3.draw(parte1OjoDer);
        
        CubicCurve2D parte2OjoIzq = new CubicCurve2D.Double(321,140,323,180,283,206,260,187);
        g3.draw(parte2OjoIzq);
        
        CubicCurve2D alitaDer = new CubicCurve2D.Double(161,120,170,30,229,50,220,87);
        g3.draw(alitaDer);
        
        CubicCurve2D alitaIzq = new CubicCurve2D.Float(131,129,18,68,150,24,160,120);
        g3.draw(alitaIzq);
        
        QuadCurve2D troncoSuperior = new QuadCurve2D.Float(74,193,83,134,170,123);
        g3.draw(troncoSuperior);
        
        CubicCurve2D troncoInferior = new CubicCurve2D.Double(74,196,98,285,276,280,280,198);
        g3.draw(troncoInferior);
         
        g3.setStroke(new BasicStroke(4.0f));
        QuadCurve2D sonrisa = new QuadCurve2D.Float(217,214,230,236,248,217);
        g3.draw(sonrisa);
        
        
        g3.setStroke(new BasicStroke(6.0f));
        QuadCurve2D raya1 = new QuadCurve2D.Float(113,144,92,200,121,244);
        g3.draw(raya1);
        
        g3.setStroke(new BasicStroke(6.0f));
        QuadCurve2D raya2 = new QuadCurve2D.Float(150,128,122,197,157,254);
        g3.draw(raya2);
        
        g3.setStroke(new BasicStroke(6.0f));
        QuadCurve2D raya3 = new QuadCurve2D.Float(176,180,170,220,201,256);
        g3.draw(raya3);
        
        g3.setStroke(new BasicStroke(5.0f));
        g3.drawArc(78, 258, 50, 59, 79, 203);
        g3.drawArc(103, 258, 28, 59, 78, 208);
        g3.drawArc(117, 258, 27, 59, 78, 201);
        
        int [] puntosRayaArribax = {117,268,308,267,226};
        int [] puntosRayaArribay = {258,258,284,257,257};
        g3.drawPolyline(puntosRayaArribax, puntosRayaArribay, 3);
        
        int [] puntosRayaAbajox = {117,268,308,267,226};
        int [] puntosRayaAbajoy = {317,317,284,257,257};
        g3.drawPolyline(puntosRayaAbajox, puntosRayaAbajoy, 3);
        
        int [] punta1 = {267,260,267};
        int [] punta2 = {317,285,257};
        g3.drawPolyline(punta1, punta2, 3);
        g3.drawArc(289, 276, 3, 19, 95, 160);
        
        
        
        Arc2D x = new Arc2D.Double(123,265,29,42,235,248, Arc2D.CHORD);
        g3.draw(x);
        
        Ellipse2D ci = new Ellipse2D.Float(162, 284, 19, 20);
        g3.draw(ci);
        
        Line2D ws = new Line2D.Float(180,284,180,304);
        g3.draw(ws);
        
        QuadCurve2D tgs = new QuadCurve2D.Float(191,284,199,323,207,284);
        g3.draw(tgs);
        
        Line2D wt = new Line2D.Float(219,284,219,303);
        g3.draw(wt);
        
        Line2D wu = new Line2D.Float(219,277,219,277);
        g3.draw(wu);
        
        Line2D ww = new Line2D.Float(250,267,250,303);
        g3.draw(ww);
        
        Ellipse2D cj = new Ellipse2D.Float(230, 284, 19, 20);
        g3.draw(cj);
        
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaFXGUIAbeja fXGUI = new JavaFXGUIAbeja();
        fXGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

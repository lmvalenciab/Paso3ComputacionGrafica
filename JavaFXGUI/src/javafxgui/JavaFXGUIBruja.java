package javafxgui;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;

/**
 *
 * @author SoporteTI
 */
public class JavaFXGUIBruja extends JFrame {

    public JavaFXGUIBruja() {
        super("Gráficas 2D Java");
        setSize(700, 700);
        setVisible(true);
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        
        Polygon polygon = new Polygon();
        
        polygon.addPoint(320, 60);
        polygon.addPoint(260, 170);
        polygon.addPoint(380, 170);
        
        polygon.addPoint(340, 90);
        polygon.addPoint(360, 90);

        g.drawPolygon(polygon);
        g.setColor(Color.pink);
        g.fillPolygon(polygon);
        
        g.setColor(Color.pink);
        g.fillRect(200, 170, 240, 30);

        Polygon polygon2 = new Polygon();

        polygon2.addPoint(260, 200);
        polygon2.addPoint(260, 270);
        polygon2.addPoint(290, 300);
        polygon2.addPoint(350, 300);
        polygon2.addPoint(380, 270);
        polygon2.addPoint(380, 200);

        g.drawPolygon(polygon2);
        g.setColor(Color.green);
        g.fillPolygon(polygon2);
        
        Polygon polygon3 = new Polygon();

        polygon3.addPoint(290, 300);
        polygon3.addPoint(350, 300);
        polygon3.addPoint(380, 390);
        polygon3.addPoint(260, 390);

        g.drawPolygon(polygon3);
        g.setColor(Color.pink);
        g.fillPolygon(polygon3);
        
        g.setColor(Color.black);
        g.fillRect(200, 390, 240, 30);

        g.setColor(Color.LIGHT_GRAY);
        g.fillRect(440, 370, 70, 70);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JavaFXGUIBruja fXGUI = new JavaFXGUIBruja();
        fXGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

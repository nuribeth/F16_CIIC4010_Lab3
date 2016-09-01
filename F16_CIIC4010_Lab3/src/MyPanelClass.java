import java.awt.Color;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.Polygon;

import javax.swing.JPanel;
 
public class MyPanelClass extends JPanel {
            public void paintComponent(Graphics g) {
                        super.paintComponent(g);
 
                        //Compute interior coordinates
                        Insets myInsets = this.getInsets();
                        int x1 = myInsets.left;
                        int y1 = myInsets.top;
                        int x2 = getWidth() - myInsets.right - 1;
                        int y2 = getHeight() - myInsets.bottom - 1;
                        int width = x2 - x1;
                        int height = y2 - y1;
 
                        //Paint the background
                        g.setColor(Color.RED);
                        g.fillRect(x1, y1, width + 1, height + 1);
                        
                      //Draw a border
                       // g.setColor(Color.YELLOW);
                        //g.drawRect(x1, y1, width, height);
                        
                       // g.setColor(Color.GREEN);
                       // g.drawRect(x1+10, y1+10, width-20, height-20);
                        
                        //g.setColor(Color.WHITE);
                        //g.drawLine(x1, y1, x2, y2);
                        
                        //g.setColor(Color.BLUE);
                        //g.drawLine(x1, y2, x2, y1);
                        
                        //g.setColor(Color.LIGHT_GRAY);
                        //g.fillOval(x1+30, y1+27, width-55, height-55);
                        
                        Polygon p3 = new Polygon();
                        p3.addPoint(x1 + 0, y1 + 150);
                        p3.addPoint(x1 + 10, y1 + 149);
                        p3.addPoint(x1 + 25, y1 + 148);
                        p3.addPoint(x1 + 35, y1 + 147);
                        p3.addPoint(x1 + 115, y1 + 115);
                        p3.addPoint(x1 + 40, y1 - 40);
                        p3.addPoint(x1 + 35, y1 - 35);
                        p3.addPoint(x1 + 25, y1 - 25);
                        p3.addPoint(x1 + 10 , y1 - 10);
                        p3.addPoint(x1 + 0, y1 -0);
                        g.setColor(Color.BLUE);
                        g.fillPolygon(p3);
                        
                        Polygon p2 = new Polygon();
                        p2.addPoint(x1 + 25, y1 + 73);
                        p2.addPoint(x1 + 41, y1 + 73);
                        p2.addPoint(x1 + 47, y1 + 58);
                        p2.addPoint(x1 + 53, y1 + 73);
                        p2.addPoint(x1 + 69, y1 + 73);
                        p2.addPoint(x1 + 56, y1 + 83);
                        p2.addPoint(x1 + 61, y1 + 98);
                        p2.addPoint(x1 + 47, y1 + 88);
                        p2.addPoint(x1 + 34, y1 + 98);
                        p2.addPoint(x1 + 38, y1 + 83);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p2);
                        
                        Polygon p4 = new Polygon();
                        p4.addPoint(x1 + 150, y1 + 150);
                        p4.addPoint(x1 + 200, y1 + 160);
                        p4.addPoint(x1 + 250, y1 + 170);
                        p4.addPoint(x1 + 260, y1 + 180);
                        g.setColor(Color.WHITE);
                        g.fillPolygon(p4);
                        
                        
            }
}
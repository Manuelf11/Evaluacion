/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.evaluacion;

import java.awt.Graphics;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;

/**
 *
 * @author Manuel
 */
public class FiguraEnVentana extends JFrame {
    private int clickCount = 0;
    private int x = 0;
    private int y = 0;
    private int d = 0;
    private int [] xPoints = new int [2];
    private int [] yPoints = new int [2];
    
    public FiguraEnVentana() {
    setTitle("Figura en Ventana");
    setSize(500, 400);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    setVisible(true);
    
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 2) {
          Graphics g = getGraphics();
          x=xPoints[1]-xPoints[0];
          y=yPoints[1]-yPoints[0];
          d=(int) Math.sqrt(x*x + y*y);
            System.out.println(d);
          g.drawLine(xPoints[0], yPoints[0], xPoints[0], yPoints[0]+d);
          g.drawLine(xPoints[0], yPoints[0]+d, xPoints[0]+d, yPoints[0]+d);
          g.drawLine(xPoints[0]+d, yPoints[0]+d, xPoints[0]+d, yPoints[0]);
          g.drawLine(xPoints[0]+d, yPoints[0], xPoints[0], yPoints[0]);
        }
      }
    });
//Cuadrado
    /*public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 2) {
          Graphics g = getGraphics();
          x=xPoints[1]-xPoints[0];
          y=yPoints[1]-yPoints[0];
          d=(int) Math.sqrt(x*x + y*y);
            System.out.println(d);
          g.drawLine(xPoints[0], yPoints[0], xPoints[0], yPoints[0]+d);
          g.drawLine(xPoints[0], yPoints[0]+d, xPoints[0]+d, yPoints[0]+d);
          g.drawLine(xPoints[0]+d, yPoints[0]+d, xPoints[0]+d, yPoints[0]);
          g.drawLine(xPoints[0]+d, yPoints[0], xPoints[0], yPoints[0]);
        }
      }
    });*/  
/*Circulo
    addMouseListener(new MouseAdapter() {
      @Override
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 2) {
          Graphics g = getGraphics();
          x=xPoints[1]-xPoints[0];
          y=yPoints[1]-yPoints[0];
          d=(int) Math.sqrt(x*x + y*y);
            System.out.println(d);
          g.drawOval(xPoints[0], yPoints[0]-(d/2), d,d );
        }
      }
    });
*/
/*Rectangulo
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 2) {
          Graphics g = getGraphics();
          g.drawLine(xPoints[0], yPoints[0], xPoints[0], yPoints[1]);
          g.drawLine(xPoints[0], yPoints[1], xPoints[1], yPoints[1]);
          g.drawLine(xPoints[1], yPoints[1], xPoints[1], yPoints[0]);
          g.drawLine(xPoints[1], yPoints[0], xPoints[0], yPoints[0]);
        }
      }
    });
    */
    /* Triangulo
    addMouseListener(new MouseAdapter() {
      public void mouseClicked(MouseEvent e) {
        xPoints[clickCount] = e.getX();
        yPoints[clickCount] = e.getY();
        clickCount++;
        if (clickCount == 3) {
          Graphics g = getGraphics();
          g.drawLine(xPoints[0], yPoints[0], xPoints[1], yPoints[1]);
          g.drawLine(xPoints[1], yPoints[1], xPoints[2], yPoints[2]);
          g.drawLine(xPoints[2], yPoints[2], xPoints[0], yPoints[0]);
        }
      }
    });
*/
/*import java.awt.Graphics;
import java.awt.Polygon;
import javax.swing.JFrame;
Posible estrellaaaa---/-*-*-
    
public class StarDrawer extends JFrame {

    public StarDrawer() {
        setSize(500, 500);
        setVisible(true);
    }

    public void paint(Graphics g) {
        int xPoints[] = {55, 67, 109, 73, 83, 55, 27, 37, 1, 43};
        int yPoints[] = {0, 36, 36, 54, 96, 72, 96, 54, 36, 36};
        int nPoints = 10;

        Polygon star = new Polygon(xPoints, yPoints, nPoints);
        g.drawPolygon(star);
    }

    public static void main(String[] args) {
        StarDrawer starDrawer = new StarDrawer();
    }
}
*/


  }}
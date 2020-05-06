package arbol;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JPanel;
import personas.ClasePersonas;

public class Lienzo extends JPanel implements MouseWheelListener{

    double zoom = 1;

        int gx;
        int gy;
        int bus;
        ClasePersonas persona;
        Node arbol;
    
    public Lienzo(int buscar) {
        setCursor(new Cursor(Cursor.CROSSHAIR_CURSOR));
         setOpaque(false);
        zoom = 0.5;
     
        gx = 0;
        gy = 0;
        bus=buscar;
        
        addMouseWheelListener((MouseWheelListener) this);       
        addMouseMotionListener(new Adaptador_Mouse());
        

        try {
            persona = new ClasePersonas(this.getRootPane(), 0, null, null, null, 0, 0);
            persona.maximo();
            arbol = persona.arbol(buscar,gx-100,gy+50);
        } catch (Exception ex) {
            Logger.getLogger(Lienzo.class.getName()).log(Level.SEVERE, null, ex);
        }
      
    }
    
    

    @Override
    protected void paintComponent(Graphics g) {
super.paintComponent(g);


        Graphics2D g2 = (Graphics2D) g;
      g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING,
    RenderingHints.VALUE_ANTIALIAS_ON);
      g2.setBackground(Color.white);
      

        int id,nivel,nombre,longid,antx=0,anty=0,x=0,y=0;
        
        int ux = getWidth()/2;
        int width = getWidth();
        int height = getHeight();
        
        double zoomWidth = width * zoom;
        double zoomHeight = height * zoom;
        
double anchorx = (width - zoomWidth) / 2;
        double anchory = (height - zoomHeight) / 2;


        g2.translate(anchorx, anchory);
        g2.scale(zoom, zoom);
        g2.translate(-100, -100);

        for (Object[] info : arbol.getDatos()) {
            id= Integer.parseInt(info[0].toString());
            nivel= Integer.parseInt(info[2].toString());
            x = Integer.parseInt(info[3].toString());
            y = Integer.parseInt(info[4].toString());
            nombre= String.valueOf(info[1]).length();
            longid= String.valueOf(info[0]).length();
            antx = Integer.parseInt(info[5].toString());
            anty = Integer.parseInt(info[6].toString());
             g2.setStroke(new BasicStroke(3));         
             //g2.setColor(new Color((int)(Math.random()*255),(int)(Math.random()*255),(int)(Math.random()*255)));
            if(id!=bus){
                           g2.drawLine(ux+gx+x+95, gy+y, ux+gx+antx+95, gy+anty+50);

                       }
        
             
        g2.drawOval(ux+gx+x, gy+y, 200, 50);
        g2.setFont(new Font("arial", 3, 18));
        g2.setColor(Color.red);
 g2.drawString(String.valueOf(info[0]),ux+gx+x+90-longid*2, gy+y+20);
 g2.setFont(new Font("arial", 2, 8));
 g2.setColor(Color.blue);
 g2.drawString(String.valueOf(info[1]),ux+gx+x+90-nombre*2, gy+y+30);
          g2.setColor(Color.black);          
        }
        
   
  
    }


    
  

    @Override
    public void mouseWheelMoved(MouseWheelEvent e) {
    
         if (e.getPreciseWheelRotation() < 0) {
                        zoom += 0.1;
                    } else {
                        zoom -= 0.1;
                    }
//                  zoom += e.getPreciseWheelRotation();
                    if (zoom < 0.01) {
                        zoom = 0.01;
                    }

                    repaint();
    }

  private class Adaptador_Mouse extends MouseAdapter{
  
    int previousX;  
    int previousY;

    @Override
    public void mousePressed(MouseEvent e) {
        previousX = e.getX();
        previousY = e.getY();
        gx=previousX;
        gy=previousY;
        repaint();
    }

    @Override
    public void mouseDragged(MouseEvent e) {

        int y = e.getY();
        int x = e.getX();
        if (x < previousX) {
            gx-=10;
        } else if (x > previousX) {
            gx+=10;
        }
        if (y < previousY) {
            gy-=10;
        } else if (y > previousY) {
            gy+=10;
        }
        previousX=x;
        previousY=y;
        repaint();
    }
  }
    
    
}

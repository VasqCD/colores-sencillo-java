
package colores;

import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JPanel;

public class JPanelColor extends JPanel {
    @Override
    public void paintComponent(Graphics g)
      {
         super.paintComponent(g); 
         this.setBackground(Color.WHITE);
 
        g.setColor(new Color(255, 0, 0));
        g.fillRect(15, 25, 100, 20);     
        g.drawString("RGB actual:" + g.getColor(), 130, 40);
 
                   // establece nuevo color de dibujo, usando valores de punto flotante  22                  
                   g.setColor(new Color(0.50f, 0.75f, 0.0f));
         g.fillRect(15, 50, 100, 20);
        g.drawString("RGB actual:" + g.getColor(), 130, 65);

                   // establece nuevo color de dibujo, usando objetos Color static  27                  g.setColor(Color.BLUE);
        g.fillRect(15, 75, 100, 20);
         g.drawString("RGB actual:" + g.getColor(), 130, 90);
         
         Color color = Color.MAGENTA;
         g.setColor(color);
 
      g.fillRect(15, 100, 100, 20);

      g.drawString("Valores RGB: " + color.getRed() + " ," +
                    color.getGreen() + "," + color.getBlue(), 130, 115);
    
}
    
}

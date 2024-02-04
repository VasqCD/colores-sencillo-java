
package colores;
import javax.swing.JFrame;

public class Colores {

   
    public static void main(String[] args) {
        // TIPO DE VENTANA

        JFrame frame = new JFrame("Uso de Colores");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // AGREGAR PANEL
        JPanelColor jPanelColor = new JPanelColor(); // crea el panel de colores llama a la clase JPanelColor
        frame.add(jPanelColor); // agrega el panel de colores al marco objeto JFrame
        frame.setSize(400, 180); // establece el tamaño del marco
        frame.setVisible(true) ; // hace que el marco sea visible
    }
    
}

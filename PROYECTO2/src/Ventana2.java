import javax.swing.JFrame;
import java.awt.*;

public class Ventana2 {

    public static void main(String[] args) {

        JFrame frame = new JFrame(); // crea un frame
        frame.setTitle("Expendedor"); // le pone titulo al frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out
        frame.setResizable(false); // no resize
        frame.setSize(1000,1000); // tamaño de x tamayo de y
        frame.setVisible(true); // hace el frame visible

        frame.getContentPane().setBackground(new Color(255,182,193)); // color de fondo

    }
}

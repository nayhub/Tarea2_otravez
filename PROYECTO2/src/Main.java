import javax.swing.JFrame;

public class Main {

    public static void main(String[] args) {

    JFrame frame = new JFrame(); // crea un frame
        frame.setTitle("Expendedor"); // le pone titulo al frame
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out
        frame.setResizable(false); // no resize
        frame.setSize(1000,1000); // tamaño de x tamayo de y
        frame.setVisible(true); // hace el frame visible

    }
}
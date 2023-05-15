import javax.swing.*;
import java.awt.*;

public class Ventana extends JFrame{
    public JPanel panel;
    public Ventana(){//creacion de la ventana
        setTitle("Ventana");//nombre de la ventana
        setSize(720,540);//medidas
        setLocationRelativeTo(null);//hace que la ventana se abra en el centro de la pantalla

        Componentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la ventana el programa deja de ejecutarse
    }

    private void Componentes() {
        CrearPaneles();
        CrearEtiquetas();
        CrearBotones();

    }
    private void CrearPaneles(){
        panel = new JPanel();//creacion de un panel

        panel.setLayout(null);//desactiva el diseño para poder editar libremente las etiquetas
        //panel.setBackground(Color.white);//color del panel
        this.getContentPane().add(panel);//que se muestre el panel en la ventana
    }
    //etiqueta1-texto

    private void CrearEtiquetas(){
        JLabel etiqueta = new JLabel("Hola nay",SwingConstants.LEFT);//creacion de etiqueta de texto y ubicacion del texto
        etiqueta.setBounds(500,100,300,200);//medidas y ubicacion de la etiqueta
        etiqueta.setForeground(Color.black);//color de la letra
        etiqueta.setFont(new Font("arial",2,50));//establecer la fuente del texto

        panel.add(etiqueta);//mostrar etiqueta sobre el panel

        //etiqueta2-imagen
        ImageIcon imagen = new ImageIcon("expendedorrr.jpg");
        JLabel etiqueta2 = new JLabel(imagen);//se crea nueva etiqueta y en imageIcon se pone el nombre de la imagen
        etiqueta2.setBounds(500,150,400,400);//tamaño y ubicacion de la ETIQUETA
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400,400,Image.SCALE_SMOOTH)));//tamaño de la IMAGEN y escalado
        panel.add(etiqueta2);
    }

    private void CrearBotones(){
        //boton1-texto
        JButton boton1 = new JButton("Click");//creacion del boton y su texto
        boton1.setBounds(100,100,100,40);//medidas y ubicacion del boton
        boton1.setEnabled(true);//establecemos el encendido del boton
        panel.add(boton1);

        //boton2-imagen
        JButton boton2 = new JButton();
        boton2.setBounds(100,200,100,40);
        //boton2.setBackground(Color.BLUE);//establecer color de fondo
        ImageIcon botonPagar = new ImageIcon("boton.jfif");
        boton2.setIcon(new ImageIcon(botonPagar.getImage().getScaledInstance(boton2.getWidth(),boton2.getHeight(),Image.SCALE_SMOOTH)));//se establece el tamaño igual al del boton
        panel.add(boton2);

    }
}

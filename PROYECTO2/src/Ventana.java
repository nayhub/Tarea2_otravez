import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Ventana extends JFrame {
    private JPanel panel;
    private JLabel etiqueta;
    private JLabel etiqueta2;
    private JRadioButton radioboton1;
    private JRadioButton radioboton2;
    private JRadioButton radioboton3;
    private JRadioButton radioboton4;
    private JRadioButton radioboton5;
    private JRadioButton radioboton6;

    private JButton boton1;
    private JButton boton2;

    public Ventana() {//creacion de la ventana
        setTitle("Ventana");//nombre de la ventana
        setSize(720, 540);//medidas
        setLocationRelativeTo(null);//hace que la ventana se abra en el centro de la pantalla

        Componentes();

        setDefaultCloseOperation(EXIT_ON_CLOSE);//al cerrar la ventana el programa deja de ejecutarse
    }

    private void Componentes() {
        CrearPaneles();
        CrearEtiquetas();
        CrearBotones();
        CrearBotonesRadio();

    }

    private void CrearPaneles() {
        panel = new JPanel();//creacion de un panel

        panel.setLayout(null);//desactiva el diseño para poder editar libremente las etiquetas
        //panel.setBackground(Color.white);//color del panel
        this.getContentPane().add(panel);//que se muestre el panel en la ventana
    }
    //etiqueta1-texto

    private void CrearEtiquetas() {
        etiqueta = new JLabel("Expendedor", SwingConstants.CENTER);//creacion de etiqueta de texto y ubicacion del texto
        etiqueta.setBounds(250, 0, 300, 50);//medidas y ubicacion de la etiqueta
        etiqueta.setForeground(Color.black);//color de la letra
        etiqueta.setFont(new Font("Comic Sans MS", 2, 50));//establecer la fuente del texto

        panel.add(etiqueta);//mostrar etiqueta sobre el panel

        //etiqueta2-imagen
        ImageIcon imagen = new ImageIcon("expendedorrr.jpg");
        etiqueta2 = new JLabel(imagen);//se crea nueva etiqueta y en imageIcon se pone el nombre de la imagen
        etiqueta2.setBounds(200, 50, 400, 400);//tamaño y ubicacion de la ETIQUETA
        etiqueta2.setIcon(new ImageIcon(imagen.getImage().getScaledInstance(400, 400, Image.SCALE_SMOOTH)));//tamaño de la IMAGEN y escalado
        panel.add(etiqueta2);
    }

    private void CrearBotones() {
        //boton1-texto
        boton1 = new JButton("Click");//creacion del boton y su texto
        boton1.setBounds(50, 50, 100, 40);//medidas y ubicacion del boton
        boton1.setEnabled(true);//establecemos el encendido del boton
        panel.add(boton1);

        //boton2-imagen
        boton2 = new JButton();
        boton2.setBounds(50, 100, 100, 40);
        //boton2.setBackground(Color.BLUE);//establecer color de fondo
        ImageIcon botonPagar = new ImageIcon("boton.jfif");
        boton2.setIcon(new ImageIcon(botonPagar.getImage().getScaledInstance(boton2.getWidth(), boton2.getHeight(), Image.SCALE_SMOOTH)));//se establece el tamaño igual al del boton
        panel.add(boton2);

    }

    private void CrearBotonesRadio() {
        radioboton1 = new JRadioButton("Bebida", false);//creacion de radio boton
        radioboton1.setBounds(50, 150, 100, 40);//ubicacion y medidas del radio boton
        panel.add(radioboton1);


        radioboton2 = new JRadioButton("Dulce", false);
        radioboton2.setBounds(50, 200, 100, 40);
        panel.add(radioboton2);

        ButtonGroup grupoRadio = new ButtonGroup();//se crea grupo para que solo se pueda elegir una opcion entre los rbotones que esten dentro del grupo
        grupoRadio.add(radioboton1);
        grupoRadio.add(radioboton2);

        radioboton3 = new JRadioButton("CocaCola", false);
        radioboton3.setBounds(50, 250, 100, 40);
        radioboton3.setEnabled(false);//al estar en flase el boton esta desactivado
        panel.add(radioboton3);



        radioboton4 = new JRadioButton("Sprite", false);
        radioboton4.setBounds(50, 300, 100, 40);
        radioboton4.setEnabled(false);
        panel.add(radioboton4);


        ButtonGroup grupoBebida = new ButtonGroup();
        grupoBebida.add(radioboton3);
        grupoBebida.add(radioboton4);

        radioboton5 = new JRadioButton("Snicker", false);
        radioboton5.setBounds(50, 350, 100, 40);
        radioboton5.setEnabled(false);
        panel.add(radioboton5);

        radioboton6 = new JRadioButton("Super8", false);
        radioboton6.setBounds(50, 400, 100, 40);
        radioboton6.setEnabled(false);
        panel.add(radioboton6);

        ButtonGroup grupoDulce = new ButtonGroup();
        grupoDulce.add(radioboton5);
        grupoDulce.add(radioboton6);

        eventoOyenteRaton();//creacion de oyente de raton
    }

    private void eventoOyenteRaton() {
        MouseListener eventoRaton = new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {//evento de cuando se hace click
              radioboton3.setEnabled(true);//activa el boton al dar click al radioboton1
              radioboton4.setEnabled(true);
              radioboton5.setEnabled(false);//desactiva el boton al dar click al radioboton1
              radioboton5.setSelected(false);//si es que el boton esta seleccionado, al dar click al radioboton1 deja de estar seleccionado
              radioboton6.setEnabled(false);
              radioboton6.setSelected(false);
            }

            @Override
            public void mousePressed(MouseEvent e) {//cuando se clickea pero sin soltar el click

            }

            @Override
            public void mouseReleased(MouseEvent e) {//cuando se suelta el click
                panel.add(radioboton4);
            }

            @Override
            public void mouseEntered(MouseEvent e) {//pasar el mouse por el boton
                panel.add(radioboton3);
            }

            @Override
            public void mouseExited(MouseEvent e) {//sacar el mouse de sobre el boton

            }

        };
        radioboton1.addMouseListener(eventoRaton);//boton al que se le aplican los eventos

    MouseListener eventoRaton2 = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {//evento de cuando se hace click
            radioboton3.setEnabled(false);
            radioboton3.setSelected(false);
            radioboton4.setEnabled(false);
            radioboton4.setEnabled(false);
            radioboton5.setEnabled(true);
            radioboton6.setEnabled(true);

        }

        @Override
        public void mousePressed(MouseEvent e) {//cuando se clickea pero sin soltar el click

        }

        @Override
        public void mouseReleased(MouseEvent e) {//cuando se suelta el click
            panel.add(radioboton4);
        }

        @Override
        public void mouseEntered(MouseEvent e) {//pasar el mouse por el boton
            panel.add(radioboton3);
        }

        @Override
        public void mouseExited(MouseEvent e) {//sacar el mouse de sobre el boton

        }

    };
        radioboton2.addMouseListener(eventoRaton2);//boton al que se le aplican los eventos
}
}


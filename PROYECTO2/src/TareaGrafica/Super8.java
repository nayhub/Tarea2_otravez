package TareaGrafica;

import javax.swing.*;
import java.awt.*;
public class Super8 extends Producto {
    public Super8(int numSerie, int x, int y, int escala) {
        super(numSerie, x, y, escala);
    }

    @Override
    public String consumir() {
        return "Super8";
    }

    @Override
    public void paint(Graphics g) {
        JButton JBoton;

        JBoton = new JButton();//creacion del boton
        ImageIcon botonSuper8 = new ImageIcon("super8.png");
        JBoton.setBounds(225, 50, 200, 150);//medidas y ubicacion del boton
        JBoton.setIcon(new ImageIcon(botonSuper8.getImage().getScaledInstance(JBoton.getWidth(),JBoton.getHeight(), Image.SCALE_SMOOTH)));
        setJButton(JBoton);
    }
}
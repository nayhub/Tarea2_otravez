package TareaGrafica;

import javax.swing.*;

public abstract class Producto extends JPanel{
    private int numSerie;
    private int x, y, Tamaño;
    private JButton JBoton;
    public Producto(int numSerie, int x, int y, int escala){
        this.numSerie = numSerie;
        this.x = x;
        this.y = y;
        this.Tamaño = escala;
    }
    public int getSerie(){
        return numSerie;
    }
    public void changeLocation(int x,int y){
        this.x = x;
        this.y = y;
    }
    public void setJButton(JButton act){
        JBoton = act;
    }
    public int getx(){
        return x;
    }
    public int gety(){
        return y;
    }
    public int getTamaño(){
        return Tamaño;
    }
    public abstract String beber();
}
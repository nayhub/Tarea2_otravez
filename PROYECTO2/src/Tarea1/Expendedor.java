package Tarea1;

import Tarea1.*;

/** clase del expendedor
 *
 */

class Expendedor {
    private Deposito coca;
    private Deposito sprite;
    private Deposito snicker;
    private Deposito super8;
    private DepositoV monVu;
    private int precio;
    public static final int COCA = 1;
    public static final int SPRITE = 2;
    public static final int SNICKER = 3;
    public static final int SUPER8 = 4;

    /**
     *  constructor del expendedor
     * @param numProducto
     * @param precioProducto
     */


    public Expendedor(int numProducto, int precioProducto) {
        coca = new Deposito();
        sprite = new Deposito();
        snicker = new Deposito();
        super8 = new Deposito();
        monVu = new DepositoV();


        for (int i = 0; i < numProducto; i++) {
            Bebida cc = new CocaCola(100 + i);
            coca.addProducto(cc);
            Bebida sp = new Sprite(200 + i);
            sprite.addProducto(sp);
            Dulce sk = new Snicker(300 + i);
            snicker.addProducto(sk);
            Dulce s8 = new Super8(400 + i);
            super8.addProducto(s8);
        }
    }

    /**
     * Exepción para cuando no hay producto o el pago es insuficiente
     * @param m
     * @param n
     * @return
     * @throws NoHayProductoExcption
     * @throws PagoInsuficienteException
     */


    public Producto comprarBebida(Moneda m, int n)throws NoHayProductoExcption, PagoInsuficienteException {
        if(m==null)
            throw new PagoIncorrectoException("pago invalido");

        Bebida cc = null;
        Bebida sp = null;
        Dulce sk = null;
        Dulce s8 = null;
        int V = m.getValor();

        if (m != null && m.getValor() >= precio) {

            if (n == 1) {
                cc =(Bebida) coca.getProducto();{
                    if (cc != null) {
                        for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                            Moneda100 a = new Moneda100();
                            monVu.addMoneda(a);
                        }}
                    else if (cc == null) {
                        throw new NoHayProductoExcption("No queda cocacola");

                    }

                }

            } else if (n == 2) {

                sp =(Bebida) sprite.getProducto();
                if (sp != null) {
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda100 a = new Moneda100();
                        monVu.addMoneda(a);
                    }
                } else if (sp == null) {
                    throw new NoHayProductoExcption("No quedan sprite");
                }
            } else if (n == 3) {
                sk = (Dulce) snicker.getProducto();
                if (sk != null){
                    for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                        Moneda100 a = new Moneda100();
                        monVu.addMoneda(a);
                    }} else if (sk == null) {
                    throw new NoHayProductoExcption("No quedan snicker");
                }

            } else if (n == 4) {
                s8 = (Dulce) super8.getProducto();
                if (s8 != null){for (int i = 0; i < (m.getValor() - precio) / 100; i++) {
                    Moneda100 a = new Moneda100();
                    monVu.addMoneda(a);
                }
                } else if (s8 == null) {
                    throw new NoHayProductoExcption("No quedan super8");
                }

            } else {
                monVu.addMoneda(m);
                return null;
            }
        } else {

            monVu.addMoneda(m);
            return null;
        }
        monVu.addMoneda(m);
        return null;
    }

    /** metodo para obtener el precio con un getter
     *
     * @return precio
     */
    public int getPrecio() {
        return precio;
    }

    /** metodo para obtener el vuelto en monedas
     *
     */

    public Moneda getVuelto() {
        return (Moneda) monVu.getMoneda();
    }

}
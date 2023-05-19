package Tarea1;

/**
 superclase abstracta para Tarea1.Snicker y Tarea1.Super8, subclase de Producto
 */
abstract class Dulce extends Producto {

    /** constructor el cual recibe la serie de la bebida
     *
     * @param serie
     */

    public Dulce(int serie) {
        super(serie);
    }

    /** subclase de Tarea1.Dulce
     *
     */
}
class Snicker extends Dulce{

    /** constructor el cual recibe la serie de Tarea1.Snicker
     *
     * @param serie
     */
    public Snicker(int serie)
    {
        super(serie);
    }

    /** metodo para obtener el nombre del dulce con un getter
     *
     * @return snicker
     */

    public String getnombre() {
        return "snicker";
    }
}

/** subclase de Tarea1.Dulce
 *
 */
class Super8 extends Dulce {

    /** constructor el cual recibe la serie de Tarea1.Super8
     *
     * @param serie
     */

    public Super8(int serie)
    {
        super(serie);
    }

    /** constructor el cual recibe la serie de Tarea1.Super8
     *
     * @return Tarea1.Super8
     */
    public String getnombre() {

        return "super8";
    }
}
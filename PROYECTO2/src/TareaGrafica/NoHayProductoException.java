package TareaGrafica;

/** clase para la exepción en el caso de que no hayan productos
 *
 */
public class NoHayProductoException extends Exception{

    /** constructor el cual recibe la exepción si es que no hay producto
     *
     * @param NoHay
     */
    public NoHayProductoException(String NoHay){
        super(NoHay);
    }
}
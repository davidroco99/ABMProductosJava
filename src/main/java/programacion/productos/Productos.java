

package programacion.productos;

import interfazGrafica.ABMProducto;

/**
 *
 * @author david
 */
public class Productos {

    public static void main(String[] args) {
        ABMProducto pantallaInicial = ABMProducto.getInstance();
        pantallaInicial.setVisible(true);
        pantallaInicial.setLocationRelativeTo(null);
    }
}

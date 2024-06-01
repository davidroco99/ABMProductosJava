
package entidades;

/**
 *
 * @author david
 */
public class Producto {
    private String nombre;
    private int cantidad;
    private int codigo;
    private String detalle;

    public Producto() {
    }

    public Producto(String nombre, int cantidad, int codigo, String detalle) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.detalle = detalle;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    @Override
    public String toString() {
        return "Producto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", codigo=" + codigo + ", detalle=" + detalle + '}';
    }
    
    
    
    
}

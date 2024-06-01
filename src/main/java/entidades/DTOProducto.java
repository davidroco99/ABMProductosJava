
package entidades;

/**
 *
 * @author david
 */
public class DTOProducto {
    private String nombre;
    private String cantidad;
    private String codigo;
    private String detalle;

    public DTOProducto() {
    }

    public DTOProducto(String nombre, String cantidad, String codigo, String detalle) {
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

    public String getCantidad() {
        return cantidad;
    }

    public void setCantidad(String cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
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
        return "DTOProducto{" + "nombre=" + nombre + ", cantidad=" + cantidad + ", codigo=" + codigo + ", detalle=" + detalle + '}';
    }
    
    
    
    
    
}


package entidades;

import java.util.ArrayList;


public class ControladoraProducto {
    
    ArrayList<Producto> productos;

    private static ControladoraProducto instance = null;

       
    public static ControladoraProducto getInstance() {
        if (instance == null) {
            instance = new ControladoraProducto();
        }
        return instance;
    }
       
    
    public ControladoraProducto() {
        this.productos = new ArrayList<Producto>();
    }

    public void agregarProducto(DTOProducto dtoProducto) {
        Producto prod = new Producto();
        
        prod.setNombre(dtoProducto.getNombre());
        prod.setDetalle(dtoProducto.getDetalle());
        
        prod.setCantidad(Integer.parseInt(dtoProducto.getCantidad()));
        prod.setCodigo(Integer.parseInt(dtoProducto.getCodigo()));
        
        this.productos.add(prod);
        
        this.mostrarProductos();
    }
    
    public void mostrarProductos() {
        System.out.println("**********************************************");
        if (this.productos != null) {
            
            for (Producto prod : productos) {
                System.out.println("El nombre: " + prod.getNombre() +"; El código es: "+ prod.getCodigo() + "; cantidad: " + prod.getCantidad() + "; El detalle es: " + prod.getDetalle());

            }
        }
        System.out.println("**********************************************");
    }

    public ArrayList<DTOProducto> traerProductos() {
        
        ArrayList<DTOProducto> listaProductos = new ArrayList<DTOProducto>();
        
        if (this.productos != null) {
            
            for (Producto prod : productos) {
               DTOProducto dtoProducto = new DTOProducto();
               
               dtoProducto.setNombre(prod.getNombre());
               dtoProducto.setCodigo(String.valueOf(prod.getCodigo()));
               dtoProducto.setCantidad(String.valueOf(prod.getCantidad()));
               dtoProducto.setDetalle(prod.getDetalle());
               listaProductos.add(dtoProducto);
            }
        }
             
        
        return listaProductos; 
    }

    public void borrarProducto(String codigo) {
        
        int cod = Integer.parseInt(codigo);
        
        Producto prodBorrar = new Producto();
                               
        if (this.productos !=null){
            for (Producto prod : this.productos){
                if (prod.getCodigo()== cod){
                    System.out.println("**********************************************");
                    System.out.println("Se eliminó el producto: ");
                    System.out.println(prod.toString());
                    System.out.println("**********************************************");
                    prodBorrar = prod; 
                    
                }        
            }
        }
        this.productos.remove(prodBorrar);//tiene que ir fuera del bucle porque se está recorriendo el array
        
    }

    public DTOProducto traerProducto(String codigo) {
        
        int cod = Integer.parseInt(codigo);
        
        Producto prodMod = new Producto();
                               
        if (this.productos !=null){
            for (Producto prod : this.productos){
                if (prod.getCodigo()== cod){
                    System.out.println("**********************************************");
                    System.out.println("Se Buscó el producto: ");
                    System.out.println(prod.toString());
                    System.out.println("**********************************************");
                    prodMod = prod; 
                    
                }        
            }
        }
        
            DTOProducto dtoProducto = new DTOProducto();
            dtoProducto.setNombre(prodMod.getNombre());
            dtoProducto.setCodigo(String.valueOf(prodMod.getCodigo()));
            dtoProducto.setCantidad(String.valueOf(prodMod.getCantidad()));
            dtoProducto.setDetalle(prodMod.getDetalle());
            return dtoProducto;
    }

    public void modificarProducto(DTOProducto dtoProducto, String codigo) {
        int cod = Integer.parseInt(codigo);
        int indice;
        int puntero;
        indice=0;
        puntero= 0;
        
        Producto prodMod = new Producto();
                               
        if (this.productos !=null){
            for (Producto prod : this.productos){
                if (prod.getCodigo()== cod){
                    System.out.println("**********************************************");
                    System.out.println("Se eliminó el producto: ");
                    System.out.println(prod.toString());
                    System.out.println("**********************************************");
                    prodMod = prod; 
                    puntero = indice;
                }   
            indice++;
            }
        }
       
        this.productos.remove(prodMod);
        
        Producto prod = new Producto();
        prod.setNombre(dtoProducto.getNombre());
        prod.setDetalle(dtoProducto.getDetalle());
        prod.setCantidad(Integer.parseInt(dtoProducto.getCantidad()));
        prod.setCodigo(Integer.parseInt(dtoProducto.getCodigo()));
        this.productos.add(puntero, prod);
      
        this.mostrarProductos();
        
    }
    
}

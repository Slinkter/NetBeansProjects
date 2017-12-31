
package tienda.bean;


public class Producto {
    
    private int idProducto;
    private String nomProducto;
    private int precio;

    public Producto() {
    }

    public Producto(String nomProducto, int precio) {
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public Producto(int idProducto, String nomProducto, int precio) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getNomProducto() {
        return nomProducto;
    }

    public void setNomProducto(String nomProducto) {
        this.nomProducto = nomProducto;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

   
    
            
    
    
    
    
}


package tienda.bean;


public class Producto {
    
    private int idProducto;
    private String nomProducto;
    private float precio;

    public Producto(int idProducto, String nomProducto, float precio) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public Producto(String nomProducto, float precio) {
        this.nomProducto = nomProducto;
        this.precio = precio;
    }

    public Producto() {
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

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
            
    
    
    
    
}

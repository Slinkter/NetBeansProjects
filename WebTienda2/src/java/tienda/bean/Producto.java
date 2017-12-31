
package tienda.bean;

public class Producto {
    
    private int idProducto;
    private String nomProducto;
    private int precio;
    private int ancho;
    private int altura;
    private float resultado;
    

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

    public Producto(int idProducto, String nomProducto, int precio, int ancho, int altura) {
        this.idProducto = idProducto;
        this.nomProducto = nomProducto;
        this.precio = precio;
        this.ancho = ancho;
        this.altura = altura;
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

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public float getResultado() {
        return resultado;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }
 
    
}


/**
 * Write a description of class z here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ProductoC {
    private String codigo;
    private String nombre;
    private double precio;
    private int cantidad;

    public ProductoC(String codigo, String nombre, double precio, int cantidad) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        if (codigo != null) {
            this.codigo = codigo;
        } else {
            this.codigo = "";
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null) {
            this.nombre = nombre;
        } else {
            this.nombre = "";
        }
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
}

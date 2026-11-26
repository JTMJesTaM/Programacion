package unidad3;

public class Producto {
    String nombre;
    String categoria;
    double precio;
    int stock;

    public void aplicarDescuento(int porcentaje) {
        this.precio = this.precio - precio * porcentaje / 100;
    }

    /**
     * Incrementa el stock del producto
     * 
     * @param incremento cantidad de unidades nuevas para el stock
     * @return El stock actualizado
     */
    public int recibirStock(int incremento) {
        this.stock += incremento;
        return this.stock;
    }
}

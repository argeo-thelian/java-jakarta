package models.producto;
abstract  public class Producto implements IProducto{
    public int precio;

    public Producto(int precio){
        this.precio = precio;
    }
    
    @Override
    public int getPrecio() {
        return this.precio;
    }

    @Override
    public double getPrecioVenta() {
        return 0.0;
    }
}

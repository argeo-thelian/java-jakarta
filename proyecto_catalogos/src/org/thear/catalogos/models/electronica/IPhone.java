package models.electronica;

public class IPhone extends Electronico{

    private String modelo;
    private String color;
    
    
    public IPhone(int precio, String fabricante, String modelo, String color) {
        super(precio, fabricante);
        this.modelo = modelo;
        this.color = color;
    }
    
    public String getModelo() {
        return this.modelo;
    }

    public String getColor() {
        return this.color;
    }
    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.3;
    }
    
    @Override
    public String toString() {
        return "iPhone tiene un precio $" + this.getPrecioVenta() + " MXN, " +
                "su fabricante es  : " + this.getFabricante() + 
                ", el modelo es : " + this.getModelo() +
                ", el colore es : " + this.getColor();
    }
}

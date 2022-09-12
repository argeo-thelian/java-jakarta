package models.electronica;

public class TvLcd extends Electronico{
    private int pulgadas;

    public TvLcd(int precio, String fabricante, int pulgadas) {
        super(precio, fabricante);
        this.pulgadas = pulgadas;
    }

    public int getPulgadas() {
        return pulgadas;
    }
    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.3;
    }
    @Override
    public String toString() {
        return "TvLcd tiene un precio $" + this.getPrecioVenta() + " MXN, " +
                "su fabricante es  : " + this.getFabricante() + 
                ", su tramaño en pulgadas es : " + this.getPulgadas();
    }
}

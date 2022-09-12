package models.libro;

import java.util.Date;

public class Comics extends Libro{

    private String personaje;

    public Comics(int precio, Date fechaPublicacion, String autor, String titulo, String editorial, String personaje) {
        super(precio, fechaPublicacion, autor, titulo, editorial);
        this.personaje = personaje;
    }

    public String getPersonaje() {
        return personaje;
    }
    @Override
    public double getPrecioVenta() {
        return this.getPrecio() * 1.23;
    }

    @Override
    public String toString() {
        return "El comic es: " + this.getTitulo() + 
                "\n el autor es: " + this.getAutor() +
                "\n la editorial es: " + this.getEditorial() + 
                "\n el personaje principal es: " + this.getPersonaje() +
                "\n la fecha de publicación es: " + this.getFechaPublicacion()+
                "\n tiene un costo de: " + this.getPrecioVenta() * 1.29;
    }
    
}

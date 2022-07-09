package com.thear.app.hogar;

public class Persona {
    private String nombre;
    private String apellido;
    private ColorPelo colorPelo;

    public static final String GENERO_MASCULINO = "Masculino";
    public static final String GENERO_FEMENINO = "Femenino";

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    Gato gato = new Gato();

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + getNombre()+ '\'' +
                ", gato=" + gato.getNombre() +
                ", colorPelo = " + colorPelo +
                '}';
    }

    public String lanzarPelota(){
        return "Lanzar la pelota al perro!";
    }

    public static String saludar(){
        return "Hola que tal!";
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public ColorPelo getColorPelo() {
        return colorPelo;
    }

    public void setColorPelo(ColorPelo colorPelo) {
        this.colorPelo = colorPelo;
    }

    public void setGato(Gato gato) {
        this.gato = gato;
    }

    public Gato getGato() {
        return gato;
    }
}

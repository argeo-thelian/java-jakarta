package com.arthe.zoologico.mamifero.canino;

import com.arthe.zoologico.mamifero.Mamifero;

abstract public class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillos;
    protected String mensaje = "El canino %s debe de %s a la hora que el guste, tiene un color %s y un tamaño de colmillos %f";

    public Canino(String color, Float tamanoColmillos) {
        super();
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public Canino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, String color, Float tamanoColmillos) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.color = color;
        this.tamanoColmillos = tamanoColmillos;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Float getTamanoColmillos() {
        return tamanoColmillos;
    }

    public void setTamanoColmillos(Float tamanoColmillos) {
        this.tamanoColmillos = tamanoColmillos;
    }

    @Override
    public String comer() {
        return getAcciones("comer");
    }

    @Override
    public String dormir() {
        return getAcciones("dormir");
    }

    @Override
    public String correr() {
        return getAcciones("correr");
    }

    @Override
    public String comunicarse() {
        return getAcciones("comunicarse");
    }

    @Override
    public String toString() {
        return super.toString() + "de el tipo Canino con" +
                "color= " + color +
                ", tamanoColmillos= " + tamanoColmillos + " ";
    }

    public String getAcciones(String accion){
       return String.format(this.mensaje, accion, this.color, this.tamanoColmillos);
    }
}

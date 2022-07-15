package com.arthe.zoologico.mamifero.canino;

import com.arthe.zoologico.mamifero.Mamifero;
import com.arthe.zoologico.mamifero.MensajeFormateable;

abstract public class Canino extends Mamifero {
    protected String color;
    protected Float tamanoColmillos;


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
        return null;
    }

    @Override
    public String dormir() {
        return null;
    }

    @Override
    public String correr() {
        return null;
    }

    @Override
    public String comunicarse() {
        return null;
    }

}

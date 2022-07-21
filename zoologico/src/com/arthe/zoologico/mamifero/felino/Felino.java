package com.arthe.zoologico.mamifero.felino;

import com.arthe.zoologico.mamifero.Mamifero;

abstract public class Felino extends Mamifero {
    protected Float tamanoGarras;
    protected Integer velocidad;
    protected String mensaje = "El felino %s debe de %s a la hora que el guste, tiene una tamaño de garras %f y una velocidad de %d";


    public Felino(Float tamanoGarras, Integer velocidad) {
        super();
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Felino(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad) {
        super(habitat, altura, largo, peso, nombreCientifico);
        this.tamanoGarras = tamanoGarras;
        this.velocidad = velocidad;
    }

    public Float getTamanoGarras() {
        return tamanoGarras;
    }

    public void setTamanoGarras(Float tamanoGarras) {
        this.tamanoGarras = tamanoGarras;
    }

    public Integer getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(Integer velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String comer() {
        return getAccion("comer");
    }

    @Override
    public String dormir() {
        return getAccion("dormir");
    }

    @Override
    public String correr() {
        return getAccion("correr");
    }

    @Override
    public String comunicarse() { return getAccion("comunicarse");}

    public String getAccion(String accion){
        String castString = "";
        if (this instanceof Guepardo){
            castString = String.format(this.mensaje, "Guepardo",accion, this.tamanoGarras, this.velocidad);
        } else if(this instanceof Leon){
            castString = String.format(this.mensaje, "Leon",accion, this.tamanoGarras, this.velocidad);
        }else if(this instanceof Tigre){
            castString = String.format(this.mensaje, "Tigre",accion, this.tamanoGarras, this.velocidad);
        }
        return castString;
    }
}

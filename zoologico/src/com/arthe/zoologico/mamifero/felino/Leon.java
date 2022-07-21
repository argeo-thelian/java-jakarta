package com.arthe.zoologico.mamifero.felino;

public class Leon extends Felino{

    private Integer numManada;
    private Float potenciaRugiendoDecibel;

    public Leon(Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugiendoDecibel) {
        super(tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugiendoDecibel = potenciaRugiendoDecibel;
    }

    public Leon(String habitat, Float altura, Float largo, Float peso, String nombreCientifico, Float tamanoGarras, Integer velocidad, Integer numManada, Float potenciaRugiendoDecibel) {
        super(habitat, altura, largo, peso, nombreCientifico, tamanoGarras, velocidad);
        this.numManada = numManada;
        this.potenciaRugiendoDecibel = potenciaRugiendoDecibel;
    }

    public Integer getNumManada() {
        return numManada;
    }

    public void setNumManada(Integer numManada) {
        this.numManada = numManada;
    }

    public Float getPotenciaRugiendoDecibel() {
        return potenciaRugiendoDecibel;
    }

    public void setPotenciaRugiendoDecibel(Float potenciaRugiendoDecibel) {
        this.potenciaRugiendoDecibel = potenciaRugiendoDecibel;
    }

    @Override
    public String comer() {
        return super.comer();
    }

    @Override
    public String dormir() {
        return super.dormir();
    }

    @Override
    public String correr() {
        return super.correr();
    }

    @Override
    public String comunicarse() {
        return super.comunicarse();
    }

    @Override
    public String toString() {
        return  super.toString() + " dado que es Leon tiene " +
                "numManada = " + numManada +
                ", potenciaRugiendoDecibel = " + potenciaRugiendoDecibel;
    }
}

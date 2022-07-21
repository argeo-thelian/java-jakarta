package com.arthe.poointerfaces.imprenta.model;

public class Informe extends Hoja implements Imprimible{

    private Persona autor;
    private String revisor;

    public Informe (Persona autor, String revisor, String contenido){
        super(contenido);
        this.autor = autor;
        this.revisor = revisor;
    }

    @Override
    public String imprimir() {
        return "Informe escrito por: " + autor.toString() +
                "\nRevisado por: " + revisor +
                "\n " + this.contenido;
    }
}

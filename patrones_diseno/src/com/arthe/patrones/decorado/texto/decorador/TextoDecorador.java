package com.arthe.patrones.decorado.texto.decorador;

import com.arthe.patrones.decorado.texto.Formateable;

abstract public class TextoDecorador implements Formateable {
    protected Formateable texto;

    public TextoDecorador(Formateable texto) {
        this.texto = texto;
    }
}

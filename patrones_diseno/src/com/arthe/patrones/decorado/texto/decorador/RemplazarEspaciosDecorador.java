package com.arthe.patrones.decorado.texto.decorador;

import com.arthe.patrones.decorado.texto.Formateable;

public class RemplazarEspaciosDecorador extends TextoDecorador{

    public RemplazarEspaciosDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().replace(" ", "_");
    }
}

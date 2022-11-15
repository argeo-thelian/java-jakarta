package com.arthe.patrones.decorado.texto.decorador;

import com.arthe.patrones.decorado.texto.Formateable;

public class MayusculasDecorador extends TextoDecorador{

    public MayusculasDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        return texto.darFormato().toUpperCase();
    }
}

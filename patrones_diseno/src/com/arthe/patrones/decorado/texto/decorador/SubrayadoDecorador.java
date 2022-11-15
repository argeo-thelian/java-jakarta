package com.arthe.patrones.decorado.texto.decorador;

import com.arthe.patrones.decorado.texto.Formateable;

public class SubrayadoDecorador extends TextoDecorador{

    public SubrayadoDecorador(Formateable texto) {
        super(texto);
    }

    @Override
    public String darFormato() {
        int largo = texto.darFormato().length();
        StringBuilder sb = new StringBuilder(texto.darFormato());
        sb.append("\n");
        for (int i = 1; i < largo; i++) {
            sb.append("_");
        }
        return sb.toString();
    }
}

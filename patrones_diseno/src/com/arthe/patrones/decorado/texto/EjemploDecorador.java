package com.arthe.patrones.decorado.texto;

import com.arthe.patrones.decorado.texto.decorador.MayusculasDecorador;
import com.arthe.patrones.decorado.texto.decorador.RemplazarEspaciosDecorador;
import com.arthe.patrones.decorado.texto.decorador.SubrayadoDecorador;

public class EjemploDecorador {
    public static void main(String[] args) {
        Formateable texto = new Texto("Hola buenas como estas!");
        MayusculasDecorador mayusculas = new MayusculasDecorador(texto);
        RemplazarEspaciosDecorador remplazar = new RemplazarEspaciosDecorador(mayusculas);
        SubrayadoDecorador subraya = new SubrayadoDecorador(remplazar);

        System.out.println(remplazar.darFormato());

        System.out.println(subraya.darFormato());

    }
}

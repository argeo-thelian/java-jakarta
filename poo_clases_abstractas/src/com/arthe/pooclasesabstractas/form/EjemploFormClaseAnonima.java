package com.arthe.pooclasesabstractas.form;

import com.arthe.pooclasesabstractas.form.elmentos.ElementoForm;

import java.util.Arrays;
import java.util.List;

public class EjemploFormClaseAnonima {
    public static void main(String[] args) {
        ElementoForm saludar = new ElementoForm("saludo") {
            @Override
            public String dibujarHtml() {
                return "<input disabled name='"+this.nombre+"' value='"+this.valor+"'>";
            }
        };
        saludar.setValor("Hola que tal, este es un campo que está deshabilitado!");

        System.out.println(saludar.dibujarHtml());

    }
}

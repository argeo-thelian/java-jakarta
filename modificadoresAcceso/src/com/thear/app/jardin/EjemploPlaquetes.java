package com.thear.app.jardin;

import com.thear.app.hogar.ColorPelo;
import com.thear.app.hogar.Persona;
import static  com.thear.app.hogar.Persona.saludar;
import static  com.thear.app.hogar.Persona.GENERO_FEMENINO;
import static  com.thear.app.hogar.Persona.GENERO_MASCULINO;
public class EjemploPlaquetes {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Argeo");
        persona.setColorPelo(ColorPelo.CAFE);

        System.out.println(persona.toString());

//        Gato gato = new Gato();
//        gato.setNombre("Miauu");
//        System.out.println(gato.getNombre());
//
        Perro perro = new Perro();
        perro.setNombre("Bob");
        perro.setRaza("Bulldog");
        System.out.println(perro.toString());

        String jugando = perro.jugar(persona);
        System.out.println("jugando = " + jugando);

        String saludo = Persona.saludar();
        String saludo2 = saludar();
        System.out.println("Saludo 1 = " +saludo);
        System.out.println("Saludo 2 = " +saludo2);

        String generoMujer = GENERO_FEMENINO;
        String generoHombre = GENERO_MASCULINO;
        System.out.println("Personas = " + generoMujer + " y " + generoHombre);
    }


}

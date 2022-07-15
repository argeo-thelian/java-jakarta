package com.arthe.zoologico;

import com.arthe.zoologico.mamifero.Mamifero;
import com.arthe.zoologico.mamifero.felino.Leon;

public class EjemploMamifero {
    public static void main(String[] args) {
        Mamifero[] mamiferos = new Mamifero[6];

        Mamifero leon = new Leon("Sabana",1.60f,2.1f, 400f,"Leonidus",0.15f,60,20,130.0f);

        mamiferos[0] = leon;
        mamiferos[0].comer();

        System.out.println(mamiferos[0].comer());
    }
}

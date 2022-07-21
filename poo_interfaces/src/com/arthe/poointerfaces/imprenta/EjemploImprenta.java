package com.arthe.poointerfaces.imprenta;

import com.arthe.poointerfaces.imprenta.model.*;

public class EjemploImprenta {
    public static void main(String[] args) {
        Curriculum cv = new Curriculum(new Persona("John","Doe"), "Ingeniero de sistemas", "Resume de ..... trayecot ....");
        cv.addExperiencias("Java")
                .addExperiencias("Oracle DBA")
                .addExperiencias("Spring Framework")
                .addExperiencias("Desarrollo fullstack")
                .addExperiencias("Angular");

        Informe informe = new Informe(new Persona("Martin", "Fowler"), "James", "Estudios sobre microservicion");


        Libro libro = new Libro(new Persona("Erich"," Gamma"), "Patron de diseños: Elementos Reusables POO",
                Genero.PROGRAMACION);
        libro.addPagina(new Pagina("Patrón Singleton"))
                .addPagina(new Pagina("Patrón Observador"))
                .addPagina(new Pagina("Patrón Factory"))
                .addPagina(new Pagina("Composite"))
                .addPagina(new Pagina("Facade"));

        Imprimible.imprimir(cv);
        imprimir(informe);
        imprimir(libro);
        imprimir(new Imprimible() { });
    }

    public static void imprimir(@org.jetbrains.annotations.NotNull Imprimible imprimible){
        System.out.println(imprimible.imprimir());
    }
}

package com.arthe.patrones.composite;

import com.arthe.patrones.composite.archivos.Archivo;
import com.arthe.patrones.composite.archivos.Directorio;

public class EjemploCompositeBuscar {
    public static void main(String[] args) {
        Directorio doc = new Directorio("Documentos");
        Directorio java = new Directorio("Java");

        java.addComponente(new Archivo("patron-composite.docx"));

        Directorio stream = new Directorio("Api Stream");
        stream.addComponente(new Archivo("stream-map.docx"));

        java.addComponente(stream);
        doc.addComponente(java);
        doc.addComponente(new Archivo("cv.docx"));
        doc.addComponente(new Archivo("logo.jpeg "));

        boolean encontrado = doc.buscar("patron-composite.docx");
        System.out.println("Encontrado \"patron--composite.docx\": " + encontrado);
        System.out.println(doc.mostrar(0));


        encontrado = doc.buscar("Api Stream");
        System.out.println("Encontrado Api Stream: " + encontrado);

    }
}

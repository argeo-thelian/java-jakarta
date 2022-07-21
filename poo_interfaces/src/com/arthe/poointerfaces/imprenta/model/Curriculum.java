package com.arthe.poointerfaces.imprenta.model;

import java.util.ArrayList;
import java.util.List;

public class Curriculum extends Hoja implements Imprimible{

    private Persona persona;
    private String carrera;
    private List<String> experiencias;


    public Curriculum(Persona persona, String carrera, String contenido) {
        super(contenido);
        this.persona = persona;
        this.carrera = carrera;
        this.experiencias = new ArrayList<>();
    }

    public Curriculum addExperiencias(String experiencia){
        experiencias.add(experiencia);
        return this;
    }
    @Override
    public String imprimir() {
        StringBuilder sb = new StringBuilder("Nombre: ");
        sb.append(persona.toString()).
                append("\nResumen: ").append(this.contenido).
                append("\nProfesión:").append(this.carrera).
                append("\nExperiencias: \n");
        for(String exp: this.experiencias){
           sb.append("- ").append(exp).append("\n");
        }
        return sb.toString();
    }
}

package com.arthe.pooherencia;

public class Profesor extends Persona {

    private String asignatura;

    public Profesor(){
            System.out.println("Profesor: inicializando constructo....");
    }

    public Profesor(String nombre, String apellido, String asignatura){
        super(nombre, apellido);
        this.asignatura = asignatura;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    @Override
    public String saludar() {
        return "Buenos días soy el profesor " + getNombre() + " de " + getAsignatura() ;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nasignatura='" + asignatura + '\'';
    }
}

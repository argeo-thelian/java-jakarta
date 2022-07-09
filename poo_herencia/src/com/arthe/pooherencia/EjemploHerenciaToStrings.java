package com.arthe.pooherencia;

public class EjemploHerenciaToStrings {
    public static void main(String[] args) {
        System.out.println(" ==== Creando la instancia de la clase Alumno ==== ");
        Alumno alumno = new Alumno("Argeo", "Thelian", 25, "Intituto Nacional");
        alumno.setNotaMatematicas(5.5);
        alumno.setNotaHistoria(3.4);
        alumno.setNotaCastellano(5.6);
        alumno.setEmail("argeo@correo.com");
        imprimir(alumno);
        System.out.println(" ==== Creando la instancia de la clase AlumnoInternacional ==== ");
        AlumnoInternacional alumnoInt = new AlumnoInternacional("Jose", "Grosling", "Australia");
        alumnoInt.setEdad(14);
        alumnoInt.setInstitucion("Instituto Nacional");
        alumnoInt.setNotaIdiomas(6.5);
        alumnoInt.setNotaMatematicas(3.4);
        alumnoInt.setNotaCastellano(2.2);
        alumnoInt.setNotaHistoria(5.3);
        alumnoInt.setEmail("jose@correo.com");
        imprimir(alumnoInt);
        System.out.println(" ==== Creando la instancia de la clase Pofesor ==== ");
        Profesor profesor = new Profesor("Luci", "Pérez", "Matemáticas");
        profesor.setEdad(35);
        imprimir(profesor);
    }

    public static void imprimir(Persona persona){
        System.out.println(persona.toString());
    }
}

package com.arthe.pooherencia;

public class EjemploHerencia {
    public static void main(String[] args) {
        Alumno alumno = new Alumno();

        alumno.setNombre("Argeo");
        alumno.setApellido("Gutierrez");
        alumno.setInstitucion("IPN");
        alumno.setNotaMatematicas(6.4);
        alumno.setNotaCastellano(4.3);
        alumno.setNotaHistoria(2.3);

        AlumnoInternacional alumnoInt = new AlumnoInternacional();
        alumnoInt.setNombre("Jose");
        alumnoInt.setApellido("Gosling");
        alumnoInt.setInstitucion("IPN");
        alumnoInt.setPais("Noruega");
        alumnoInt.setEdad(19);

        Profesor profesor = new Profesor();
        profesor.setNombre("Luci");
        profesor.setApellido("Pérez");
        profesor.setAsignatura("Matemáticas");

        System.out.println("Alumno " + alumno.getNombre() +
                " " + alumno.getApellido() +
                " " + alumno.getInstitucion() +
                " \nMatematicas: " + alumno.getNotaMatematicas() +
                " \nHistoria: " + alumno.getNotaHistoria() +
                " \nCastellano: " + alumno.getNotaCastellano());
        System.out.println("Profesor de " + profesor.getAsignatura() +
                            ": "+ profesor.getNombre() + profesor.getApellido());
        System.out.println("Alumno " + alumnoInt.getNombre() +
                " " + alumnoInt.getApellido() +
                " " + alumnoInt.getInstitucion() +
                " \nPaís: " + alumnoInt.getPais() +
                " \nEdad: " + alumnoInt.getEdad());

        Class clase = alumnoInt.getClass();
        while (clase.getSuperclass() != null){
            String hija = clase.getName();
            String padre = clase.getSuperclass().getName();
            System.out.println(hija + " es una clase hija de la clase padre " + padre);
            clase = clase.getSuperclass();
        }
    }
}

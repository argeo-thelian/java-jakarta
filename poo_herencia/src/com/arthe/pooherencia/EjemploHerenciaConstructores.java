package com.arthe.pooherencia;

public class EjemploHerenciaConstructores {
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
        System.out.println("Imprimiendo los datos en común del tipo persona: ");
        System.out.println("Nombre: " + persona.getNombre() +
                           ", apellido: " + persona.getApellido() +
                           ", edad: " + persona.getEdad() +
                           ", email: " + persona.getEmail());
        if(persona instanceof Alumno){
            System.out.println("Imprimiendo los datos del tipo Alumno: ");
            System.out.println("Institución: " + ((Alumno)persona).getInstitucion());
            System.out.println("Nota matemáticas: " + ((Alumno)persona).getNotaMatematicas());
            System.out.println("Nota castellano: " + ((Alumno)persona).getNotaCastellano());
            System.out.println("Nota historia: " + ((Alumno)persona).getNotaHistoria());
            // Obtiene el metodo de AlumnoInternacional si este existe, auque lo tenga de alumno.
            System.out.println("Promedio: " + ((Alumno)persona).calcularPromedio());
            if(persona instanceof AlumnoInternacional){
                System.out.println("Imprimiendo los datos del tipo Alumno Internacional: ");
                System.out.println("Nota idioma: " + ((AlumnoInternacional) persona).getNotaIdiomas());
                System.out.println("País: " + ((AlumnoInternacional) persona).getPais());
            }

        }
        if (persona instanceof Profesor){
            System.out.println("Imprimiendo los datos del tipo Profesor: ");
            System.out.println("Asignatura: " + ((Profesor) persona).getAsignatura());
        }
        System.out.println(" ===== Sobre escritura saludar ===== ");
        System.out.println(persona.saludar());
        System.out.println("\n \n");
    }
}

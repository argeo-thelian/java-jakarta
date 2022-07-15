package com.arthe.pooclasesabstractas.form;

import com.arthe.pooclasesabstractas.form.elmentos.*;
import com.arthe.pooclasesabstractas.form.elmentos.select.Opcion;
import com.arthe.pooclasesabstractas.form.validador.*;

import java.util.Arrays;
import java.util.List;

public class EjemploForm {
    public static void main(String[] args) {

        InputForm username = new InputForm("username");
        username.addValidador(new RequeridoValidador());
        InputForm password = new InputForm("clave", "password");
        password.addValidador(new RequeridoValidador());
        password.addValidador(new LargoValidador(6,12));
        InputForm email = new InputForm("email", "email");
        email.addValidador(new RequeridoValidador())
                .addValidador(new EmailValidador());
        InputForm edad = new InputForm("edad", "number");
        edad.addValidador(new NumeroValidador())
                .addValidador(new NumeroValidador());
        TextareaForm experiencia = new TextareaForm("exp", 5, 9);

        SelectForm lenguaje = new SelectForm("lenguaje");
        lenguaje.addValidador(new NoNuloValidador());

        Opcion java = new Opcion("1", "Java");
        lenguaje.addOpcion(java)
                .addOpcion(new Opcion("2", "Python"))
                .addOpcion(new Opcion("3", "Golang"))
                .addOpcion(new Opcion("4", "NodeJs").setSelected())
                .addOpcion(new Opcion("5", "NestJs"));

        username.setValor("john.doe");//john.doe
        password.setValor("1a2b3c");
        email.setValor("john.doe@correo.com");
        edad.setValor("28");
        experiencia.setValor(".... más de 10 años de experiencia .....");
//        java.setSelected(true);

        List<ElementoForm> elementos = Arrays.asList(
                username,
                password,
                email,
                edad,
                experiencia,
                lenguaje);
        /*
        List<ElementoForm> elementos = new ArrayList<>();
        elementos.add(username);
        elementos.add(password);
        elementos.add(email);
        elementos.add(edad);
        elementos.add(experiencia);
        elementos.add(lenguaje);
        */

        elementos.forEach( e ->{
            System.out.println(e.dibujarHtml());
            System.out.println("<br>");
        });

        //Metodo de referencia o referenciado
        elementos.forEach(e -> {
            if(!e.esValido()){
                e.getErrores().forEach(System.out::println);//err ->System.out.println(err)
            }
        });

    }
}

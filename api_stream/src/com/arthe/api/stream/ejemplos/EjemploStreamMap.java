package com.arthe.api.stream.ejemplos;

import com.arthe.api.stream.ejemplos.models.Usuario;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamMap {
    public static void main(String[] args) {
        Stream<String> nombres = Stream
                .of("Pato", "Paco", "Pepe")
//                .peek(System.out::println)
                .map(String::toUpperCase)
//                .peek(System.out::println)
                .map(String::toLowerCase);
        List<String> lista = nombres.collect(Collectors.toList());
        lista.forEach(System.out::println);
        //nombres.forEach(System.out::println);
        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
        Stream.of("Pato", "Paco", "Pepe")
                .map(String::toUpperCase)
                .forEach(System.out::println);

        System.out.println("¡¡¡¡¡¡¡¡¡¡¡¡¡¡¡");
        Stream<Usuario> nombres1 = Stream
                .of("Pancho Guzman","Pazo Gonzalez","Paco Gutierrez")
                .map(nombre -> new Usuario(nombre.split(" ")[0], nombre.split(" ")[1]))
                .map(usuario -> {
                    String nombre = usuario.getNombre().toLowerCase();
                    usuario.setNombre(nombre);
                    return usuario;
                });
        List<Usuario> lisUser = nombres1.collect(Collectors.toList());
        lisUser.forEach(System.out::println);
    }
}

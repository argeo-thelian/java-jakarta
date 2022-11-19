package com.arthe.api.stream.ejemplos;

import com.arthe.api.stream.ejemplos.models.Usuario;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EjemploStreamFilter {
    public static void main(String[] args) {
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

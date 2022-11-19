package com.thear.java8.lambda;

import com.thear.java8.lambda.models.Usuario;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class EjemploConsumer {
    public static void main(String[] args) {
        Consumer<String> consumidor  = saludo -> System.out.println(saludo);

        Consumer<Date> fechas = fecha -> {
            SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            System.out.println(f.format(fecha));
        };

        consumidor.accept("Datos");
        fechas.accept(new Date());

        BiConsumer<String, Integer> consumidorBi  = (nombre, edad) -> System.out.println(nombre + " tiene " + edad + " años");

        consumidorBi.accept("Pepe",23);

        Consumer<String> consumir2 = System.out::println;

        consumir2.accept("Dats");

        List<String> nombre = Arrays.asList("andres", "pepe", "papi", "luz");
        nombre.forEach(consumir2);

        Supplier<Usuario> creaUsuario = Usuario::new;
        Usuario usuario = creaUsuario.get();
        BiConsumer<Usuario, String> asignarnombre = Usuario::setNombre;
            //(persona, nom) -> persona.setNombre(nom);

        asignarnombre.accept(usuario, "Andrés");
        consumir2.accept("Nombre usuario: " + usuario.getNombre());

        Supplier<String> proovedor = ()->{
            return "Hola mundo lambda supplier";
        };
        consumidor.accept(proovedor.get());
    }
}

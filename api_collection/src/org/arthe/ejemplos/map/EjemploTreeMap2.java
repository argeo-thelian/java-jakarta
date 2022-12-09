package org.arthe.ejemplos.map;

import java.util.*;

public class EjemploTreeMap2 {
    public static void main(String[] args) {
//        Map<String, Object> persona = new TreeMap<>((a,b)->b.compareTo(a));
//        Map<String, Object> persona = new TreeMap<>(Comparator.reverseOrder());
        Map<String, Object> persona = new TreeMap<>(Comparator.comparing(String::length).reversed());
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@mail.com");
        persona.put("Edad", "30");

        Map<String, String> direccion = new TreeMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");
        persona.put("direccion", direccion);
        System.out.println(String.format("%s",null).toUpperCase(Locale.ROOT));
        System.out.println("persona = " +persona );

    }
}

package org.arthe.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put(null, "12312");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@mail.com");
        persona.put("Edad", "30");

        System.out.println("persona = " +persona );

        String nombre = persona.get("nombre");
        System.out.println(nombre);

        System.out.println(persona.remove("apellido"));
//        System.out.println(persona.remove("apellido", "Doe"));
        System.out.println(persona.containsKey("nombre"));

        Collection<String> valores = persona.values();
        for (String v: valores){
            System.out.println(v);
        }

        Set<String> llaves = persona.keySet();
        for (String ll : llaves){
            System.out.println(ll);
        }

        for (Map.Entry<String, String> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }

        for(String llave: persona.keySet()){
            String valor = persona.get(llave);
            System.out.println(llave + " =X " + valor);
        }

        persona.forEach((llave, valor) -> {
            System.out.println(llave + " =w " + valor);
        });

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos : " + !persona.isEmpty());

        persona.replace("nombre", "juan");
        System.out.println("persona = "+ persona);
    }
}

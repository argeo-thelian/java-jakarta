package org.arthe.ejemplos.map;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EjemploHashMap2 {
    public static void main(String[] args) {
        Map<String, Object> persona = new HashMap<>();
        persona.put(null, "12312");
        persona.put("nombre", "Jhon");
        persona.put("apellido", "Doe");
        persona.put("email", "john.doe@mail.com");
        persona.put("Edad", "30");

        Map<String, String> direccion = new HashMap<>();
        direccion.put("pais", "USA");
        direccion.put("estado", "California");
        direccion.put("ciudad", "Santa Barbara");
        direccion.put("calle", "One Street");
        direccion.put("numero", "120");
        persona.put("direccion", direccion);


        System.out.println("persona = " +persona );

        String nombre = (String) persona.get("nombre");
        System.out.println(nombre);

        System.out.println(persona.remove("apellido"));
//        System.out.println(persona.remove("apellido", "Doe"));
        System.out.println(persona.containsKey("nombre"));

        Collection<Object> valores =  persona.values();
        for (Object v: valores){
            System.out.println(v);
        }

        Set<String> llaves = persona.keySet();
        for (String ll : llaves){
            System.out.println(ll);
        }

        for (Map.Entry<String, Object> par : persona.entrySet()){
            System.out.println(par.getKey() + " => " + par.getValue());
        }
        System.out.println("#########################");
        for(String llave: persona.keySet()){
            Object valor = persona.get(llave);
            if (valor instanceof Map){
                ((Map<?, ?>) valor).forEach((keyDirec, valorDirec)->{
                    System.out.println(keyDirec + " de " + persona.get("nombre") + " es " + valorDirec);
                });
                System.out.println();
            }else {
                System.out.println(llave + " =X " + valor);

            }
        }

        persona.forEach((llave, valor) -> {
            System.out.println(llave + " =w " + valor);
        });

        System.out.println("total: " + persona.size());
        System.out.println("contiene elementos : " + !persona.isEmpty());

        persona.replace("nombre", "juan");
        System.out.println("persona = "+ persona);

        Map<String, String> direccionPersona =  (Map<String,String>) persona.get("direccion");
        String pais = direccionPersona.get("pais");
        String ciudad = direccionPersona.get("ciudad");
        String barrio = direccionPersona.getOrDefault("barrio", "La playa");
        System.out.println("_________________");

        System.out.println("direccion : "+ direccionPersona);
        System.out.println("pais : "+ pais);
        System.out.println("ciudad : "+ ciudad);
        System.out.println("barrio : "+ barrio);


    }
}

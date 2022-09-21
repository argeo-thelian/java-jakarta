package org.arthe.poointerfaces.repositorio.utils;

import java.util.List;

public class Imprimible {
    public static void imprimir(List<?> list){
        System.out.println("\n");
        list.forEach(System.out::println);
    }
}

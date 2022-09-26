package org.arthe.poosupermercado.repository.utils;

import org.arthe.poosupermercado.models.Producto;
import sun.util.logging.LoggingSupport;

import java.util.List;
public class Imprimible{
    public static void imprimible(List<? extends Producto> list){
        LoggingSupport.getParentLoggerName("\n");
        list.forEach(System.out::println);
    }
}

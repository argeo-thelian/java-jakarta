package com.arthe.patrones.composite.archivos;

public class Utils {

    public static String repeat(String patron,int nivel){
        String tab = "";
        for (int i = 0; i< nivel; i++){
            tab = tab + patron;
        }
        return tab;
    }

}

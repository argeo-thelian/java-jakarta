public class StringsMethods{
    public static void main(String[] args) {
        String nombre = "Andres";
        System.out.println("nombre.length() = " + nombre.length());
        System.out.println("nombre.toUpperCase() = " + nombre.toUpperCase());
        System.out.println("nombre.toLowerCase() = " + nombre.toLowerCase());
        System.out.println("nombre.equals(\"Andres\") = " + nombre.equals("Andres"));
        System.out.println("nombre.equals(\"andres\") = " + nombre.equals("andres"));
        System.out.println("nombre.compareTo(\"Andres\") = " + nombre.compareTo("Andres"));
        System.out.println("nombre.compareTo(\"andres\") = " + nombre.compareTo("andres"));
        System.out.println("nombre.charAt(0) = " + nombre.charAt(0));
        System.out.println("nombre.charAt(1) = " + nombre.charAt(1));
        System.out.println("nombre.charAt(nombre.length()-1) = " + nombre.charAt(nombre.length()-1));

        System.out.println("nombre.substring(1) = " + nombre.substring(1));
        System.out.println("nombre.substring(1, 4) = " + nombre.substring(1));
        System.out.println("nombre.substring(nombre.lenght() -1) = " + nombre.substring(nombre.length() -1));
    
        String trabalenguas = "trabalenguas";

        System.out.println("trabalenguas.replace( \"a\" , \".\" ) = " + trabalenguas.replace( "a" , "." ));
        System.out.println("trabalenguas.= " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas.lastIndexOf( \"a\") = " + trabalenguas.lastIndexOf( "a"));
        System.out.println("trabalenguas.indexOf('t') = " + trabalenguas.indexOf('t'));
        System.out.println("trabalenguas.contains('t') = " + trabalenguas.contains("t"));
        System.out.println("trabalenguas.startWith('traba') = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith('lenguas') = " + trabalenguas.indexOf("lenguas"));
        System.out.println("    trabalenguas    ");
        System.out.println("    trabalenguas    ".trim());


        // Extension archivo

        String archivo = "alguna_imagen.js";
        int j = archivo.lastIndexOf(".");
        System.out.println("archivo.length() = " + archivo.length());
        System.out.println("archivo.substring( archivo.length() - 4 ) = " + archivo.substring( archivo.length() - 4 ));
        System.out.println("archivo.substring( i + 1 ) = " + archivo.substring( j + 1 ));


        // String convertir a Arreglo

        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] arreglo = trabalenguas.toCharArray();
        int largo = arreglo.length;
        System.out.println(" largo = " + largo);
        for (int i = 0; i < largo; i++){
            System.out.println(" arreglo = " + arreglo[i]);
        }
        
        System.out.println("trabalenguas = " + trabalenguas.split("a"));
        String[] arreglo2 = trabalenguas.split("a");
        for(int k = 0; k < arreglo2.length; k++){
            System.out.println(arreglo2[k]);
        }

        String[] extension = archivo.split("\\."); // "[.]"
        int l = extension.length;
        for (int i = 0; i < extension.length; i++){
            System.out.println(extension[i]);
        }

        System.out.println("extension = " + extension[l-1]);
    }
}
public class SentenciasBucleEtiquetasBuscar {
    public static void main(String[] args) {
        String frase = "tres tistes tigres tragaban trigo en un trigal trigo";
        int max = frase.length();
        int cantidad = 0;
        char letra = 'g';
        for (int i = 0 ; i < max; i ++){
            if( frase.charAt(i) != letra){
                continue;
            }
            cantidad ++;
        }
        System.out.println("Encontrato = " + cantidad + " veces el caracter "+ letra + " en la frase");


        int cantidad2 = 0;
        String palabra = "trigo";
        int maxPalabra = palabra.length();
        int maxFrase = frase.length() - maxPalabra;

        buscar:
        for (int i = 0; i <= maxFrase;){
            int k = i ;
            for (int j = 0; j < maxPalabra; j++){
                if(frase.charAt(k++) != palabra.charAt(j)){
                    i++;// cada vez que no encuentre la parabra aumenta
                    continue buscar;
                }
            }
            cantidad2++;
            i += maxPalabra;
        }
        System.out.println("Encontrato = " + cantidad2 + " veces la palabra "+ palabra + " en la frase");

    }
}

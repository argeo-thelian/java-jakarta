public class ArgumentosLineaComando {
    public static void main(String[] args) {
        
        for(int i = 0; i < args.length; i++){
            System.out.println("Argumentos n° " + i + ": " + args[i]);
        }

        //javac ArgumentosLineaComando.java 
        //javac ArgumentosLineaComando.java -encoding utf8  -- Compilar
        //java ArgumentosLineaComando                       -- Ejecutar 

    }
}

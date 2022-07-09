public class PasarPorValor {
    public static void main(String[] args) {
        Integer i = 10;
        System.out.println("Iniciar el método main con i = " + i);
        test(i);
        System.out.println("Finaliza el método main con i = " + i);
    }

    public static void test(Integer i){
        System.out.println("Iniciamos el método Test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método Test con i = " + i);
    }
}

public class PasarPorReferencia {
    public static void main(String[] args) {
        int[] edad = {10, 11, 12};

        System.out.println("Iniciamos el método main con i = " + edad);
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Edad[i] = " + edad[i]) ;
        }
        System.out.println("Antes de llamar el método test");
        test(edad);
        System.out.println("Después de llamar el método test");
        
        for (int i = 0; i < edad.length; i++) {
            System.out.println("Edad[i] = " + edad[i]);
        }

        System.out.println("Finalizamos el método main con los datos del arreglo modificados!");
    }

    public static void test(int[] edadArr) {
        System.out.println("Iniciamos el método test");
        for (int i = 0; i < edadArr.length; i++) {
            edadArr[i] += 20;
            System.out.println("Edad[i] = " + edadArr[i]) ;
        }
        System.out.println("Finalizamos el método test"); 
    }
}

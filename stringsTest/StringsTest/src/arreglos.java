public class arreglos {
    public static void main(String[] args) {
        int[] numero = new int[10];
        
        for(int i = 0; i < numero.length; i++){
            numero[i] = i + 1;
        }

        for(int i = 0; i < numero.length/2; i++){
            System.out.print(numero[i] + " ");
            System.out.println(numero[numero.length - 1 - i]);
        }

        int[][] matriz = new int[3][];

        matriz[0] = new int[2];
        matriz[1] = new int[3];
        matriz[2] = new int[4];
        
        System.out.println("matriz length: " + matriz.length);
        System.out.println("fila 0 length: " + matriz[0].length);
        System.out.println("fila 1 length: " + matriz[1].length);
        System.out.println("fila 2 length: " + matriz[2].length);


        for(int i = 0; i < matriz.length; i ++){
            for(int j = 0; j < matriz[i].length; j++){
                System.out.print(matriz[i][j] + "\t");
            }
            System.out.println();
        }
    }

}

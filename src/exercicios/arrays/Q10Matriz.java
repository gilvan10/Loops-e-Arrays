package exercicios.arrays;
import java.util.Random;

public class Q10Matriz {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[4][4];
        for(int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = random.nextInt(100);
            }
        }
        //imprimindo com foreach
        for(int[] linha: matriz) {
            System.out.print("\n");
            for (int elementoColuna : linha) {
                System.out.print(elementoColuna + " ");
            }
        }
    }
}

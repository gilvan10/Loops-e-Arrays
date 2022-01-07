package exercicios.arrays;
import java.util.Scanner;

public class Q7ArrayInteiros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[6];
        //Vai receber 5 números
        for(int i = 0; i < 5; i++) {
            System.out.println("Digite um numero para adicionar no vetor");
            vetor[i] = sc.nextInt();
        }
        System.out.println("Imprimindo o vetor inversamente");
        for(int i = 4; i >= 0; i--) {
            System.out.print(vetor[i] + " ");
        }

    }

}

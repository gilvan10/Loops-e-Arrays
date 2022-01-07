package exercicios.arrays;
import java.util.Random;

public class Q9NumerosSucessores {
    public static void main(String[] args){
        Random random = new Random();
        int[] numerosAleatorios = new int[20];
        for(int i = 0; i < 20; i++) {
            numerosAleatorios[i] = random.nextInt(100);
        }
        for(int numero : numerosAleatorios)
            System.out.print(numero + " ");
        System.out.print("\n");
        System.out.println("Impimindo os sucessores");
        for(int numero : numerosAleatorios)
            System.out.print(numero+1 +" ");
    }
}

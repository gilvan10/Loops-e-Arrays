package exercicios.loops;
import java.util.Scanner;

public class Q2Nota {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número entre 0 e 10");
        numero = sc.nextInt();
        while(numero < 0 || numero > 10) {
            System.out.println("Numero invalido, digite um número válido");
            numero = sc.nextInt();
        }

    }
}

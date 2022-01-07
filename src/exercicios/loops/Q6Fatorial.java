package exercicios.loops;
import java.util.Scanner;

public class Q6Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int fatorial;
        System.out.println("Digite um número para gerar seu fatorial");
        numero = sc.nextInt();
        fatorial = numero;
        for(int i = numero; i > 1; i--) {
            fatorial *= i-1;
        }
        System.out.println("O fatorial de " +numero+ " é " +fatorial);
    }
}

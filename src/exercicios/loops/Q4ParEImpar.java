package exercicios.loops;
import java.util.Scanner;

public class Q4ParEImpar {
    public static void main(String[] args) {
        int qtdPares = 0;
        int qtdImpares = 0;
        int count = 0;
        int qtdLimite;
        int numero;
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos números desaja inserir?");
        qtdLimite = sc.nextInt();
        do{
           System.out.println("Digite um numero para saber se é par ou impar");
           numero = sc.nextInt();
           if(numero % 2 == 0) {
               System.out.println("O número " + numero + " é par");
               qtdPares++;
           }
           else {
               System.out.println("O número " + numero + " é impar");
               qtdImpares++;
           }
           count++;
        }while(count < qtdLimite);

        System.out.println(qtdPares + " números pares");
        System.out.println(qtdImpares + " números impares");
    }
}

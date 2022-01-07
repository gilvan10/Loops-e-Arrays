package exercicios.loops;
import java.util.Scanner;

public class Q1NomeIdade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        int idade;
        while(true) {
            //Para sair digite 0 em nome
            System.out.println("Digite seu nome");
            nome = sc.next();
            System.out.println("Digite sua idade");
            idade = sc.nextInt();
            System.out.println("O nome é " +nome+ " , e a idade " +idade);

            if(nome.equals("0"))
                break;
        }
    }
}

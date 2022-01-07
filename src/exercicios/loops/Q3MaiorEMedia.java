package exercicios.loops;
import java.util.Scanner;

public class Q3MaiorEMedia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double nota;
        double somatorio = 0.0;
        double media;
        double notaMaior = 0.0;

        for(int i = 1; i < 6; i++){
            System.out.println("Digite a nota " +i);
            nota = sc.nextDouble();
            if(notaMaior < nota)
                notaMaior = nota;
            somatorio += nota;

        }
        media = somatorio/5;
        System.out.println("A nota maior é " +notaMaior);
        System.out.println("A media é " +media);
    }
}

package exercicios.loops;
import java.util.Scanner;

public class Q5Tabuada {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int numero;
        int resultado;
        System.out.println("Escolha um numero para gerar a tabuada");
        numero = sc.nextInt();
        for(int i = 1; i <= 10; i++) {
            resultado = numero * i;
            System.out.println(numero +" * "+ i + " = " +resultado);
        }


        System.out.println("");
    }
}

package exercicios.arrays;
import java.util.Scanner;

public class Q8ArrayConsoantes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Vai receber 5 consoantes
        String[] consoantes = new String[5];
        String consoante;
        int quantidadeConsoantes = 0;
        int count = 0;
        System.out.println("Insira uma consoante de cada vez");
        while(count < 5) {
            System.out.println("Digite uma consoante");
            consoante = sc.next();
            //Vai entrar nesse if se não for vogak
            if(consoante.equalsIgnoreCase("a")||
                    consoante.equalsIgnoreCase("e")|
                            consoante.equalsIgnoreCase("i")|
                                    consoante.equalsIgnoreCase("o")|
                                           consoante.equalsIgnoreCase("u")
            ){
                System.out.println("informação invalida");
            }
            else {
                consoantes[count] = consoante;
                quantidadeConsoantes++;
                count++;
            }

            /*if ( !(consoante.equalsIgnoreCase("a") |
                    consoante.equalsIgnoreCase("e") |
                    consoante.equalsIgnoreCase("i") |
                    consoante.equalsIgnoreCase("o") |
                    consoante.equalsIgnoreCase("u")) )  {
                consoantes[count] = consoante;
                quantidadeConsoantes++;
            }
            count++;*/

        }
        System.out.println("Numero de consoantes " +quantidadeConsoantes);
        for(String consoanteAux: consoantes)
            System.out.print(consoanteAux + " ");
    }
}

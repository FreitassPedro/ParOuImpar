import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random gerador = new Random();
        Scanner sc = new Scanner(System.in);


        System.out.println("Quantas rodadas deseja jogar?");
        int rodada = sc.nextInt();

        for (int i = 0; i < rodada; i++) {
            System.out.println("Par ou impar?");
            char parOuImpar = sc.next().charAt(0);

            System.out.println();
            System.out.print("Jogue um número qualquer! ");
            int voce = sc.nextInt();
            int adversario = gerador.nextInt(10);
            System.out.println("Adversário: " + adversario);
            System.out.println("Você: " + voce);
            int soma = adversario + voce;
            System.out.println("Resultado da Soma: " + soma);
            /////PAR
            if (parOuImpar == 'p' || parOuImpar == 'P') {
                if (soma % 2 == 0) {
                    System.out.println();
                    System.out.println("Você ganhou!");
                } else {
                    System.out.println();
                    System.out.println("Você perdeu!");
                }
            }
            ///IMPAR!
            if (parOuImpar == 'i' || parOuImpar == 'I') {
                if (soma % 2 == 1) {
                    System.out.println();
                    System.out.println("Você ganhou!");
                }
                else {
                    System.out.println();
                    System.out.println("Você perdeu!");
                }
            }
        }
    }
}

package LoopAndConditional.Desafio;

import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numeroGerado = new Random().nextInt(101);
        int tentativas = 0;
        int numeroDigitado = 0;

        System.out.println("Seja bem vindo ao jogo de adivinhação");
        System.out.println("--------------------------------------");

        while (tentativas < 5) {
            System.out.println("Digite um número entre 0 e 100: ");
            numeroDigitado = leitor.nextInt();
            tentativas++;

            if(numeroDigitado == numeroGerado){
                System.out.println("Parabéns você acertou");
                break;
            } else if (numeroDigitado < numeroGerado){
                System.out.println("Tente novamente, seu número é menor que o sorteado");
            } else {
                System.out.println("Tente novamente, seu número é maior que o sorteado");
            }
        }

        if (tentativas == 5 && numeroDigitado != numeroGerado) {
            System.out.println("Você não conseguiu acertar o número em 5 tentativas. O número era: " + numeroGerado);
        }
    }
}



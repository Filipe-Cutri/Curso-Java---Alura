package LoopAndConditional.TeoriaExercise;

import java.util.Scanner;

public class Leitura {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite seu filme favorito: ");
        String filme = leitura.nextLine();

        System.out.println("Qual o ano de lançamento ?");
        int anoLancamento = leitura.nextInt();

        System.out.println("Qual a sua avaliação para esse filme ?");
        double avaliacao = leitura.nextDouble();

        System.out.println(filme);
        System.out.println(anoLancamento);
        System.out.println(avaliacao);
    }
}
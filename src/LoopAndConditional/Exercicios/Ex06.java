package LoopAndConditional.Exercicios;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double count;
        double fatorial = 1;

        System.out.println("Digite um número: ");
        double n1 = scanner.nextDouble();

        for (count = 1; count <= n1; count++) {
            fatorial *= count;
            System.out.println(fatorial);
        }
        System.out.println("O fatorial de " + n1 + " é " + fatorial);
    }
}

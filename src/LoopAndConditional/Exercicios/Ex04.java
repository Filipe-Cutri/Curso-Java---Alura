package LoopAndConditional.Exercicios;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int multiplicador;
        int count;

        System.out.println("Seja bem vindo");
        System.out.println("Digite um número, para obter a tabuada dele:");
        int n1 = scanner.nextInt();

        for (count = 0; count <= 10; count++) {
            multiplicador = count * n1;
            System.out.println(count + " X " + n1 + " = " + multiplicador);
        }
    }
}

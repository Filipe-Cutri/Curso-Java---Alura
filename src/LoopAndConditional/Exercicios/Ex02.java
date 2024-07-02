package LoopAndConditional.Exercicios;

import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número inteiro: ");
        int n1 = scanner.nextInt();

        System.out.println("Digite o segundo número inteiro: ");
        int n2 = scanner.nextInt();

        if (n1 == n2){
            System.out.println("Os dois números são iguais");
        } else if (n1 > n2) {
            System.out.println("O primeiro número é maior que o segundo");
        } else {
            System.out.println("O segundo número é maior que o primeiro");
        }
    }
}

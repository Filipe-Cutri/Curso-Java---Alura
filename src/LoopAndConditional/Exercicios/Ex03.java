package LoopAndConditional.Exercicios;

import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;

        while (escolha != 3) {
            System.out.println("-----------------Menu-----------------");
            System.out.println("Digite 1: Cálculo da área do quadrado");
            System.out.println("Digite 2: Cálculo da área do retângulo");
            System.out.println("Digite 3 para sair");
            System.out.println("Escolha uma opção: ");
            escolha = scanner.nextInt();
            System.out.println("--------------------------------------");

            if (escolha == 1) {
                System.out.println("Digite o valor do lado do quadrado: ");
                double lado = scanner.nextDouble();
                double areaQuadrado = lado*lado;

                System.out.println("A área do quadrado é: " + areaQuadrado);
            } else if (escolha == 2) {
                System.out.println("Digite o valor da base do retângulo: ");
                double base = scanner.nextDouble();
                System.out.println("Digite o valor da altura do retângulo: ");
                double altura = scanner.nextDouble();
                double areaRetangulo = base * altura;

                System.out.println("A área do retângulo é: " + areaRetangulo);
            } else if (escolha == 3){
                System.out.println("Muito obrigado, por usar nosso sistema");
            } else {
                System.out.println("Opção inválida");
            }
        }
    }
}

package LoopAndConditional.Exercicios;

import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        if (numero > 0) {
            System.out.println("Esse número é positivo");
        } else {
            System.out.println("Esse número é negativo");
        }
    }
}

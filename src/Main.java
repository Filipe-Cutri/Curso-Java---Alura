import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nomeCliente = "Filipe Alberto Cutri";
        String tipoConta = "Conta corrente";
        double saldoInicial = 2500;
        double valorRecebido;
        double valorTransferido;
        int operacaoes = 0;

        System.out.println("-----------------------------------");
        System.out.println("Seja bem vindo ao banco FACBank");
        System.out.println("-----------------------------------");

        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome: " + nomeCliente);
        System.out.println("Tipo conta: " + tipoConta);
        System.out.printf("Saldo incial: R$ %.2f%n", saldoInicial);
        System.out.println("\n-----------------------------------");

        while (operacaoes != 4) {
            System.out.println("Operações:");
            System.out.println("1 - Consultar saldo");
            System.out.println("2 - Receber valor");
            System.out.println("3 - Transferir valor");
            System.out.println("4 - Sair");
            System.out.println("Digite a opção desejada: ");
            operacaoes = scanner.nextInt();

            switch (operacaoes) {
                case 1:
                    System.out.printf("Você possui um saldo de R$ %.2f%n", saldoInicial);
                    break;
                case 2:
                    System.out.println("Digite o valor recebido: ");
                    valorRecebido = scanner.nextDouble();

                    saldoInicial += valorRecebido;
                    System.out.printf("O seu saldo atualizado é de R$ %.2f%n", saldoInicial);
                    break;
                case 3:
                    System.out.println("Digite o valor que deseja transferir: ");
                    valorTransferido = scanner.nextDouble();

                    if (valorTransferido > saldoInicial) {
                            System.out.println("Operação inválida, saldo insuficiente");
                    } else {
                        saldoInicial -= valorTransferido;
                        System.out.printf("O seu saldo atualizado é de R$ %.2f%n", saldoInicial);
                    }
                    break;
                case 4:
                    System.out.println("Obrigado por usar nosso banco");
                    break;
                default:
                    System.out.println("Operação inválida.");
                    break;
            }
        }
    }
}
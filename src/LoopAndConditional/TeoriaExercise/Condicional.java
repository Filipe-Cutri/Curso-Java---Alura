package LoopAndConditional.TeoriaExercise;

public class Condicional {
    public static void main(String[] args) {
        int anoLancamento = 1990;
        boolean incluidoNoPlano = false;
        double notaDoFilme = 9.5;
        String tipoPlano = "Normal";

        if (anoLancamento >= 2022) {
            System.out.println("Lançamento que os clientes estão gostando!");
        } else  {
            System.out.println("Filme mais antigo, mas que vale a pena assitir");
        }

        if (incluidoNoPlano == true || tipoPlano.equals("Plus")) {
            System.out.println("Filme liberado");
        } else {
            System.out.println("Você terá que pagar o filme");
        }
    }
}

package StringExercise.Exercicios;

public class Ex06 {
    public static void main(String[] args){
        double precoOriginal = 150.80;
        double percentualDesconto = 15;
        double calculoDesconto = (precoOriginal * percentualDesconto) / 100;
        double precoComDesconto = precoOriginal - calculoDesconto;

        String mensagem = String.format("O preço original é: %.2f, o desconto foi de %.0f porcento e novo preço é: %.2f", precoOriginal, percentualDesconto, precoComDesconto);
        System.out.println(mensagem);
    }
}

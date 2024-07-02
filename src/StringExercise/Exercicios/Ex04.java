package StringExercise.Exercicios;

public class Ex04 {
    public static void main(String[] args){
        double precoProduto = 10.25;
        int quantidade = 25;
        double total = precoProduto * quantidade;
        String mensagem = String.format("O preço do produto é %.2f e a quantidade é %d, com um total = %.2f", precoProduto, quantidade, total);

        System.out.println(mensagem);
    }
}

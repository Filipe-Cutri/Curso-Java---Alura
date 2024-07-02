package StringExercise.Exercicios;

public class Ex05 {
    public static void main(String[] args){
        double valorEmDolares = 250.50;
        double valorConvertido = valorEmDolares * 4.94;

        String mensagem = String.format("O valor convertido de dólares para reais é igual a %.2f", valorConvertido);
        System.out.println(mensagem);
    }
}

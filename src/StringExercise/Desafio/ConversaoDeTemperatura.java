package StringExercise.Desafio;

public class ConversaoDeTemperatura {

    public static void main(String[] args){
        double celsius = 30.5;
        double fahrenheit = (celsius * 1.8) + 32;

        String mensagem = String.format("Temperatura convertida de %f Celsius para %f Fahrenheit = ", celsius, fahrenheit);
        System.out.println(mensagem);

        int resultadoFormatado = (int) fahrenheit;
        System.out.println("Resultado formatado = " + resultadoFormatado);

    }
}

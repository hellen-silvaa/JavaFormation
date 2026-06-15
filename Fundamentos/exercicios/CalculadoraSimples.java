package Fundamentos.exercicios;

public class CalculadoraSimples {
    public static void main() {
        Integer a = 10;
        Integer b = 2;

        Integer soma = a + b;
        Integer subtracao = a - b;
        Integer multiplicacao = a * b;
        Integer divisao = a / b;
        Integer resto = a % b;

        System.out.println("Soma: " + soma);
        System.out.println("Subtracao: " + subtracao);
        System.out.println("Multiplicacao: " + multiplicacao);
        System.out.println("Divisao: " + divisao);
        System.out.println("Resto: " + resto);

    }
}

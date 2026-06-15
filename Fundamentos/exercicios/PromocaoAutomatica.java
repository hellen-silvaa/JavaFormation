package Fundamentos.exercicios;

public class PromocaoAutomatica {
    public static void main(String[] args) {
        byte a = 10;
        short b = 20;
        char c = 'A'; // Valor numérico (ASCII) é 65
        int d = 30;
        long e = 40L;
        float f = 1.5f;
        double g = 2.5;

        System.out.println("--- Demonstração de Promoção de Tipos ---");

        // 1. byte, short e char são promovidos para int na expressão.
        int resultadoInt = a + b + c; // 10 + 20 + 65
        System.out.println("Soma (byte + short + char) -> int: " + resultadoInt);

        // 2. Ao envolver um long, todos são promovidos para long.
        long resultadoLong = resultadoInt + e;
        System.out.println("Soma (int + long) -> long: " + resultadoLong);

        // 3. Ao envolver um float, todos são promovidos para float.
        float resultadoFloat = resultadoLong + f;
        System.out.println("Soma (long + float) -> float: " + resultadoFloat);

        // 4. Ao envolver um double, todos são promovidos para double.
        double resultadoDouble = resultadoFloat + g;
        System.out.println("Soma (float + double) -> double: " + resultadoDouble);

        // 5. Exibindo o valor do char original
        System.out.println("\nValor original do char 'c': " + c);
    }
}

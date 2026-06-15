package Fundamentos.exercicios;

import java.util.Scanner;

public class NivelDeSatisfacao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o nível de satisfação (1 a 5): ");
        int nivel =  scanner.nextInt();
        String feedback = switch (nivel) {
            case 1 -> "Muito insatisfeito";
            case 2 -> "Insatisfeito";
            case 3 -> "Neutro";
            case 4 -> "Satisfeito";
            case 5 -> "Muito satisfeito";
            default -> "Opção inválida (deve estar entre 1 e 5)";
        };

        System.out.println(feedback);
        scanner.close();
    }
}

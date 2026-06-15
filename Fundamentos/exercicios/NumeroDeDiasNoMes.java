package Fundamentos.exercicios;

public class NumeroDeDiasNoMes {
    public static void main(String[] args) {
        String mes = "Janeiro";
        int numeroDeDias = switch (mes) {
            case "Janeiro", "Março", "Maio", "Julho", "Agosto", "Outubro", "Dezembro" -> 31;
            case "Fevereiro" -> 28;
            case "Abril", "Junho", "Setembro", "Novembro" -> 30;
            default -> -1;
        };
        if (numeroDeDias != -1) {
            System.out.println("O mês de " + mes + " tem " + numeroDeDias + " dias.");
        } else {
            System.out.println("Valor inválido para mês.");

        }
    }
}

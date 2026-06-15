package Fundamentos.exercicios;

public class VerificaAprovacaoNotaMaisPresenca {
    public static void main(String[] args) {
        int nota1 = 10;
        int nota2 = 7;
        int nota3 = 5;
        int frequenciaEmPorcentagem = 80;

        double MediaNotas = (nota1 + nota2) / 2;
        boolean aprovado = MediaNotas>=7 && frequenciaEmPorcentagem>=75;
        if (aprovado) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
    }
}
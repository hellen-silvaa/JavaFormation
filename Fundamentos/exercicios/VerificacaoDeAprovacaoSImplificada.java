package Fundamentos.exercicios;

public class VerificacaoDeAprovacaoSImplificada {
    public static void main(String[] args) {
        int nota1  = 8;
        int nota2 = 10;

        double notaMedia = (nota1+nota2)/2;
        if(notaMedia>=6){
            System.out.println("Aprovado");
        }else {
            System.out.println("Reprovado");
        }
    }
}

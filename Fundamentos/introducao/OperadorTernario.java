package Fundamentos.introducao;

public class OperadorTernario {
    //Usando if-else
    public static void main(String[] args) {
        int numero = 10;
        String resultado;

        if (numero % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println("O número é: " + resultado);

        //Usando operador ternário
        int numero1 = 10;
        String resultado1 = (numero1 % 2 == 0) ? "Par" : "Ímpar";

        System.out.println("O número é: " + resultado1);
        }
    }


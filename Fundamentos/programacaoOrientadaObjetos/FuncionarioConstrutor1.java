package Fundamentos.programacaoOrientadaObjetos;

public class FuncionarioConstrutor1 {
    static void main() {
            nome = nomeInit;
            salario = salarioInit;
        }
        public String obterInfo() {
            return "Nome: " + nome + ", Salario: " + salario;
        }

        public void aumentarSalario(double aumento) {
            salario += aumento;
        }
        public void aumentarSalario(int porcentagem) {
            salario += salario * porcentagem / 100.0;
        }
    }


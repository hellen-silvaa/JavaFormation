package Fundamentos.programacaoOrientadaObjetos;

public class FuncionarioConstrutor {
    String nome;
    String cargo;
    String idade;

    FuncionarioConstrutor(String nome, String cargo, String idade) {
        this.nome = nome;
        this.cargo = cargo;
        this.idade = idade;
    }

    static void main() {
        FuncionarioConstrutor funcionario1 = new FuncionarioConstrutor("João", "Desenvolvedor", "30");
        FuncionarioConstrutor funcionario2 = new FuncionarioConstrutor("Maria", "Desenvolvedor", "20");

        System.out.println("Nome do funcionario: " + funcionario1.nome);
        System.out.println("Cargo do funcionario: " + funcionario1.cargo);
        System.out.println("Idade do funcionario: " + funcionario1.idade);
        System.out.println("Nome do funcionario: " + funcionario2.nome);
        System.out.println("Idade do funcionario: " + funcionario2.cargo);
        System.out.println("Nome do funcionario: " + funcionario2.idade);

    }
}

package Fundamentos.programacaoOrientadaObjetos;

public class Bolo {
    int quantidadeAcucar = 50;
    static void main() {
        Bolo boloDeChocolate = new Bolo();
        boloDeChocolate.quantidadeAcucar = 100;

        Bolo boloDeBaunilha = new Bolo();
        boloDeBaunilha.quantidadeAcucar = 200;

        Bolo boloDeMaracuja = new Bolo();

        System.out.println("Quantidade de açucar no bolo de chocolate: " + boloDeChocolate.quantidadeAcucar);
        System.out.println("Quantidade de açucar no bolo de baunilha: " + boloDeBaunilha.quantidadeAcucar);
        System.out.println("Quantidade de açucar no bolo de maracujá: " + boloDeMaracuja.quantidadeAcucar);
    }
}

package Fundamentos.introducao;

public class SwitchCaseLegacy {
    public static void main(String[] args) {
        //Só inteiros ou caracteres
        //Strings a partir do Java 7
        int diaDaSemana = 3; // 1 representa segunda, 2 terça, etc.
        switch (diaDaSemana) {
            case 1:
                System.out.println("Seg.");
                break;
            case 2:
                System.out.println("Ter.");
                break;
            case 3:
                System.out.println("Qua.");
                break;
            case 4:
                System.out.println("Qui.");
                break;
            case 5:
                System.out.println("Sex.");
                break;
            default:
                System.out.println("Dia desconhecido");
                break;
        }
    }
}

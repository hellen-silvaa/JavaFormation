package Fundamentos.introducao;

public class SwitchCase {
    public static void main(String[] args) {
        int day = 3;
        switch (day) { //entre () o que queremos testar
            case 1 -> System.out.println("Segunda");
            case 2 -> System.out.println("Terca");
            case 3 -> System.out.println("Quarta");
            case 4 -> System.out.println("Quinta");
            case 5 -> System.out.println("Sexta");
            case 6 -> System.out.println("Sabado");
            case 7 -> System.out.println("Domingo");
            default -> System.out.println("Desconhecido");
        }

        String dia = "Domingo";
        String tipoDeDia = switch (dia) {
            case "Seg.", "Ter.", "Qua.", "Qui.", "Sex." -> "Dia util";
            case "Sabado", "Domingo" -> "Fim de semana";
            default -> "Desconhecido";
        };
        System.out.println(tipoDeDia); // Dia util
    }
}

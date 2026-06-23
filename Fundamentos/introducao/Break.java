package Fundamentos.introducao;

public class Break {
    static void main() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break; // Sai do loop quando i é igual a 5
            }
            System.out.println(i);
        }
    }
}

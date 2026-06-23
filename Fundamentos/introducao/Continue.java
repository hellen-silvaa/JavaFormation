package Fundamentos.introducao;

public class Continue {
    static void main() {
        for (int j = 0; j < 10; j++) {
            if (j == 5) {
                continue; // Pula a iteração quando j é igual a 5
            }
            System.out.println(j);
        }
    }
}

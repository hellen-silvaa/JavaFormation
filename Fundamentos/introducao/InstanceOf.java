package Fundamentos.introducao;

public class InstanceOf {
    public static void main(String[] args) {
        Object obj = "Hello";
        if (obj instanceof String) {
            System.out.println(obj); // Saída: Hello
        }
    }
}
//instanceof verifica se um objeto é de um determinado tipo
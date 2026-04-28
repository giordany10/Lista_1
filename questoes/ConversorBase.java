import java.util.Stack;

public class ConversorBase {
    public static String converter(int decimal, int base) {
        if (base < 2 || base > 8) throw new IllegalArgumentException("Base inválida");
        Stack<Integer> pilha = new Stack<>();
        int n = decimal;
        while (n > 0) {
            pilha.push(n % base);
            n /= base;
        }
        StringBuilder resultado = new StringBuilder();
        while (!pilha.isEmpty()) {
            resultado.append(pilha.pop());
        }
        return resultado.toString();
    }
}
public class Fila {
    private static class No {
        int valor;
        No prox;
        No(int valor) { this.valor = valor; }
    }
    private No inicio, fim;
    private int tamanho = 0;

    public Integer ultimo() {
        return (fim != null) ? fim.valor : null;
    }

    public int quantidade() {
        return tamanho;
    }
    // ...outros métodos...
}
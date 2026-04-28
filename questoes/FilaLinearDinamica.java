public class FilaLinearDinamica {
    private static class No {
        int valor;
        No prox;
        No(int valor) { this.valor = valor; }
    }
    private No inicio, fim;

    public int posicao(int valor) {
        No atual = inicio;
        int pos = 0;
        while (atual != null) {
            if (atual.valor == valor) return pos;
            atual = atual.prox;
            pos++;
        }
        return -1; // Não encontrado
    }
    // ...outros métodos...
}
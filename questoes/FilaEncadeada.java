public class FilaEncadeada {
    private static class No {
        int valor;
        No prox;
        No(int valor) { this.valor = valor; }
    }
    private No inicio;

    public boolean estaCrescente() {
        if (inicio == null) return true;
        No atual = inicio;
        while (atual.prox != null) {
            if (atual.valor > atual.prox.valor) return false;
            atual = atual.prox;
        }
        return true;
    }
}
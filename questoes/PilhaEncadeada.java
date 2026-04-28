public class PilhaEncadeada {
    private static class No {
        int valor;
        No prox;
        No(int valor) { this.valor = valor; }
    }
    private No topo;

    public Integer topo() {
        return (topo != null) ? topo.valor : null;
    }
}
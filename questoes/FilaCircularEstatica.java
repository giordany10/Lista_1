public class FilaCircularEstatica {
    private int[] fila;
    private int inicio, fim, tamanho, capacidade;

    public FilaCircularEstatica(int capacidade) {
        this.capacidade = capacidade;
        fila = new int[capacidade];
        inicio = fim = tamanho = 0;
    }

    public boolean existe(int elemento) {
        int count = 0, i = inicio;
        while (count < tamanho) {
            if (fila[i] == elemento) return true;
            i = (i + 1) % capacidade;
            count++;
        }
        return false;
    }
   
}

package exercicio06;

import java.util.Random;

public class Vetor {
    private int[] dados;
    private int tamanho;

    public Vetor(int tamanho) {
        this.tamanho = tamanho;
        this.dados = new int[tamanho];
        preencherAleatorio();
    }

    private void preencherAleatorio() {
        Random rand = new Random();
        for (int i = 0; i < tamanho; i++) {
            dados[i] = rand.nextInt(10000); // valores aleatórios até 9999
        }
    }

    public int[] getDados() {
        return dados;
    }

    public int getTamanho() {
        return tamanho;
    }

    // Método iterativo
    public int maximoIterativo() {
        int max = dados[0];
        for (int i = 1; i < tamanho; i++) {
            if (dados[i] > max) {
                max = dados[i];
            }
        }
        return max;
    }

    // Método recursivo
    public int maximoRecursivo() {
        return maximoRecursivo(0, tamanho - 1);
    }

    private int maximoRecursivo(int inicio, int fim) {
        if (inicio == fim) {
            return dados[inicio];
        }
        int meio = (inicio + fim) / 2;
        int max1 = maximoRecursivo(inicio, meio);
        int max2 = maximoRecursivo(meio + 1, fim);
        return Math.max(max1, max2);
    }
}

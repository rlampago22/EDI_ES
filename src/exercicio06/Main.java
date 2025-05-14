package exercicio06;

public class Main {
    public static void main(String[] args) {
        Vetor vetor = new Vetor(1000);

        // Teste do método recursivo
        long inicio = System.nanoTime();
        int maxRec = vetor.maximoRecursivo();
        long fim = System.nanoTime();
        double tempoRec = (fim - inicio) / 1e6;
        System.out.println("Máximo (Recursivo): " + maxRec + " | Tempo: " + tempoRec + " ms");

        // Teste do método iterativo
        inicio = System.nanoTime();
        int maxIter = vetor.maximoIterativo();
        fim = System.nanoTime();
        double tempoIter = (fim - inicio) / 1e6;
        System.out.println("Máximo (Iterativo): " + maxIter + " | Tempo: " + tempoIter + " ms");
    }
}

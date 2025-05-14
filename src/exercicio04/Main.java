package exercicio04;

public class Main {
    public static void main(String[] args) {
        LSE<String> lista = new LSE<>();
        lista.insereInicio("João");
        lista.insereFim("Maria");
        lista.insereFim("Carlos");

        System.out.println("Impressão da lista:");
        lista.imprime();
    }
}


package exercicio01;

public class TesteCartesiano {
    public static void main(String[] args) {
        PontoCartesiano p1 = new PontoCartesiano(3, 4);
        PontoCartesiano p2 = new PontoCartesiano(6, 8);

        // Exibindo os pontos
        System.out.println("Ponto 1: (" + p1.getX() + ", " + p1.getY() + ")");
        System.out.println("Ponto 2: (" + p2.getX() + ", " + p2.getY() + ")");

        // Calculando e exibindo a distância
        double distancia = p1.calcularDistancia(p2);
        System.out.println("Distância entre os pontos: " + distancia);
    }
}

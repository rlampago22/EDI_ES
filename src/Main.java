// Classe PontoCartesiano
class PontoCartesiano {
    private double x;
    private double y;

    // Construtor
    public PontoCartesiano(double x, double y) {
        this.x = x;
        this.y = y;
    }

    // Getters e Setters
    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    // Método para calcular a distância euclidiana entre dois pontos
    public double calcularDistancia(PontoCartesiano outro) {
        return Math.sqrt(Math.pow(this.x - outro.x, 2) + Math.pow(this.y - outro.y, 2));
    }
}

// Classe Main para testar o TAD
public class Main {
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

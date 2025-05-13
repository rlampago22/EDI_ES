package exercicio01;

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





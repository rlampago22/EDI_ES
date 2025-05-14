package exercicio04;

public class Noh<T> {
    private T info;
    private Noh<T> prox;

    public Noh(T info) {
        this.info = info;
        this.prox = null;
    }

    public T getInfo() {
        return info;
    }

    public Noh<T> getProx() {
        return prox;
    }

    public void setProx(Noh<T> prox) {
        this.prox = prox;
    }
}


package exercicio04;

public class LSE<T> {
    private Noh<T> inicio;

    public LSE() {
        this.inicio = null;
    }

    public void insereInicio(T info) {
        Noh<T> novo = new Noh<>(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            novo.setProx(inicio);
            inicio = novo;
        }
    }

    public void insereFim(T info) {
        Noh<T> novo = new Noh<>(info);
        if (inicio == null) {
            inicio = novo;
        } else {
            Noh<T> atual = inicio;
            while (atual.getProx() != null) {
                atual = atual.getProx();
            }
            atual.setProx(novo);
        }
    }

    public boolean estahVazia() {
        return inicio == null;
    }

    public boolean remove(T info) {
        Noh<T> ant = null, p = inicio;
        while (p != null && !p.getInfo().equals(info)) {
            ant = p;
            p = p.getProx();
        }

        if (p == null)
            return false;

        if (ant == null)
            inicio = p.getProx();
        else
            ant.setProx(p.getProx());

        return true;
    }

    public int tamanho() {
        int cont = 0;
        Noh<T> atual = inicio;
        while (atual != null) {
            cont++;
            atual = atual.getProx();
        }
        return cont;
    }

    public void imprime() {
        Noh<T> atual = inicio;
        while (atual != null) {
            System.out.println(atual.getInfo());
            atual = atual.getProx();
        }
    }
}


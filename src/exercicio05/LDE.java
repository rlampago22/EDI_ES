package exercicio05;

public class LDE<T> {
    private Noh<T> inicio;
    private Noh<T> fim;

    public void insereFim(T info) {
        Noh<T> novo = new Noh<>(info);
        if (inicio == null) {
            inicio = fim = novo;
        } else {
            fim.setProx(novo);
            novo.setAnt(fim);
            fim = novo;
        }
    }

    private Noh<T> busca(T info) {
        Noh<T> p = inicio;
        while (p != null) {
            if (p.getInfo().equals(info))
                return p;
            p = p.getProx();
        }
        return null;
    }

    public boolean remove(T info) {
        Noh<T> p = busca(info);
        if (p == null) return false;
        if (p == inicio) {
            inicio = p.getProx();
            if (inicio != null) inicio.setAnt(null);
            else fim = null;
        } else if (p == fim) {
            fim = p.getAnt();
            fim.setProx(null);
        } else {
            p.getAnt().setProx(p.getProx());
            p.getProx().setAnt(p.getAnt());
        }
        return true;
    }

    public void imprimeInicioFim() {
        Noh<T> p = inicio;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getProx();
        }
    }

    public void imprimeFimInicio() {
        Noh<T> p = fim;
        while (p != null) {
            System.out.println(p.getInfo());
            p = p.getAnt();
        }
    }
}


package exercicio05;

public class Aluno {
    private String nome;
    private int matricula;

    public Aluno(String nome, int matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public String toString() {
        return nome + " - " + matricula;
    }

    public int getMatricula() {
        return matricula;
    }
}


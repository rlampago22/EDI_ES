package exercicio02;

public class aluno {
    private String nome;
    private int idade;
    private double nota;

    public aluno(String nome, int idade, double nota) {
        this.nome = nome;
        this.idade = idade;
        this.nota = nota;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public double getNota() {
        return nota;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof aluno) {
            aluno outro = (aluno) obj;
            return this.nome.equals(outro.nome) &&
                    this.idade == outro.idade &&
                    this.nota == outro.nota;
        }
        return false;
    }

    @Override
    public String toString() {
        return nome + " - Idade: " + idade + " - Nota: " + nota;
    }
}
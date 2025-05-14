package exercicio05;

public class Main {
    public static void main(String[] args) {
        LDE<Aluno> lista = new LDE<>();
        lista.insereFim(new Aluno("João", 123));
        lista.insereFim(new Aluno("Maria", 456));
        lista.insereFim(new Aluno("Carlos", 789));

        System.out.println("Imprimindo início ao fim:");
        lista.imprimeInicioFim();

        System.out.println("\nRemovendo aluno com matrícula 456...");
        lista.remove(new Aluno("Maria", 456)); // funciona se equals estiver implementado

        System.out.println("\nImprimindo fim ao início:");
        lista.imprimeFimInicio();
    }
}


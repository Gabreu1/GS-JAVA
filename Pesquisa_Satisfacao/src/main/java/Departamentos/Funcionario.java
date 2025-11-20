package Departamentos;

public class Funcionario {
    private String nome;

    private int numeroFuncionario;

    private boolean usaIA;


    public Funcionario(String nome, int numeroFuncionario, boolean usaIA) {
        this.nome = nome;
        this.numeroFuncionario = numeroFuncionario;
        this.usaIA = usaIA;
    }


    public int getNumeroFuncionario() {
        return numeroFuncionario;
    }

    public boolean isUsaIA() {
        return usaIA;
    }


    @Override
    public String toString() {
        return "ID: " + numeroFuncionario + ", Nome: " + nome +
                ", Usa IA: " + (usaIA ? "Sim" : "Não");
    }
}

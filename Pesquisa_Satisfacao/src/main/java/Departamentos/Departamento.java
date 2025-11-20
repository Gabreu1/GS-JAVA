package Departamentos;

import java.util.ArrayList;
import java.util.List;

public class Departamento {
    private String nome;
    private List<Funcionario> funcionarios;

    // Construtor
    public Departamento(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<>();
    }

    public void adicionarFuncionario(Funcionario f) {
        this.funcionarios.add(f);
    }

    public int getQuantidadeFuncionarios() {
        return this.funcionarios.size();
    }

    public int getFuncionariosComIA() {
        int count = 0;
        for (Funcionario f : funcionarios) {
            if (f.isUsaIA()) {
                count++;
            }
        }
        return count;
    }


     //Calcula a porcentagem de funcionários que utilizam IA.
    public double calcularPorcentagemUsoIA() {
        int total = getQuantidadeFuncionarios();
        int comIA = getFuncionariosComIA();

        if (total == 0) {
            return 0.0;
        }


        return ((double) comIA / total) * 100.0;
    }


    public void exibirRelatorio() {
        System.out.println("--- Relatório do Departamento de " + nome + " ---");
        System.out.println("Total de Funcionários: " + getQuantidadeFuncionarios());
        System.out.println("Funcionários que Usam IA: " + getFuncionariosComIA());
        // Formata a porcentagem para duas casas decimais
        System.out.printf("Porcentagem de Uso de IA: %.2f%%\n", calcularPorcentagemUsoIA());
        System.out.println("Detalhes dos Funcionários:");
        for (Funcionario f : funcionarios) {
            System.out.println("  - " + f.toString());
        }
        System.out.println("---------\n");
    }
}

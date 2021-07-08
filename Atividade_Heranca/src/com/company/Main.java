package com.company;

public class Main {

    public static void main(String[] args) {
        Empresa apple = new Empresa("Apple");

        PF pedro = new PF("3463463535");
        pedro.setNome("Pedro");
        pedro.setSalario(10000);

        PJ jose = new PJ("57686537556");
        jose.setNome("José");
        jose.setSalario(20000);

        apple.adicionaFuncionario(pedro);
        apple.adicionaFuncionario(jose);

        System.out.println("Empresa: "+ apple.getNome());

        System.out.println("Funcionários da Empresa " + apple.getNome());

        for (Funcionario f: apple.getFuncionarios()){
            System.out.println(f.getNome() + " | Salário Líquido: " + f.getSalarioLiquido());
        }
    }

}


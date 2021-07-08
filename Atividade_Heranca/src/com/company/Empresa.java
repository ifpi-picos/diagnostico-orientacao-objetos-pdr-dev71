package com.company;

import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private String nome;
    private List<Funcionario> funcionarios;

    public Empresa(String nome) {
        this.nome = nome;
        this.funcionarios = new ArrayList<Funcionario>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void adicionaFuncionario(Funcionario funcionario){
        this.funcionarios.add(funcionario);
    }

    public void removeFuncionario(Funcionario funcionario){
        this.funcionarios.remove(funcionario);
    }


    public List<Funcionario> getFuncionarios() {
        return funcionarios;
    }
}


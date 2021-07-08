package com.company;

import java.util.List;

public class Funcionario {
    private String nome;
    private float salario;
    private List beneficios;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalarioLiquido() {
        return salario;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public void setBeneficios(List beneficios) {
        this.beneficios = beneficios;
    }

    public List getBeneficios(){
        return beneficios;
    }
}

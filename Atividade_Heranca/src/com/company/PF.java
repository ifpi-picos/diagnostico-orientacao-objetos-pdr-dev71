package com.company;

import java.util.List;

public class PF extends Funcionario {
    private String cpf;

    public PF(String cpf) {
        this.cpf = cpf;
        this.setBeneficios(List.of("plano de saúde", "vr", "férias"));
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public float getSalarioLiquido() {
        return super.getSalarioLiquido() - super.getSalarioLiquido() * 0.1f;
    }
}

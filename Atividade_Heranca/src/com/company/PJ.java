package com.company;


import java.util.List;

public class PJ extends Funcionario {
    private String cnpj;

    public PJ(String cnpj) {
        this.cnpj = cnpj;
        this.setBeneficios(List.of("Plano de Saúde"));
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }


    @Override
    public float getSalarioLiquido() {
        return super.getSalarioLiquido() - super.getSalarioLiquido() * 0.05f;
    }
}

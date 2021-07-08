package com.company;

public class Disciplina {
    private String nome;
    private int ch;
    private Professor professor;

    public Disciplina(String nome, int ch, Professor professor) {
        this.nome = nome;
        this.ch = ch;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCh() {
        return ch;
    }

    public void setCh(int ch) {
        this.ch = ch;
    }

}

package com.company;

import java.util.ArrayList;
import java.util.List;

public class Curso {
    private String nome;

    private List<Disciplina> disciplinas;

    public Curso(String nome) {
        this.nome = nome;
        this.disciplinas = new ArrayList<Disciplina>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Disciplina> getDisciplinas() {
        return disciplinas;
    }

    public void removeDisciplina(Disciplina disciplina){
        this.disciplinas.remove(disciplina);
    }

    public void adicionaDisciplina(Disciplina disciplina){
        this.disciplinas.add(disciplina);
    }

    public Disciplina getDisciplina(int index){
        return this.disciplinas.get(index);
    }
}

package com.company;

public class Main {

    public static void main(String[] args) {
        Curso es = new Curso("engenharia de software");

        Professor pedrinho = new Professor("Pedro");

        Disciplina tcc = new Disciplina("TCC", 120, pedrinho);

        es.adicionaDisciplina(tcc);

        System.out.println("Curso: "+ es.getNome());

        System.out.println("Disciplinas de Engenharia de Software");

        for (int i = 0; i < es.getDisciplinas().size(); i++) {
            Disciplina disciplina = es.getDisciplinas().get(i);
            System.out.println(disciplina.getNome() + " | ch: " + disciplina.getCh());
        }
    }
}
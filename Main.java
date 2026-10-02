package com.mycompany.main;

public class Main {

    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Lucas");
        a1.setIdade(16);
        a1.setCpf("111.222.333-44");
        a1.setEmail("lucas@escola.com");
        a1.setMatricula("2026-A");
        a1.apresenta();
        a1.estudar();
        
        Professor p1 =  new Professor();
        p1.setNome("Carlos");
        p1.setIdade(40);
        p1.setCpf("555.666.777-88");
        p1.setEmail("carlos@escola.com");
        p1.setDisciplina("POO em Java");
        p1.apresenta();
        p1.darAula();
        
        Diretor d1 =  new Diretor();
        d1.setNome("Mariana");
        d1.setIdade(48);
        d1.setCpf("999.888.777-66");
        d1.setEmail("mariana@escola.com");
        d1.setTurnoGestao("Integral");
        d1.apresenta();
        d1.fazerReuniao();
    }
}

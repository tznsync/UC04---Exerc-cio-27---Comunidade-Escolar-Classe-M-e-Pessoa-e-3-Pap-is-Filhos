package com.mycompany.main;

public class Professor extends Pessoa {
    private String disciplina;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    
    public void darAula() {
        System.out.println("O professor "+getNome()+
                "\n"+"iniciou a explicação de "+
                "\n"+getDisciplina()+"!"+
                "\n"+"------------------------------------------------");
    }
}

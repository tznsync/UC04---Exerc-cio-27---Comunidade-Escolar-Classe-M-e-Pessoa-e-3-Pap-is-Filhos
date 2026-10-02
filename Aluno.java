package com.mycompany.main;

public class Aluno extends Pessoa {
    private String matricula;

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    
    public void estudar() {
        System.out.println("O aluno "+getNome()+
                "\n"+"Matricula: "+getMatricula()+
                "\n"+"abriu os cadernos para estudar!"+
                "\n"+"------------------------------------------------");
    }
}

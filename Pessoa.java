package com.mycompany.main;

public class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }
    
    public void apresenta() {
        System.out.println("Ola, sou "+getNome()+
                "\n"+"tenho "+getIdade()+" anos | CPF: "+getCpf()+
                "\n"+"email: "+getEmail()+
                "\n"+"------------------------------------------------");
    }
}

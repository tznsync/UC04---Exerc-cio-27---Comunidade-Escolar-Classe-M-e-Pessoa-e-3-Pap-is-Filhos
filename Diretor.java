package com.mycompany.main;

public class Diretor extends Pessoa {
    private String turnoGestao;

    public String getTurnoGestao() {
        return turnoGestao;
    }

    public void setTurnoGestao(String turnoGestao) {
        this.turnoGestao = turnoGestao;
    }
    
    public void fazerReuniao() {
        System.out.println("O diretor "+getNome()+
                "\n"+"Turno: "+getTurnoGestao()+" convocou uma reuniao geral!");
    }
}

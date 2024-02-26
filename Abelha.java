package org.example;

import javax.swing.*;

public class Abelha {


//Declaração:
    static String local = "Colmeia";
    private String nome, cor, funcao;

//Set e Get:
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

//Ações:
    public void voar(){
        JOptionPane.showMessageDialog(null, this.nome + " está voando...");
    }

    public void colherNectar(){
        JOptionPane.showMessageDialog(null, this.nome + " está colhendo nectar...");
    }

    public void descansando(){
        JOptionPane.showMessageDialog(null, "A rainha " + this.nome + " está descansando na " +local + " para garantir que seus filhotes fiquem saudáveis.");
    }


//Construtores:
    public Abelha(){
    }

    public Abelha(String nome){
        this.nome = nome;
    }



}

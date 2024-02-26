package org.example;

import javax.swing.*;
import java.util.Locale;

public class Tamandua {

    private String nome, cor, idade;

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

    public String getIdade() {
        this.idade = idade.toLowerCase();
        return idade;
    }

    public void setIdade(String idade) {
        this.idade = idade.toLowerCase();
    }

    //Ações
    public void comerFormiga(){
        JOptionPane.showMessageDialog(null, "O tamanduá " +getNome() + " está comendo formigas agora...");
    }

    public void defesa() {
        JOptionPane.showMessageDialog(null, "O tamanduá " + getNome() + " está em pé tentando intimidar as ameaças iminentes...");
    }

    //Construtor
    public Tamandua(){
    }
}

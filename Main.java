package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        //Abelha 1
        Abelha ab1 = new Abelha();

        ab1.setNome(JOptionPane.showInputDialog(null, "Insira o nome da sua abelha: "));
        ab1.setCor(JOptionPane.showInputDialog(null, "Insira a cor da sua abelha: "));
        ab1.setFuncao(JOptionPane.showInputDialog(null, "Insira a função da sua abelha (operária, zangão ou rainha): "));

        JOptionPane.showMessageDialog(null, "Nome: " +ab1.getNome() + "\nCor: " +ab1.getCor() + "\nFunção: " +ab1.getFuncao());

        ab1.voar();
        ab1.colherNectar();


        //Abelha 2
        Abelha ab2 = new Abelha("Gil Goiaba");
        ab2.setCor("Amarela");
        ab2.setFuncao("Rainha");

        JOptionPane.showMessageDialog(null, "Nome: " +ab2.getNome() + "\nCor: " +ab2.getCor() + "\nFunção: " +ab2.getFuncao());

        ab2.voar();
        ab2.descansando();

    }
}
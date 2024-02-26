package org.example;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        Abelhas();
        Tamandua();

    }

    public static void Abelhas(){

        //Abelha 1
        Abelha ab1 = new Abelha();
        boolean validacaoLoop = false;

        ab1.setNome(JOptionPane.showInputDialog(null, "Insira o nome da sua abelha: "));
        ab1.setCor(JOptionPane.showInputDialog(null, "Insira a cor da sua abelha: "));

        do {
            ab1.setFuncao(JOptionPane.showInputDialog(null, "Insira a função da sua abelha (operaria, zangao ou rainha): "));
            if (ab1.getFuncao().equalsIgnoreCase("operaria") || ab1.getFuncao().equalsIgnoreCase("zangao") || ab1.getFuncao().equalsIgnoreCase("rainha")) {
                validacaoLoop = true;
            }
        }while (validacaoLoop == false);

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

    public static void Tamandua(){
        Tamandua t1 = new Tamandua();
        boolean validacaoLoop = false;

        t1.setNome(JOptionPane.showInputDialog(null, "Insira o nome do seu tamanduá: "));
        t1.setCor(JOptionPane.showInputDialog(null, "Insira a cor do tamanduá " +t1.getNome()));

            do {
                t1.setIdade(JOptionPane.showInputDialog(null, "Insira se o tamanduá "+t1.getNome() +" é um filhote ou adulto"));
                if (t1.getIdade().equals("filhote") || t1.getIdade().equals("adulto")) {
                    validacaoLoop = true;
                }
            }while (validacaoLoop == false);

        JOptionPane.showMessageDialog(null, "Nome: " +t1.getNome() + "\nCor: " +t1.getCor() + "\nIdade: " +t1.getIdade());

        t1.comerFormiga();
        t1.comerFormiga();

        JOptionPane.showMessageDialog(null, "Um predador apareceu!");
        t1.defesa();
        JOptionPane.showMessageDialog(null, "A defesa deu certo! " +t1.getNome() + " escapou do predador.");
    }
}
package Condicoes;

import java.util.Scanner;

public class Atividade04_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o seu nome de usuário: ");
        String nomeUsuario = input.nextLine();

        System.out.println("Insira sua senha: ");
        String senhaUsuario = input.nextLine();

        if (nomeUsuario.equals("Lucas") && senhaUsuario.equals("12345678")) {
            System.out.println("Você logou com sucesso!");
        } else {
            System.out.println("Erro: Usuário ou senha está errado!");
        }


    }

}
package Condicoes;

import java.util.Scanner;

public class Atividade06_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a média final do aluno: ");
        double media = input.nextInt();

        if (media >= 7) {
            System.out.println("O aluno foi aprovado.");
        } else if (media >= 5) {
            System.out.println("O aluno ficou de recuperação.");
        } else {
            System.out.println("O aluno foi reprovado.");
        }

    }

}

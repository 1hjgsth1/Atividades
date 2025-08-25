package Condicoes;

import java.util.Scanner;

public class Atividade01_Condicoes {

    public static void main(String[] args) {

        /*
         * < menor que
         * <= menor ou igual a
         * > maior que
         * >= maior ou igual a
         * */

        Scanner input = new Scanner(System.in);

        System.out.println("Qual é a sua idade?");
        int idade = input.nextInt();

        boolean maioridade = idade >= 18;

        if (maioridade) {
            System.out.println("Você tem " + idade + " anos, portanto é de maior.");
        } else {
            System.out.println("Você tem " + idade + " anos, portanto é de menor.");
        }

    }

}

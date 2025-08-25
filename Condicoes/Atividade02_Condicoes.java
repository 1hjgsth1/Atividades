package Condicoes;

import java.util.Scanner;

public class Atividade02_Condicoes {

    public static void main(String[] args) {

        /*
         * < menor que
         * <= menor ou igual a
         * > maior que
         * >= maior ou igual a
         * */

        Scanner input = new Scanner(System.in);

        System.out.println("Qual foi a sua nota?");
        int nota = input.nextInt();

        if (nota >= 9) {
            System.out.println("Nota exelente.");
        } else if (nota >= 7) {
            System.out.println("Nota boa.");
        } else if (nota >= 5) {
            System.out.println("Nota satisfatória.");
        } else {
            System.out.println("Nota insatisfatória.");
        }

    }

}
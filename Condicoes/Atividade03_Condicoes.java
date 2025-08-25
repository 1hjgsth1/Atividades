package Condicoes;

import java.util.Scanner;

public class Atividade03_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Qual é o numero?");
        int numero = input.nextInt();

        if (numero % 2 == 0) {
            System.out.println("Este numero é par.");
        } else System.out.println("Este numero é impar.");

    }

}

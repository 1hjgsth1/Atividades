package Condicoes;

import java.util.Scanner;

public class Atividade09_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        double numero = input.nextDouble();

        if (numero >= 1) {
            System.out.println("Esse numero é positivo.");
        } else if (numero == 0) {
            System.out.println("Esse é o numero zero.");
        } else {
            System.out.println("Esse numero é negativo.");
        }

    }

}

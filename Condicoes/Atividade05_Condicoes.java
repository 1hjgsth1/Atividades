package Condicoes;

import java.util.Scanner;

public class Atividade05_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int diaNumero = input.nextInt();
        String nomeDia = switch (diaNumero) {
            case 1 -> "Segunda-feira";
            case 2 -> "Terça-feira";
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6 -> "Sábado";
            case 7 -> "Domingo";
            default -> "Número inválido. Por favor, insira um número entre 1 e 7.";
        };

        System.out.println(nomeDia);

    }

}

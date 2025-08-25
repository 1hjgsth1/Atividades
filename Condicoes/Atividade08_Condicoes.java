package Condicoes;

import java.util.Scanner;

public class Atividade08_Condicoes {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Digite a temperatura em Celsius: ");
        double temperatura = input.nextInt();

        if (temperatura >= 30) System.out.println("O clima está quente.");
        else if (temperatura >= 15) {
            System.out.println("O clima está agradável.");
        } else {
            System.out.println("O clima está frio.");
        }
    }

}

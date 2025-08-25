package Condicoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade10_Condicoes {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$#,##0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor total da compra: ");
        double valorOriginal = input.nextDouble();

        double percentualDesconto;
        double valorDesconto;
        double valorFinal;

        if (valorOriginal > 500.00) {
            percentualDesconto = 0.20;
        } else if (valorOriginal >= 200.00) {
            percentualDesconto = 0.10;
        } else if (valorOriginal >= 100.00) {
            percentualDesconto = 0.05;
        } else {
            percentualDesconto = 0.0;
        }

        valorDesconto = valorOriginal * percentualDesconto;
        valorFinal = valorOriginal - valorDesconto;

        System.out.println("Valor total da compra: " + df.format(valorOriginal));
        System.out.println("Percentual de desconto aplicado: " + percentualDesconto);
        System.out.println("Valor descontado: " + df.format(valorDesconto));
        System.out.println("Valor final da compra: " + df.format(valorFinal));

    }

}
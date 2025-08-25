package Condicoes;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Atividade11_Condicoes {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$#,##0.00");
        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor bruto do salário: ");
        double valorOriginal = input.nextDouble();

        System.out.println("Digite o numero de anos trabalhados: ");
        int anos = input.nextInt();

        double imposto = 0;
        double bonos = 0;

        if (anos >= 10) {
            bonos = valorOriginal * 0.10;
        } else if (anos >= 5) {
            bonos = valorOriginal * 0.05;
        }

        if (valorOriginal > 5000.00) {
            imposto = valorOriginal * 0.27;
        } else if (valorOriginal >= 3000.00) {
            imposto = valorOriginal * 0.18;
        } else if (valorOriginal < 3000.00) {
            imposto = valorOriginal * 0.10;
        }

        double salarioLiquido = (valorOriginal + bonos) - imposto;

        System.out.println("Salario bruto: " + df.format(valorOriginal));
        System.out.println("Bonos recebido: " + df.format(bonos));
        System.out.println("Imposto descontado: " + df.format(imposto));
        System.out.println("Salario liquido: " + df.format(salarioLiquido));

    }
}
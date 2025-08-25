package Condicoes;

import java.util.Scanner;

public class Atividade07_Condicoes {

    public static void main(String[] args) {

        double resultado;

        System.out.println("Digite o primeiro numero: ");
        double numero1 = new Scanner(System.in).nextDouble();

        System.out.println("Digite a operação: ");
        char operacao = new Scanner(System.in).next().charAt(0);

        System.out.println("Digite o segundo numero: ");
        double numero2 = new Scanner(System.in).nextDouble();


        if (operacao == '+') {
            resultado = numero1 + numero2;
        } else if (operacao == '-') {
            resultado = numero1 - numero2;
        } else if (operacao == '/') {
            if (numero2 != 0) {
                resultado = numero1 / numero2;
            } else {
                System.out.println("Erro ao executar operação: Não é possivel dividir por zero.");
                return;
            }
        } else if (operacao == '*') {
            resultado = numero1 * numero2;
        } else {
            System.out.println("Operação invalida. Por favor, use +, -, / ou *");
            return;
        }

        System.out.println("O resultado de " + numero1 + " " + operacao + " " + numero2 + " é: " + resultado);

    }

}

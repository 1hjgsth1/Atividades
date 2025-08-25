package ManipulacaoVariavel;

import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$#,##0.00");

        String nomeDeProduto = "Choco-Leite";
        double precoUnitarioProduto = 15;
        double quantidadeProduto = 20;
        double taxaImposto = 0.10;
        double margemLucro = 0.40;
        double margemLucroProduto = 1.40;

        double taxaImpostoProduto = 1.10;
        double valorTotalSemImposto = precoUnitarioProduto * quantidadeProduto;
        double valorDoImposto = valorTotalSemImposto * taxaImposto;

        System.out.println("O nome do produto é: " + nomeDeProduto);
        System.out.println("Preço por unidade: " + df.format(precoUnitarioProduto));
        System.out.println("Quantidade comprada do produto: " + quantidadeProduto);
        System.out.println("Taxa de imposto do produto: " + taxaImposto);
        System.out.println("A margem de lucro do produto é de: " + margemLucro);
        System.out.println("O preço do produto com imposto é de: " + df.format(precoUnitarioProduto * taxaImpostoProduto));
        System.out.println("O valor necessario para lucrar é de: " + df.format(precoUnitarioProduto * margemLucroProduto));


    }
}

package ManipulacaoVariavel;

import java.text.DecimalFormat;

public class Atividade03_ManipulacaoVariavel {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat("R$#,##0.00");

        String nomeDeProduto = "Choco-Leite";
        double precoUnitarioProduto = 15.00;
        int quantidadeProduto = 20;
        double taxaImposto = 0.10;
        double margemLucro = 0.40;

        double valorTotalSemImposto = precoUnitarioProduto * quantidadeProduto;
        double valorDoImposto = valorTotalSemImposto * taxaImposto;
        double valorTotalComImposto = valorTotalSemImposto + valorDoImposto;

        double precoVenda = valorTotalComImposto * (1 + margemLucro);

        System.out.println("Nome do produto: " + nomeDeProduto);
        System.out.println("Preço unitário: " + df.format(precoUnitarioProduto));
        System.out.println("Quantidade comprada: " + quantidadeProduto);
        System.out.println("Taxa de imposto: " + (taxaImposto * 100) + "%");
        System.out.println("Margem de lucro: " + (margemLucro * 100) + "%");

        System.out.println("Valor total sem imposto: " + df.format(valorTotalSemImposto));
        System.out.println("Valor do imposto: " + df.format(valorDoImposto));
        System.out.println("Valor total com imposto: " + df.format(valorTotalComImposto));
        System.out.println("Preço de venda sugerido: " + df.format(precoVenda));

    }

}

package ManipulacaoVariavel;

public class Atividade02_ManipulacaoVariavel {

    public static void main(String[] args) {

        String nome = "Lucas";
        int idade = 18;
        double salarioBruto = 2500.00;
        int mesesTrabalhados = 11;
        int quantidadeProdutos = 15;
        double descSalarioBruto = 2000.00;
        double valorMedProduto = 100.00;
        double valorTotalProduto = valorMedProduto / quantidadeProdutos;

        double salarioAnualBruto = (mesesTrabalhados * 2500.00);
        double salarioLiquido = salarioAnualBruto - descSalarioBruto;

        // Exibição dos resultados

        System.out.println("Bem vindo, " + nome);
        System.out.println("Seu salario anual liquido atual é: " + salarioLiquido);
        System.out.println("Seu salario bruto é: " + salarioBruto);
        System.out.println("Quantidade de meses trabalhados:  " + mesesTrabalhados);
        System.out.println("Quantidade de prdutos comprados:  " + quantidadeProdutos);
        System.out.println("Valor de desconto fixo: " + descSalarioBruto);
        System.out.println("Valor médio de produto: " + valorMedProduto);
        System.out.println("Valor total de produto: " + valorTotalProduto);

    }
}

package ManipulacaoVariavel;

public class Atividade01_ManipulacaoVariavel {

    public static void main(String[] args) {

        int idade1 = 18;
        int idade2 = 2;
        double altura = 1.6;
        String nome = "Lucas";
        boolean estudante = true;
        int idadeSoma = idade1 + idade2;
        double alturaDobro = altura * 2;
        String saudacao = "Até a proxima.";

        // Exibição dos resultados
        System.out.println("Idade: " + idade1);
        System.out.println("Altura: " + altura);
        System.out.println("Nome: " + nome);
        System.out.println("Estudante: " + estudante);
        System.out.println("Soma das idades: " + idadeSoma);
        System.out.println("Altura dobrada: " + alturaDobro);
        System.out.println(saudacao);

    }
}
import java.util.Scanner;

public class Questao_30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nome do vendedor:");
        String nome = sc.nextLine();
        
        System.out.println("Salário fixo:");
        double salario_fixo = sc.nextDouble();
        System.out.println("Total de vendas no mês (em R$):");
        double vendas = sc.nextDouble();
        
        double comissao = vendas * 0.15;
        
        double salario_total = salario_fixo + comissao;
        
        System.out.println("Vendedor: " + nome + "\n");
        System.out.printf("Salario fixo: R$ %.3f\n", salario_fixo);
        System.out.printf("Comissão de vendas: R$ %.3f\n", comissao);
        System.out.printf("Salário total: R$ %.3f\n", salario_total);
        


        sc.close();

    }
}

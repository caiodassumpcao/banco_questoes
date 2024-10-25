import java.util.Scanner;

public class questao_32 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo do produto ( em reais):");
        double custo = sc.nextDouble();
        System.out.println("Digite percentual de venda:");
        double percentual = sc.nextDouble();

        double acrescimoVenda = custo * (percentual / 100);
        double precoVenda = acrescimoVenda + custo;

        System.out.printf("Preço de venda: R$ %.3f\n", precoVenda);
        System.out.printf("Lucro: R$ %.3f\n", acrescimoVenda);

        sc.close();

    }
}

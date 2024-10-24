import java.util.Scanner;

public class questao_28 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual foi o valor do depósito na poupança?");
        double deposito = sc.nextDouble();

        final double COTACAO = 0.005;
        
        double rendimento = deposito * COTACAO;
        double total = rendimento + deposito;
        System.out.printf("Rendeu: %.5f\n", rendimento);
        System.out.printf("Total: %.5f\n", total);
        sc.close();
    }
}

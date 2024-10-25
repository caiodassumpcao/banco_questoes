import java.util.Scanner;

public class questao_27 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual a cotação do dolar?");
        double cotacao = sc.nextDouble();
        System.out.println("Quantos reais disponiveis para conversão?");
        double real = sc.nextDouble();

        double dolar = real / cotacao;

        System.out.printf("Dolares disponíveis: %.2f\n", dolar);
        sc.close();
    }
}

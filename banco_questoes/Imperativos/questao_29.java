import java.util.Scanner;

public class Questao_29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual valor total da compra?");
        double valor_total = sc.nextDouble();
        
        double parcela_5 = valor_total / 5;
        System.out.printf("Valor da parcela: 5x R$ %.2f\n", parcela_5);
        
        
        sc.close();

    }
}

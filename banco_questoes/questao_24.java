import java.util.Scanner;

public class questao_24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Digite o primeiro numero");
        double num_1 = sc.nextDouble();
        System.err.println("Digite o segundo numero");
        double num_2 = sc.nextDouble();

        double soma = num_1 + num_2;
        double sub = num_1 - num_2;
        double mult = num_1 * num_2;
        double div = num_1 / num_2;

        System.out.printf("Soma: %.3f\n", soma);
        System.out.printf("Soma: %.3f\n", sub);
        System.out.printf("Soma: %.3f\n", mult);
        System.out.printf("Soma: %.3f\n", div);
        sc.close();
    }
}

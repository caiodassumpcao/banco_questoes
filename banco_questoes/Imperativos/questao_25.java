import java.util.Scanner;

public class Questao_25 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.err.println("Digite o primeiro numero");
        double num_1 = sc.nextDouble();
        System.err.println("Digite o segundo numero");
        double num_2 = sc.nextDouble();

        double a = (num_1 * 2) * (num_2 / 2);
        double b = (num_1 * 3) + num_2;
        double c = Math.pow(num_2, 3);

        System.out.printf("O produto do dobro do primeiro com metade do segundo: %.3f\n", a);
        System.out.printf("A soma do triplo do primeiro com o terceiro: %.3f\n", b);
        System.out.printf("O terceiro elevado ao cubo: %.3f\n", c);
        
        sc.close();
    }
}

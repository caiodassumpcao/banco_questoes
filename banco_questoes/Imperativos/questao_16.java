import java.util.Scanner;

public class Questao_16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o peso em kg:");
        double kg = sc.nextDouble();
        sc.close();

        double lb = kg * 2.2;
        System.out.printf("O peso em libras: %.3f", lb);
    }
}

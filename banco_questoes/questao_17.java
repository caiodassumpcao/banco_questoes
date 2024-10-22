import java.util.Scanner;

public class questao_17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a sua altura em metros:");
        float altura = sc.nextFloat();
        sc.close();

        float peso_ideal = (float) (( altura * 72.7 ) - 58);
        System.out.printf("O seu peso ideal em kg: %.3f", peso_ideal);
    }
}

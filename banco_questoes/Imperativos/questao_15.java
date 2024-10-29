import java.util.Scanner;

public class Questao_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o raio da base do cone:");
        double raio = sc.nextDouble();
        System.out.println("Digite a altura do cone:");
        double altura = sc.nextDouble();

        sc.close();
        double volume = Math.PI * Math.pow(raio, 2) * altura / 3;
        System.out.printf("Volume do cone: %.3f", volume);
    }
}

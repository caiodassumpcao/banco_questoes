import java.util.Scanner;

public class Questao_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a areasta do cubo:");
        double aresta = sc.nextDouble();
        sc.close();
        double volume = Math.pow(aresta, 3);
        System.out.printf("Volume do cubo: %.3f", volume);
    }
}

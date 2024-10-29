import java.util.Scanner;

public class Questao_23 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual tamanho do arquivo (em MB)? ");
        double mb = sc.nextDouble();
        System.out.println("Qual a velociade do link (em Mbps)? ");
        double mbps = sc.nextDouble();

        double tempo_s = mb / (mbps / 10);
        float tempo_m = (float) (tempo_s / 60);
        System.out.printf("A velocidade em segundos é: %.3f", tempo_m);

        sc.close();
    }
}

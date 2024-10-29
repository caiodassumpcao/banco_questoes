import java.util.Scanner;

public class Questão_33 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o custo de fábrica do carro em reais:");
        double custoFabrica = sc.nextDouble(); 

        double imposto = custoFabrica * 1.45;
        double custoFinal = imposto * 1.28;

        System.out.printf("Custo ao consumidor: %.2f\n", custoFinal);
        
        System.out.printf("Custo de fábrica: %.2f\n", custoFabrica);
        sc.close();
    }
}

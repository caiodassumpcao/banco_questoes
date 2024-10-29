package Condicionais;

import java.util.Scanner;

public class Questao_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o  preço do 1° produto:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o  preço do 2° produto:");
        double n2 = sc.nextDouble();
        System.out.println("Digite o  preço do 3° produto:");
        double n3 = sc.nextDouble();
        
        double menor = n1;

            if (n2 > menor) {
                menor = n2;
            }
            if (n3 > menor) {
                menor = n3;
            }
        
        System.out.printf("Produto mais barato: R$ %.2f", menor);
        sc.close();
    }
}

package Condicionais;

import java.util.Scanner;

public class questao_1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um número:");
        double num_1 = sc.nextDouble();
        System.out.println("Digite outro número:");
        double num_2 = sc.nextDouble();
    
        sc.close();
        if ( num_1 > num_2) {
            System.out.printf("Maior número: %.2f", num_1);
        } else if (num_2 > num_1) {
            System.out.printf("Maior número: %.2f", num_2);
        } else {
            System.out.printf("Os números são iguais: %.2f", num_1);
        }
    }
}

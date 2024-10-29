package Condicionais;

import java.util.Scanner;

public class Questao_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1° número:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2° número:");
        double n2 = sc.nextDouble();
        System.out.println("Digite o 3° número:");
        double n3 = sc.nextDouble();
        
        double maior = n1;

            if (n2 > maior) {
                maior = n2;
            }
            if (n3 > maior) {
                maior = n3;
            }
        
        System.out.println("Maior número:" + maior);
        sc.close();
    }
}

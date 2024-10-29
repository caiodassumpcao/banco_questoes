package Condicionais;

import java.util.Scanner;

public class Questao_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o 1° número:");
        double n1 = sc.nextDouble();
        System.out.println("Digite o 2° número:");
        double n2 = sc.nextDouble();
        System.out.println("Digite o 3° número:");
        double n3 = sc.nextDouble();

        double maior = n1;
        double meio = n1;
        double menor = n1;

        if (n1 >= n2 && n1 >= n3) {
            maior = n1;
            if (n2 >= n3) {
                meio = n2;
                menor = n3;
            } else {
                meio = n3;
                menor = n2;
            }
        } else if (n2 >= n1 && n2 >= n3) {
            maior = n2;
            if (n1 >= n3) {
                meio = n1;
                menor = n3;
            } else {
                meio = n3;
                menor = n1;
            }
        } else {
            maior = n3;
            if (n1 >= n2) {
                meio = n1;
                menor = n2;
            } else {
                meio = n2;
                menor = n1;
            }
        }

        System.out.println("Ordem decrescente:");
        System.out.println(maior);
        System.out.println(meio);
        System.out.println(menor);
        sc.close();
    }
}

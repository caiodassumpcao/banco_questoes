package Condicionais;

import java.util.Scanner;

public class Questao_2 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
    
        System.out.println("Digite um número positivo:");
        double num_1 = sc.nextDouble();

        sc.close();

        double numeroOposto = num_1 * -1;

        System.out.println("O oposto do número é: " + numeroOposto);
    }
}
package Condicionais;

import java.util.Scanner;

public class Questao_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite sua nota da AV1:");
        double av1 = sc.nextDouble();
        System.out.println("Digite sua nota da AV2:");
        double av2 = sc.nextDouble();
        
        double media = (av1 + av2) / 2;
        
        if (Math.abs(media - 10) < 0.0001) {
            System.out.println("Aprovado com mérito");
        } else if (media >= 7){
            System.out.println("Aprovado por média");
            
        } else {
            System.out.println("Reprovado");

        }
        sc.close();
    }
}

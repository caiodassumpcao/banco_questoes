package Condicionais;

import java.util.Scanner;

public class Questao_3 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Qual seu gênero?");
        String gen = sc.next();

        if (gen.charAt(0) == 'f' || gen.charAt(0) == 'F') {
            System.out.println("Gênero Feminino");
            
        } else if (gen.charAt(0) == 'm' || gen.charAt(0) == 'M') {
            System.out.println("Gênero Masculino");
            
        } else {
            System.out.println("Gênero inválido");

        }

        sc.close();
    }
}

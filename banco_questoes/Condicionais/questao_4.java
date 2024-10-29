package Condicionais;

import java.util.Arrays;
import java.util.Scanner;

public class Questao_4 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite uma letra:");
        String letra = sc.next().toLowerCase();

        String[] vogais = {"a", "e", "i", "o", "u"};

        if (Arrays.asList(vogais).contains(letra)) {
            System.out.println("Letra é uma vogal");
            
        } else {
            System.out.println("Letra é uma consoante");

        }
        sc.close();
    }
}

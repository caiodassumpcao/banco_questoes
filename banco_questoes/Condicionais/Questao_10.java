package Condicionais;

import java.util.Scanner;

public class Questao_10 {
    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.println("Qual turno você estuda?");
            String turnoCompleto = sc.nextLine().trim();
            char letraTurno = Character.toUpperCase(turnoCompleto.charAt(0));
            
            switch (letraTurno)  {
                case 'M':
                    System.out.println("Bom dia!");
                    break;
                case 'V':
                    System.out.println("Boa tarde!");
                    break;
                case 'N':
                    System.out.println("Boa noite!");
                    break;
                    
                default:
                    System.out.println("Valor invalido");

                    break;
            }


            sc.close();
    }
}

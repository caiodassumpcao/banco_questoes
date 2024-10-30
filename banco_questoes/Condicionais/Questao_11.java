package Condicionais;

import java.util.Scanner;

public class Questao_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o seu salário atual");
        double salarioAtual = sc.nextDouble();

        double percentualAumento = 0;
        double valorAumento = 0;
        double novoSalario = 0;
        
        int faixaSalario;
        
        if (salarioAtual <= 280.00) {
            faixaSalario = 1;

        } else if (salarioAtual <= 700.00) {
            faixaSalario = 2;
            
        } else if (salarioAtual <= 1500.00) {
            faixaSalario = 3;

        }  else {
            faixaSalario = 4;
        }

        switch (faixaSalario) {
            case 1:
                percentualAumento = 20.0;

                break;
        
            case 2:
                percentualAumento = 15.0;
                break;

            case 3:
                percentualAumento = 10.0;
                
                break;
            case 4:
                percentualAumento = 5.0;
                break;
        
            default:
                percentualAumento = 0.0;
                break;
        }

        valorAumento = salarioAtual * (percentualAumento / 100); 
        novoSalario = valorAumento + salarioAtual;

        System.out.printf("Salário antes do reajuste: R$ %.2f\n", salarioAtual);
        System.out.printf("Percentual de aumento aplicado: %.2f%%\n", percentualAumento);
        System.out.printf("Valor do aumento: R$ %.2f\n", valorAumento);
        System.out.printf("Novo salário: R$ %.2f\n", novoSalario);
        
        sc.close();
    }
}

package Condicionais;

import java.util.Scanner;

public class Questao_12 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o seu salário bruto por hora:");
        double salarioHora = sc.nextDouble();
        
        System.out.println("Digite quantidade de horas trabalhadas:");
        double horasTrabalhadas = sc.nextDouble();

        double salarioBruto = salarioHora * horasTrabalhadas;
        double impostoRendaPercentual;
        double inssPercentual = 10.0;
        double fgtsPercentual = 11.0;

        if (salarioBruto <= 900.00) {
            impostoRendaPercentual = 0.0;
        } else if (salarioBruto <= 1500.00) {
            impostoRendaPercentual = 5.0;
        } else if (salarioBruto <= 2500.00) {
            impostoRendaPercentual = 10.0;
        } else {
            impostoRendaPercentual = 15.0;
        }

        double irValor = salarioBruto * (impostoRendaPercentual / 100);
        double inssValor = salarioBruto * (inssPercentual / 100);
        double fgtsValor = salarioBruto * (fgtsPercentual / 100);
        double totalDescontos = irValor + inssValor;
        double salarioLiquido = salarioBruto - totalDescontos;

        System.out.printf("Salário Bruto: R$ %.2f * %.0f = R$ %.2f%n", salarioHora, horasTrabalhadas, salarioBruto);
        System.out.printf("(-) IR (%.0f%%): R$ %.2f%n", impostoRendaPercentual, irValor);
        System.out.printf("(-) INSS (%.0f%%): R$ %.2f%n", inssPercentual, inssValor);
        System.out.printf("(-) FGTS (%.0f%%): R$ %.2f%n", fgtsPercentual, fgtsValor);
        System.out.printf("Total de descontos: R$ %.2f%n", totalDescontos);
        System.out.printf("Salário Líquido: R$ %.2f%n", salarioLiquido);

        sc.close();
    }
}
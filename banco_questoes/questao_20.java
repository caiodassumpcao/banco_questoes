import java.util.Scanner;

public class questao_20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Quanto ganha por hora trabalhada?");
        float ganho_hora = sc.nextFloat();

        System.out.println("Quantas hora trabalhadas no mês?");
        float total_horas = sc.nextFloat();

        float desconto_inss = (float) 0.08;
        float desconto_imposto = (float) 0.11;
        float desconto_sindicato = (float) 0.05;
        
        float salario_bruto = ganho_hora * total_horas;

        float inss = salario_bruto * desconto_inss;
        float imposto = salario_bruto * desconto_imposto;
        float sindicato = salario_bruto * desconto_sindicato;
        float destonto_total = inss + imposto + sindicato;

        float salario_liquido = salario_bruto - destonto_total;
        
        System.out.printf("Salário bruto - R$:%.2f\n", salario_bruto);
        System.out.printf("Pago ao INSS - R$:%.2f\n", inss);
        System.out.printf("Pago de imposto - R$:%.2f\n", imposto);
        System.out.printf("Pago ao sindicato - R$:%.2f\n", sindicato);
        System.out.printf("Total de descontos - R$:%.2f\n", destonto_total);
        System.out.printf("Salário liquido - R$:%.2f\n", salario_liquido);
        
        sc.close();
    }
}

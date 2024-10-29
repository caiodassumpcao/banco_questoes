import java.util.Scanner;

public class Questao_19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quantos kg de peixe foram pescados?");
        int kg = sc.nextInt();
        int limite = 50;
        int excedente = kg - limite;
        int custo_exc = excedente * 4;
        sc.close();

        if (kg > limite) {
            System.out.printf("Excedente em kg: %d\n", excedente);
            System.out.printf("Custo excedente: %d\n", custo_exc);
        } else {
            System.out.println("Não há excedentes");

        }
    }
}

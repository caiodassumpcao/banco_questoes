import java.util.Scanner;

public class Questao_34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um número menor que 1000:");
        int num = sc.nextInt(); 
        
        if (num < 0 || num >= 1000) {
            System.out.println("Número inválido. Digite o número novamente!");
        } else {
            int centenas = num / 100;
            int dezenas = (num % 100) / 10;
            int unidades = num % 10;

            System.out.printf("Centenas = %d, Dezenas = %d, Unidades = %d\n", centenas, dezenas, unidades);

        }
        sc.close();
    }
}

import java.util.Scanner;

public class Questao_26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro numero");
        int A = sc.nextInt();
        System.out.println("Digite o segundo numero");
        int B = sc.nextInt();

        int temp = A;
        A = B;
        B = temp;

        System.out.println("Depois da troca: A = " + A + ", B = " + B);
        sc.close();
    }
}

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número inteiro:");

        int num = sc.nextInt();

        sc.close();

        System.out.printf("O número informado foi %d\n", num);


    }
}

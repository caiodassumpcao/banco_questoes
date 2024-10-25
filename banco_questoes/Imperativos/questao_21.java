import java.util.Scanner;

public class questao_21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual largura (em metros) da parede a ser pintada?");
        float largura = sc.nextFloat();
        System.out.println("Qual altura (em metros) da parede a ser pintada?");
        float altura = sc.nextFloat();

        int custo_lata = 80;
        float area = altura * largura;

        float litro = area / 3;

        float latas_f = litro / 18;
        float latas_int = (float) Math.ceil(latas_f);

        System.out.println("Latas necessárias: " + latas_int);
        float custo_total = custo_lata * latas_int;

        System.out.println("Custo total:" + custo_total);
        sc.close();
    }
}

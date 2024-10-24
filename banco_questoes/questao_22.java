import java.util.Scanner;

public class questao_22 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tamanho da área a ser pintada (em metros quadrados)?");
        float area = sc.nextFloat();

        int custoLata = 80;
        int custoGalao = 25;
        float coberturaPorLitro = 6.0f;
        float litrosPorLata = 18.0f;
        float litrosPorGalao = 3.6f;

        float areaComFolga = area * 1.10f;
        float litrosNecessarios = areaComFolga / coberturaPorLitro;

        float latasApenas = (float) Math.ceil(litrosNecessarios / litrosPorLata);
        float galoesApenas = (float) Math.ceil(litrosNecessarios / litrosPorGalao);

        int latasMisturado = (int) (litrosNecessarios / litrosPorLata);
        float litrosRestantes = litrosNecessarios % litrosPorLata;
        int galoesMisturado = (int) Math.ceil(litrosRestantes / litrosPorGalao);

        float custoTotalLatas = latasApenas * custoLata;
        float custoTotalGaloes = galoesApenas * custoGalao;
        float custoTotalMisturado = (latasMisturado * custoLata) + (galoesMisturado * custoGalao);

        System.out.println("Situação 1: Apenas latas de 18 litros");
        System.out.println("Quantidade de latas: " + latasApenas);
        System.out.println("Custo total: R$ " + custoTotalLatas);

        System.out.println("\nSituação 2: Apenas galões de 3,6 litros");
        System.out.println("Quantidade de galões: " + galoesApenas);
        System.out.println("Custo total: R$ " + custoTotalGaloes);

        System.out.println("\nSituação 3: Mistura de latas e galões");
        System.out.println("Quantidade de latas: " + latasMisturado);
        System.out.println("Quantidade de galões: " + galoesMisturado);
        System.out.println("Custo total: R$ " + custoTotalMisturado);

        sc.close();
    }
}

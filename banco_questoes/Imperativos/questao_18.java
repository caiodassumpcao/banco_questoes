import java.util.Scanner;

public class Questao_18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Qual sua altura em metros?");
        float altura = sc.nextFloat();

        System.out.println("Qual seu gênero? (masculoni ou feminino)");
        String genero = sc.next();
        sc.close();
        String homem = "masculino";
        String mulher = "feminino";
        
        if (genero.equals(homem)) {
            float peso_ideal = (float) (( altura * 72.7 ) - 58);
            System.out.printf("O seu peso ideal em kg: %.3f", peso_ideal);

        } else if (genero.equals(mulher)) {
            float peso_ideal = (float) (( altura * 62.1 ) - 44.7);
            System.out.printf("O seu peso ideal em kg: %.3f", peso_ideal);
        } else {
            System.out.println("Gênero inválido!");
        } 
     }
}

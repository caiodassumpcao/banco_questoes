import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class questao_31 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe sua data de nascimento:");
        System.out.print("Ano: ");
        int ano = sc.nextInt();
        System.out.print("Mês: ");
        int mes = sc.nextInt();
        System.out.print("Dia: ");
        int dia = sc.nextInt();

        LocalDate dataAtual = LocalDate.now();
        LocalDate dataNascimento = LocalDate.of(ano, mes, dia);
        Period periodo = Period.between(dataNascimento, dataAtual);
        int idadeEmDias = periodo.getYears() * 365 + periodo.getMonths() * 30 + periodo.getDays();

        System.out.println("Sua idade expressa em dias é: " + idadeEmDias);
        sc.close();
    }
}

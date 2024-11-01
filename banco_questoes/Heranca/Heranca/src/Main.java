import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Pessoa p = new Pessoa();
        p.setNome("Caio");
        p.setCpf("12345612311");
        
        Cliente c = new Cliente();
        c.setNome("Rodrigues");
        c.setRg("123123441242");
        
        Funcionario f = new Funcionario();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome do funcionario");
        f.setNome(sc.nextLine());
        System.out.println(f.getNome());
        sc.close();
    }

}

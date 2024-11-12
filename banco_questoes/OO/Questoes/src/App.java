import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
    //questão 3
    Aluno aluno1 = new Aluno("123", "Caio", "111.111.111-11", LocalDate.of(1999, 1, 1), "Masculino", "Av. avenida", "Recife", "PE");
    Turma turma = new Turma("POO", 1, 3);


    turma.addAluno(aluno1);

    System.out.println("Aluno: " + aluno1.getNome() + " foi adicionado a turma: " + turma.getCod() + "\n");

    //questão 4
    Funcionario funcionario1 = new Funcionario(1, "Funcionario 1", "111.111.111-11", LocalDate.of(1999, 1, 1), 1, 3500.00, 12345678);
    Dependente dependente1 = new Dependente(100, "Dependente 1", LocalDate.of(2010, 3, 10), 2, true);
    Dependente dependente2 = new Dependente(200, "Dependente 2", LocalDate.of(2010, 3, 10), 1, false);
    
    funcionario1.addDependentes(dependente1);

    funcionario1.addDependentes(dependente2);

    //questão 5
    

    }
}
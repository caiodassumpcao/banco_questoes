import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
    Aluno aluno1 = new Aluno("123", "Caio", "111.111.111-11", LocalDate.of(1999, 1, 1), "Masculino", "Av. avenida", "Recife", "PE");
    Turma turma = new Turma("POO", 1, 3);


    turma.addAluno(aluno1);

    System.out.println("Aluno: " + aluno1.getNome() + " foi adicionado a turma: " + turma.getCod());

    }


}

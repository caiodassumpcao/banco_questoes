import java.util.ArrayList;
import java.util.List;

public class Turma {
    private String cod;
    private int turno;
    private int sala;
    private List<Aluno> alunos;


    public Turma(String cod, int turno, int sala) {
        this.cod = cod;
        this.turno = turno;
        this.sala = sala;
        this.alunos = new ArrayList<>();
    }
    public String getCod() {
        return cod;
    }
    public void setCod(String cod) {
        this.cod = cod;
    }
    public int getTurno() {
        return turno;
    }
    public void setTurno(int turno) {
        this.turno = turno;
    }
    public int getSala() {
        return sala;
    }
    public void setSala(int sala) {
        this.sala = sala;
    }
    public List<Aluno> getAlunos() {
        return alunos;
    }
    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public void addAluno(Aluno aluno) {
        this.alunos.add(aluno);
        aluno.setTurma(this);
    }
}

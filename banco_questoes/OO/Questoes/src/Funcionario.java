import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Funcionario {
    private int matricula;
    private String nomeCompleto;
    private String cpf;
    private LocalDate  dataNascimento;
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private int sexo;
    private double salario;
    private int telefone;
    public List<Dependente> getDependentes() {
        return dependentes;
    }
    public void setDependentes(List<Dependente> dependentes) {
        this.dependentes = dependentes;
    }
    private List<Dependente> dependentes;
    

    public Funcionario(int matricula, String nomeCompleto, String cpf, LocalDate dataNascimento, int sexo, double salario,
            int telefone) {
        this.matricula = matricula;
        this.nomeCompleto = nomeCompleto;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.salario = salario;
        this.telefone = telefone;
        this.dependentes = new ArrayList<>();
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }
    public String getCpf() {
        return cpf;
    }
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }


    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public int getTelefone() {
        return telefone;
    }
    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public void addDependentes(Dependente dependente) {
        this.dependentes.add(dependente);
        System.out.println("Dependente: " + dependente.getNomeCompleto() + " ao funcionario " + this.nomeCompleto + "\n");
    }
}

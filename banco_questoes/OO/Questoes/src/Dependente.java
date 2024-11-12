import java.time.LocalDate;

public class Dependente {
    private int sequencial;
    private String nomeCompleto;
    public LocalDate getDataNascimento() {
        return dataNascimento;
    }
    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    private LocalDate dataNascimento;
    private int sexo;
    private boolean participaPLano;


    
    public Dependente(int sequencial, String nomeCompleto, LocalDate dataNascimento, int sexo, boolean participaPLano) {
        this.sequencial = sequencial;
        this.nomeCompleto = nomeCompleto;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.participaPLano = participaPLano;
    }
    public int getSequencial() {
        return sequencial;
    }
    public void setSequencial(int sequencial) {
        this.sequencial = sequencial;
    }
    public String getNomeCompleto() {
        return nomeCompleto;
    }
    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public int getSexo() {
        return sexo;
    }
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }
    public boolean isParticipaPLano() {
        return participaPLano;
    }
    public void setParticipaPLano(boolean participaPLano) {
        this.participaPLano = participaPLano;
    }
}

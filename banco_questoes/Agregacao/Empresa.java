package banco_questoes.banco_questoes.Agregacao;
import java.util.ArrayList;

public class Empresa {
    private String cnpj;
    private String razaoSocial;
    private String nomeFantasia;
    private ArrayList<NotaFiscal> notas;

    public ArrayList<NotaFiscal> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaFiscal> notas) {
        this.notas = notas;
    }

    public Empresa() {
        this.notas = new ArrayList<>();
    }

    public String getCnpj() {
        return cnpj;
    }
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    public String getRazaoSocial() {
        return razaoSocial;
    }
    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    public String getNomeFantasia() {
        return nomeFantasia;
    }
    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }
}

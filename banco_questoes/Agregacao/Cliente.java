package banco_questoes.banco_questoes.Agregacao;
import java.util.ArrayList;

public class Cliente extends Pessoa{
    
    private ArrayList<NotaFiscal> notas;

    public ArrayList<NotaFiscal> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaFiscal> notas) {
        this.notas = notas;
    }


}
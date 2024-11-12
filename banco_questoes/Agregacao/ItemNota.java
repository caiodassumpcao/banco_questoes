package banco_questoes.banco_questoes.Agregacao;
import java.util.ArrayList;

public class ItemNota {
    private int quantidade;
    private double preco;
    private Produto produto;
    private ArrayList<NotaFiscal> notas;

    public ArrayList<NotaFiscal> getNotas() {
        return notas;
    }

    public void setNotas(ArrayList<NotaFiscal> notas) {
        this.notas = notas;
    }

    public ItemNota() {
        this.produto = new Produto();
        this.notas = new ArrayList<>();
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}

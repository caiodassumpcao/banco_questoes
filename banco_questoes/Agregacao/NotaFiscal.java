package banco_questoes.banco_questoes.Agregacao;
import java.time.LocalDate;
import java.util.ArrayList;

public class NotaFiscal {
    private int numero;
    private LocalDate data;
    private double desconto;
    private Empresa empresa;
    private ArrayList<ItemNota> item;
    private Cliente cliente;
    private Entregador entregador;

    public NotaFiscal() {
        this.cliente = new Cliente();
        this.empresa = new Empresa();
        this.item = new ArrayList<>();
        this.entregador = new Entregador();
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public ArrayList<ItemNota> getItem() {
        return item;
    }

    public void setItem(ArrayList<ItemNota> item) {
        this.item = item;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Entregador getEntregador() {
        return entregador;
    }

    public void setEntregador(Entregador entregador) {
        this.entregador = entregador;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }

}

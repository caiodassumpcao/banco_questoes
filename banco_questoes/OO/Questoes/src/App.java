import java.time.LocalDate;

public class App {
    public static void main(String[] args) throws Exception {
    Produto produto = new Produto(1, "Coca-Cola","Refrigerante de cola", LocalDate.of(2026, 3, 1));

    System.out.println("Validade do produto " + produto.getNome() + " : " + produto.calcularDiasRestantes());
    }
}

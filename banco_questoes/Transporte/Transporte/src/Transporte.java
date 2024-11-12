public class Transporte {
    private int id;
    private int ano;
    private String modelo;
    private double cargaMaxima;
    private double potencia;

    public Transporte(int id, int ano, String modelo, double cargaMaxima, double potencia) {
        this.id = id;
        this.ano = ano;
        this.modelo = modelo;
        this.cargaMaxima = cargaMaxima;
        this.potencia = potencia;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCargaMaxima() {
        return cargaMaxima;
    }

    public void setCargaMaxima(double cargaMaxima) {
        this.cargaMaxima = cargaMaxima;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public double calcularConsumo() {
        return potencia * cargaMaxima * 100;
    }

    public void exibirInformacoes() {
        System.out.println("ID: " + id);
        System.out.println("Ano: " + ano);
        System.out.println("Modelo: " + modelo);
        System.out.println("Carga Máxima: " + cargaMaxima + " kg");
        System.out.println("Potência do Motor: " + potencia + " cv");
        System.out.println("Consumo calculado: " + calcularConsumo());
    }
}

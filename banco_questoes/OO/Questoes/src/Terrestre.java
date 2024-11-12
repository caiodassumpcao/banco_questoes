public class Terrestre extends MeioDeTransporte{

    private int qtdeRoda;
    private double potencia;

    
    public Terrestre(int id, short ano, String modelo, double carga_maxima, int qtdeRoda, double potencia) {
        super(id, ano, modelo, carga_maxima);
        this.qtdeRoda = qtdeRoda;
        this.potencia = potencia;
    }

    @Override
    public double consumo() {
        return (potencia * getCarga_maxima()) * 100;
    }
    public int getQtdeRoda() {
        return qtdeRoda;
    }
    public void setQtdeRoda(int qtdeRoda) {
        this.qtdeRoda = qtdeRoda;
    }
    public double getPotencia() {
        return potencia;
    }
    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }


}

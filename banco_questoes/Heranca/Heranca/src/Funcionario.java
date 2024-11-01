public class Funcionario extends Pessoa {
    private String rg;
    private float salario;
    private int matricula;

    public float calcularSalario(){
        System.out.println("Calculando salario");
        return salario * 0.89f;
    }
    public String getRg() {
        return rg;
    }
    public void setRg(String rg) {
        this.rg = rg;
    }
    public float getSalario() {
        return salario;
    }
    public void setSalario(float salario) {
        this.salario = salario;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
}

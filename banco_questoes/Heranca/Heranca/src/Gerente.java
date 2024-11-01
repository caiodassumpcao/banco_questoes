public class Gerente extends Funcionario{

    public float calcularSalario(){
        System.out.println("Calculando o salário do funcionário");
        return super.calcularSalario();
    }
    public float calcularSalario(float comissao){
        System.out.println("Calculando o salário do gerente");
        return (getSalario() + comissao )* 0.89f;
    }
}

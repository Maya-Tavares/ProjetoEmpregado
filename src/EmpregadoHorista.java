public class EmpregadoHorista extends Empregado{

    int totalHorasTrabalhadas;
    double valorHora;

    public EmpregadoHorista(long matricula, String nome, int totalHorasTrabalhadas, double valorHora){
        super(matricula, nome);
        this.totalHorasTrabalhadas = totalHorasTrabalhadas;
        this.valorHora = valorHora;
    }

    public double calcularSalario() {
//        return super.calcularSalario();
        double salario = totalHorasTrabalhadas * valorHora;
        return salario;
    }

    @Override
    public String getDados() {
        return super.getDados() + " - valor hora: " + valorHora + " - total: R$ " + totalHorasTrabalhadas;
    }
}

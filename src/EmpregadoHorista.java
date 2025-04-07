public class EmpregadoHorista extends Empregado{

    int totalHorasTrabalhadas;
    double valorHora;

    public double calcularSalario(int totalHorasTrabalhadas, double valorHora) {
//        return super.calcularSalario();
        double salario = totalHorasTrabalhadas * valorHora;
        return salario;
    }
}

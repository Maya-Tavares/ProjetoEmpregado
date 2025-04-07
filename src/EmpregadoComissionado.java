public class EmpregadoComissionado extends Empregado{

    double totalVendas;
    double comissao;


    public double calcularSalario(double totalVendas, double comissao) {
//        return super.calcularSalario();
        double salario = (totalVendas * comissao)/100;
        return salario;
    }
}

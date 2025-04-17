public class EmpregadoComissionado extends Empregado{

    double totalVendas;
    double comissao;

    public EmpregadoComissionado(long matricula, String nome, double totalVendas, double comissao){
        super(matricula, nome);
        this.totalVendas = totalVendas;
        this.comissao = comissao;
    }

    public double calcularSalario() {
//        return super.calcularSalario();
        double salario = (totalVendas * comissao)/100;
        return salario;
    }

    @Override
    public String getDados() {
        return super.getDados() + " - comissao: " + comissao + " - total:  R$" + totalVendas;
    }
}

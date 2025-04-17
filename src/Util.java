import static javax.swing.JOptionPane.*;
import static java.lang.Integer.parseInt;
import static java.lang.Long.parseLong;
import static java.lang.Double.parseDouble;

public class Util {
    private  Controle controle = new Controle();

    public void menu(){

        String aux = "1. Cadastrar \n2. Pesquisar \n3. Listar \n4.Sair";
        int option;

        while (true){
            option = parseInt(showInputDialog(aux));

            switch (option){
                case 1:
                    cadastrar();
                    break;
                case 2:
                    pesquisar();
                    break;
                case 3:
                    listar();
                    break;
                case 4:
                    return;
                default: showMessageDialog(null, "Opcao Invalida");
            }
        }
    }

    private void listar() {

        showMessageDialog(null, controle.listar());
    }

    private void pesquisar() {
        Empregado empregado;
        long matricula = parseLong(showInputDialog("Matricula: "));

        controle.pesquisar(matricula);
    }

    private void cadastrar() {

        long matricula;
        String nome;
        double totalVendas;
        double comissao;
        int totalHorasTrabalhadas;
        double valorHora;

        Empregado empregado;

        String aux = "1. Empregado Horista \n2.Empregado Comissionado \n3.Sair";
        int option;

        while(true){
            option = parseInt(showInputDialog(aux));
            if (option == 3){
                break;
            }
            if (option == 1 || option == 2){
                matricula = parseLong(showInputDialog("Matricula: "));
                nome = showInputDialog("Nome: ");

                if (option == 1){
                    totalHorasTrabalhadas = parseInt(showInputDialog("Horas Trabalhadas: "));
                    valorHora = parseDouble(showInputDialog("Valor por hora: "));
                    empregado = new EmpregadoHorista(matricula, nome, totalHorasTrabalhadas, valorHora);
                    controle.inserir(empregado);
                }
                else if (option == 2){
                    comissao = parseDouble(showInputDialog("Valor Comissão: "));
                    totalVendas = parseDouble(showInputDialog("Total de Vendas: "));
                    empregado = new EmpregadoComissionado(matricula, nome, totalVendas, comissao);
                    controle.inserir(empregado);
                }
            }
        }

    }
}

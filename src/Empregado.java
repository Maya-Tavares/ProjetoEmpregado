public abstract class Empregado {

    // o tipo abstract não permite a criação de objetos na classe Empregado.
    // a classe empregado foi criada para ser 'super', e não para criar objetos.

    long matricula;
    String nome;

    public Empregado(long matricula, String nome){
        this.matricula = matricula;
        this.nome = nome;
    }

    public abstract double calcularSalario();

    public String getDados(){
        return matricula + " -- " + nome;
    }

//    { **gambiarra**
//        return 0.0;
//        // retorna qualquer coisa, apenas para a 'super' chamar o método das heranças
//    }

//    private String getNome(){
//    }
//
//    public String getDados(){
//    }

}

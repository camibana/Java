public class Professor extends Pessoa {
    private String especializacao;
    private double salario;

    public Professor(){

    }

    public Professor(String nome, int idade, String especializacao, double salario) {
        super(nome, idade);
        this.especializacao = especializacao;
        this.salario = salario;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }
    public String getEspecializacao() {
        return this.especializacao;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public double getsalario() {
        return this.salario;
    }

}

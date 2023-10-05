public class Aluno extends Pessoa {
    private int matricula;
    private double nota;
    private double nota2;

    public Aluno() {

    }
    public Aluno( String nome, int idade, int matricula, double nota, double nota2) {
        super(nome, idade);
        this.matricula = matricula;
        this.nota = nota;
        this.nota2 = nota2;

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public void setnota(double nota) {
        this.nota = nota;
    }
    public double getNota() {
        return this.nota;
    }
    public void setNota2(double nota2) {
        this.nota2 = nota2;
    }
    public double getNota2() {
        return  this.nota2;
    }
}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Aluno aluno = new Aluno();
        Aluno aluno1 = new Aluno("Camila", 29, 202311179, 9.0, 10.0);
        Professor prof = new Professor();
        Professor prof1 = new Professor("Fernanda", 33, "Develop", 8.000);

        System.out.println("Nome:"+ aluno1.getNome());
        System.out.println("Nome:"+ prof1.getNome());
        System.out.println("Nome:");
        aluno.setNome(sc.nextLine());
        System.out.println("Nome:"+ aluno.getNome());
        System.out.println("A primeira nota do meu aluno:" + aluno1.getNota());
        System.out.println("Insira a segunda nota:");
        aluno.setNota2(sc1.nextDouble());
        System.out.println("Segunda nota:" + aluno.getNota2());



    }


}

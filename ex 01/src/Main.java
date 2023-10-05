import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Aluno al = new Aluno();
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o nome do aluno:");
        al.nome = sc.nextLine();
        System.out.println("Insira a nota 1: ");
        al.nota1 = sc.nextDouble();
        System.out.println("Insira a nota 2: ");
        al.nota2 = sc.nextDouble();
        System.out.println("Insira Nota 3: ");
        al.nota3 = sc.nextDouble();

        al.calcmedia();



    }
}

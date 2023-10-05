import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in); // String
        Scanner sc1 = new Scanner(System.in); // numbers
        Pessoa p1 = new Pessoa();

        System.out.println("Insira o nome completo do usuário:");
        p1.setNome(sc.nextLine());

        System.out.println("Insira o peso do usuário:");
        p1.setPeso(sc.nextDouble());

        System.out.println("Insira a altura do usuário:");
        p1.setAltura(sc1.nextDouble());

        double imc = p1.calcularImc();

        System.out.println("Olá "+ p1.getNome()+ ", seu IMC é:" + imc);

    }


}





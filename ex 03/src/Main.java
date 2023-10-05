import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);

        Leao leao = new Leao("Mamífero", "Patas", "Juba");
        Arara arara = new Arara();

        System.out.println("Informações do Leão: Classe: " + leao.getClasse() + ", \nLocomoção: " + leao.getLocomocao() + ", Pelo: " + leao.getPelo() + ".");

        System.out.println("Informações da Arara.\nInsira a Classe:");
        arara.setClasse(sc.nextLine());
        System.out.println("Insira a Locomoção:");
        arara.setLocomocao(sc.nextLine());
        System.out.println("Insira a Quantidade de ovos:");
        arara.setQuantidadeDeOvo(sc1.nextInt());
        System.out.println("Quantidade de ovos: " + arara.getQuantidadeDeOvo() + ", Locomoção: " + arara.getLocomocao() + ", Classe: " + arara.getClasse() + ".");





    }
}

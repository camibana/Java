public class Aluno {

    String nome;
    double nota1,nota2,nota3,media;

    public void calcmedia() {
        media = (nota1 + nota2 + nota3) / 3;
        System.out.println(media);

        if (media >= 7.0) {
            System.out.println("Sua média foi " + media + ".Parabens, Você está aprovado(a)!");
        } else if (media < 4.0) {
            System.out.println("Sua média foi " + media + ".Sinto muito, Você está reprovado(a)!");
        } else {
            System.out.println("Sua média foi" +
                    "" + media + ".Você está em apuros pois você está na final! Estude e recupere sua média.");
        }
    }
}

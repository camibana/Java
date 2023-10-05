public class Arara extends Animal{
    private int quantidadeDeOvo;

    public Arara(){

    }
    public Arara(String classe, String locomocao, int quantidadeDeOvo) {
        super(classe, locomocao);
        this.quantidadeDeOvo = quantidadeDeOvo;
    }
    public void setQuantidadeDeOvo(int quantidadeDeOvo) {
        this.quantidadeDeOvo = quantidadeDeOvo;
    }
    public int getQuantidadeDeOvo() {
        return this.quantidadeDeOvo;
    }
}

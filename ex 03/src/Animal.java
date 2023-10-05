public class Animal {
    protected String classe;
    protected String locomocao;

    public Animal() {
    }
    public Animal(String classe, String locomocao) {
        super();
        this.classe = classe;
        this.locomocao = locomocao;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }
    public String getClasse() {
        return this.classe;
    }
    public void setLocomocao(String locomocao) {
        this.locomocao = locomocao;
    }
    public String getLocomocao() {
        return this.locomocao;
    }

}

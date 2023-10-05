public class Leao extends Animal{


    private String pelo;

    public Leao(){

    }
    public Leao (String classe, String locomocao, String pelo){
        super(classe, locomocao);
        this.pelo = pelo;
    }
    public String getPelo() {
        return this.pelo;
    }
}

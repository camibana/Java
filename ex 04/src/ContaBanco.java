public class ContaBanco {
    private String nome;
    private double saldoInicial;

    private int dadosBancarios;


    public ContaBanco() {

    }

    public void setDadosBancarios(int dadosBancarios){
        this.dadosBancarios = dadosBancarios;
    }
    public int getDadosBancarios(){
        return dadosBancarios;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getSaldoInicial() {
        return saldoInicial;
    }

    public void setSaldoInicial(double saldoInicial) {
        this.saldoInicial = saldoInicial;
    }

    public void depositar(double valor) {
        saldoInicial += valor;

    }

    public boolean sacar(double valor) {
        if (saldoInicial >= valor) {
            saldoInicial -= valor;
            return true;
        } else {

            System.out.println("Limite de saldo excedido. Tente novamente usando um valor menor.");
            return false;
        }
    }
        public boolean transferir (double valor, ContaBanco contaDestino) {
            if (sacar(valor)){
                contaDestino.depositar(valor);
                return true;
            }else{
                System.out.println("Operação não realizada, favor tentar novamente.");
                return false;
            }

        }


}



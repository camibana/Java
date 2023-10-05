import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in); //para Strings

        ContaBanco conta = new ContaBanco();

        System.out.println("Insira o nome do usuário:");
        conta.setNome(sc1.nextLine());

        while (true) {

            conta.setSaldoInicial(1000);


            System.out.println(" Olá " + conta.getNome() + " você está na sua conta bancaria.\n" +
                    "Insira o número referente ao que deseja realizar.");
            System.out.println("Menu:" +
                    "1- Consultar saldo \n" +
                    "2- Realizar depósito \n" +
                    "3- Realizar saque \n" +
                    "4- Realizar transferência \n" +
                    "5- Sair com segurança");

            int escolha = sc.nextInt();

            switch (escolha){
                case 1:
                    System.out.println("O saldo é: R$ "+ conta.getSaldoInicial());
                    break;
                case 2:
                    System.out.println("Insira o valor que deseja depositar: R$ ");
                    double valorDepositado = sc.nextDouble();
                    conta.depositar(valorDepositado);
                    System.out.println(" O valor de R$" + valorDepositado + " foi depositado com sucesso. Seu novo saldo é R$: " + conta.getSaldoInicial());

                    break;
                case 3:
                    System.out.println(" Insira o valor que deseja sacar: R$ ");
                    double valorSacado = sc.nextDouble();
                    conta.sacar(valorSacado);
                    System.out.println(" O valor de R$" + valorSacado + " foi sacado com sucesso. Seu novo saldo é R$: " + conta.getSaldoInicial() );

                    break;
                case 4:
                    System.out.println("Insira o valor que deseja transferir:");
                    double valorTransferido = sc.nextDouble();
                    System.out.println("Insira o número da conta que irá receber a trânsferência:");
                    int dadosBancarios = sc.nextInt();
                    ContaBanco contaDestino = new ContaBanco();
                    contaDestino.setDadosBancarios(dadosBancarios);

                    conta.transferir(valorTransferido, contaDestino);
                    System.out.println(" O valor de R$ "  + valorTransferido+ " foi transferido com sucesso. Seu novo saldo é R$: " + conta.getSaldoInicial());

                    break;
                case 5:
                    System.out.println("Obrigada por usar nossos serviços. Acesso encerrado com segurança.");
                    System.exit(0);

                default:
                    System.out.println("A opção escolhida é inválida. Favor escolher outra opção.");
                    break;




            }

        }






    }
}

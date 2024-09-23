import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        double saldoInicial = 250;
        double deposito;
        double transferir;
        int opcao = 0;

        // montar o menu
        String m = """
                Qual operação deseja realizar?
                1 - Consultar saldo
                2 - Depositar valor
                3 - Transferir valor
                4 - Sair
                """;

        System.out.println(m);
        Scanner leitor = new Scanner(System.in);
        opcao = leitor.nextInt();


        while (opcao !=4)
            System.out.println(m);
            if (opcao == 1) {
                System.out.println("O seu saldo é de de: R$ " + saldoInicial);
        } else if (opcao == 2) {
                System.out.println("Qual valor deseja depositar: R$ ");
                deposito = leitor.nextDouble();
                saldoInicial += deposito;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
            } else if (opcao == 3) {
                System.out.println("Qual valor deseja transferir: R$ ");
                transferir = leitor.nextDouble();
                saldoInicial -= transferir;
                System.out.println("Saldo atualizado R$ " + saldoInicial);
                if (transferir > saldoInicial) {
                    System.out.println("Você não possui saldo suficiente!");
                }


            }


    }

}

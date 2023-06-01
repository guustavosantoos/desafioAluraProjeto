import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String nome = "Clark Kent";
        String tipoConta = "Conta Corrente";
        double saldo = 1500.99;
        int opcao = 0;

        System.out.println("***************************************");
        System.out.println("Dados Iniciais do cliente: \n");
        System.out.println("\nNome do cliente: " + nome);
        System.out.println("Tipo da conta:   " + tipoConta);
        System.out.println("Saldo atual é:   R$ " + saldo);
        System.out.println("***************************************");

        System.out.println("\nOperações\n");

        String menu = """
                *** Digite sua opção ***\n
                1- Consultar valor
                2- Transferir valor
                3- Receber Valor
                4- Sair
                """;

        Scanner leitura = new Scanner(System.in);

        while (opcao != 4) {
            System.out.println(menu);
            opcao = leitura.nextInt();

            if(opcao == 1){
            System.out.println("O saldo atualizado é " + saldo);
            } else if (opcao == 2){
                System.out.println("Qual o valor que deseja transferir ");
                double valor = leitura.nextDouble();
                if (valor > saldo) {
                    System.out.println("Não há saldo para realizar a transfêrencia");
                } else {
                    saldo = saldo - valor;
                    System.out.println("Novo saldo " + saldo);
                }
            }else if (opcao ==3) {
                System.out.println("Valor Recebido: ");
                double valor = leitura.nextDouble();
                saldo += valor;
                System.out.println("Novo saldo " + saldo);
            } else if (opcao != 4){
                System.out.println("Opção Inválida");
            }
        }



    }


}

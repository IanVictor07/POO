import java.util.*;

public class Financeira {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ContaAPagar conta1 = new ContaAPagar(1, 15, 70.0f);
        ContaAPagar conta2 = new ContaAPagar(2, "Conta de Água", 20, 50.0f);

        int opcao;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1 - Exibir Conta 1");
            System.out.println("2 - Exibir Conta 2");
            System.out.println("3 - Pagar Conta 1");
            System.out.println("4 - Pagar Conta 2");
            System.out.println("5 - Pagar Conta 1 com Desconto");
            System.out.println("6 - Pagar Conta 2 com Desconto");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scan.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("\n--- Detalhes da Conta 1 ---");
                    System.out.println(conta1.exibir());
                    break;

                case 2:
                    System.out.println("\n--- Detalhes da Conta 2 ---");
                    System.out.println(conta2.exibir());
                    break;

                case 3:
                   /* System.out.print("\nInforme o dia do pagamento para a Conta 1: ");
                    int diaPagamento1 = scan.nextInt();
                    System.out.println(conta1.pagar(diaPagamento1));*/
                    System.out.println(conta1.pagar(15));
                    break;

                case 4:
                   /* System.out.print("\nInforme o dia do pagamento para a Conta 2: ");
                    int diaPagamento2 = scan.nextInt();
                    System.out.println(conta2.pagar(diaPagamento1))*/
                    System.out.println(conta2.pagar(15));
                    break;

                case 5:
                    /*System.out.print("\nInforme o dia do pagamento para a Conta 1: ");
                    int diaPagamentoDesconto1 = scan.nextInt();
                    System.out.print("Informe o valor do desconto: ");
                    float desconto1 = scan.nextFloat();
                    System.out.println(conta1.pagar(diaPagamentoDesconto1, desconto1));*/
                    System.out.println(conta1.pagar(15, 20.0f));
                    break;

                case 6:
                    /*System.out.print("\nInforme o dia do pagamento para a Conta 2: ");
                    int diaPagamentoDesconto2 = scan.nextInt();
                    System.out.print("Informe o valor do desconto: ");
                    float desconto2 = scan.nextFloat();
                    System.out.println(conta2.pagar(diaPagamentoDesconto2, desconto2));*/
                    System.out.println(conta2.pagar(15, 20.f));

                    break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scan.close();
    }
}

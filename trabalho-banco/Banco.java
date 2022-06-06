import java.util.Scanner;

public class Banco {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String nomeCliente;
    int contaCorrente, contaPoupanca;
    float saldoCorrente, saldoPoupanca;
    int opcaoEscolhida = -1;

    System.out.printf("Entre com o nome do cliente: ");
    nomeCliente = input.nextLine();

    System.out.printf("Entre com o número da Conta Corrente: ");
    contaCorrente = input.nextInt();

    System.out.printf("Entre com o saldo inicial da Conta Corrente (%d): ", contaCorrente);
    saldoCorrente = input.nextFloat();

    System.out.printf("Entre com o número da Conta Poupança: ");
    contaPoupanca = input.nextInt();

    System.out.printf("Entre com seu saldo inicial da Conta Poupança (%d): ", contaPoupanca);
    saldoPoupanca = input.nextFloat();

    while (true) {
      System.out.println("-------------------------------");
      System.out.println("Qual operação deseja realizar: ");
      System.out.println("1 - Creditar");
      System.out.println("2 - Debitar");
      System.out.println("3 - Transferir");
      System.out.println("4 - Ver Saldo");
      System.out.println("5 - Sair");
      System.out.printf("Opção escolhida: ");

      opcaoEscolhida = input.nextInt();

      if (opcaoEscolhida == 5) {
        break;
      }

      switch (opcaoEscolhida) {
        case 1: {
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupança");
          System.out.printf("Opção escolhida: ");
          int contaParaCreditar = input.nextInt();

          if (contaParaCreditar != 1 && contaParaCreditar != 2) {
            System.out.println("Opção inválida");
            break;
          }

          System.out.printf("Qual valor a creditar na conta escolhida: ");

          float valorCreditar = input.nextFloat();

          if (valorCreditar < 0) {
            System.out.println("Valor a creditar deve ser maior que zero");
            break;
          }

          if (contaParaCreditar == 1) {
            saldoCorrente += valorCreditar;
            System.out.printf("Saldo atual na Conta Corrente %d: %7.2f\n", contaCorrente, saldoCorrente);
            break;
          }

          if (contaParaCreditar == 2) {
            saldoPoupanca += valorCreditar;
            System.out.printf("Saldo atual na Conta Poupança %d: %7.2f\n", contaPoupanca, saldoPoupanca);
            break;
          }
          break;
        }
        case 2: {
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupança");
          System.out.printf("Opção escolhida: ");
          int contaParaDebitar = input.nextInt();

          System.out.printf("Qual valor a debitar na conta escolhida: ");

          float valorDebitar = input.nextFloat();

          if (contaParaDebitar == 1) {
            saldoCorrente -= valorDebitar;

            System.out.printf("Saldo atual na Conta Corrente %d: %7.2f\n", contaCorrente, saldoCorrente);
            break;
          }

          if (contaParaDebitar == 2) {
            if (valorDebitar > saldoPoupanca) {
              System.out.printf("Valor a debitar não pode ser maior que seu saldo: %7.2f\n", saldoPoupanca);
              break;
            }
            saldoPoupanca -= valorDebitar;

            System.out.printf("Saldo atual na Conta Poupança %d: %7.2f\n", contaPoupanca, saldoPoupanca);

            break;
          }

          break;
        }
        case 3: {
          System.out.println("Opção 3");
          break;
        }
        case 4: {
          System.out.println("Opção 4");
          break;
        }
        default: {
          System.out.println("Opção inválida");
        }
      }
    }

    input.close();
    System.out.println("Obrigado por trabalhar com o nosso banco!!!");
  }
}

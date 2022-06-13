
/**
 * Integrantes do grupo:
 * Davi Samuel de Oliveira Sousa
 * Gustavo Figueiredo Teixeira
 * Henrique Ramos da Silva Batista
 * Marcus Israel Campos Braga Assunção
 * Samuel Caldeira Cota
 * Thiago Augusto da Silva
 */

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

    System.out.printf("Entre com o n�mero da Conta Corrente: ");
    contaCorrente = input.nextInt();

    System.out.printf("Entre com o saldo inicial da Conta Corrente (%d): ", contaCorrente);
    saldoCorrente = input.nextFloat();

    System.out.printf("Entre com o n�mero da Conta Poupan�a: ");
    contaPoupanca = input.nextInt();

    System.out.printf("Entre com seu saldo inicial da Conta Poupan�a (%d): ", contaPoupanca);
    saldoPoupanca = input.nextFloat();

    while (true) {
      System.out.println("-------------------------------");
      System.out.println("Qual opera��o deseja realizar: ");
      System.out.println("1 - Creditar");
      System.out.println("2 - Debitar");
      System.out.println("3 - Transferir");
      System.out.println("4 - Ver Saldo");
      System.out.println("5 - Sair");
      System.out.printf("Op��o escolhida: ");

      opcaoEscolhida = input.nextInt();

      if (opcaoEscolhida == 5) {
        break;
      }

      switch (opcaoEscolhida) {
        case 1: {
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupan�a");
          System.out.printf("Op��o escolhida: ");
          int contaParaCreditar = input.nextInt();

          if (contaParaCreditar != 1 && contaParaCreditar != 2) {
            System.out.println("Op��o inv�lida");
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
            System.out.printf("Saldo atual na Conta Poupan�a %d: %7.2f\n", contaPoupanca, saldoPoupanca);
            break;
          }
          break;
        }
        case 2: {
          System.out.println("Qual conta: ");
          System.out.println("1 - Corrente");
          System.out.println("2 - Poupan�a");
          System.out.printf("Op��o escolhida: ");
          int contaParaDebitar = input.nextInt();

          if (contaParaDebitar != 1 && contaParaDebitar != 2) {
            System.out.println("Op��o inv�lida");
            break;
          }

          System.out.printf("Qual valor a debitar na conta escolhida: ");

          float valorDebitar = input.nextFloat();

          if (contaParaDebitar == 1) {
            saldoCorrente -= valorDebitar;

            System.out.printf("Saldo atual na Conta Corrente %d: %7.2f\n", contaCorrente, saldoCorrente);
            break;
          }

          if (contaParaDebitar == 2) {
            if (valorDebitar > saldoPoupanca) {
              System.out.printf("Valor a debitar n�o pode ser maior que seu saldo: %7.2f\n", saldoPoupanca);
              break;
            }
            saldoPoupanca -= valorDebitar;

            System.out.printf("Saldo atual na Conta Poupan�a %d: %7.2f\n", contaPoupanca, saldoPoupanca);

            break;
          }

          break;
        }
        case 3: {
          System.out.println("Entre: ");
          System.out.println("1 - Conta corrente e poupan�a");
          System.out.println("2 - Conta poupan�a e corrente");
          System.out.printf("Op��o escolhida: ");
          int opcaoParaTransferir = input.nextInt();

          if (opcaoParaTransferir != 1 && opcaoParaTransferir != 2) {
            System.out.println("Op��o inv�lida");
            break;
          }

          if (opcaoParaTransferir == 1) {
            System.out.printf("Qual valor a transferir da CC %s para CP %s: ", contaCorrente, contaPoupanca);
            float valorParaTransferir = input.nextFloat();
            saldoPoupanca += valorParaTransferir;
            saldoCorrente -= valorParaTransferir;
          } else if (opcaoParaTransferir == 2) {
            System.out.printf("Qual valor a transferir da CP %s para CC %s: ", contaPoupanca, contaCorrente);
            float valorParaTransferir = input.nextFloat();

            if (saldoPoupanca < valorParaTransferir) {
              System.out.printf("Valor a debitar n�o pode ser maior que seu saldo: %7.2f\n", saldoPoupanca);
              break;
            }

            saldoPoupanca -= valorParaTransferir;
            saldoCorrente += valorParaTransferir;
          }

          System.out.printf("Saldo atual na Conta Corrente %s ->  %7.2f\n", contaCorrente, saldoCorrente);
          System.out.printf("Saldo atual na Conta Poupan�a %s ->  %7.2f\n", contaPoupanca, saldoPoupanca);

          break;
        }
        case 4: {
          System.out.printf("Senhor %s\n", nomeCliente);
          System.out.printf("Saldo da sua Conta Corrente %s ->  %7.2f\n", contaCorrente, saldoCorrente);
          System.out.printf("Saldo da sua Conta Poupan�a %s ->  %7.2f\n", contaPoupanca, saldoPoupanca);
          break;
        }
        default: {
          System.out.println("Op��o inv�lida");
        }
      }
    }

    input.close();
    System.out.println("Obrigado por trabalhar com o nosso banco!!!");
  }
}

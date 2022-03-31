import java.util.Scanner;

public class Exercicio16 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite um número: ");

    int numero = scanner.nextInt();

    scanner.close();

    boolean divisivel = numero != 0 && numero % 5 == 0;

    if (divisivel) {
        System.out.println("O número (" + numero + ") é divisível por 5");
        return;
    }

    System.out.println("O número (" + numero + ") não é divisível por 5");
  }
}

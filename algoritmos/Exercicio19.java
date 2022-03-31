import java.util.Scanner;

public class Exercicio19 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite sua idade: ");
    
    int idade = scanner.nextInt();

    scanner.close();

    if (idade < 16) {
      System.out.println("Não é eleitor");
    } else if ((idade >= 16 && idade < 18) || idade > 65) {
      System.out.println("Eleitor facultativo");
    } else {
      System.out.println("Eleitor obrigatório");
    }
  }
}

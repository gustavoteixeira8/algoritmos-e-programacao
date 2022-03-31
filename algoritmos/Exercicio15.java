import java.util.Scanner;

public class Exercicio15 {
  public static void main(String[] args) {
    String primeiroTimeNome, segundoTimeNome;
    int primeiroTimeGols, segundoTimeGols;
    
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite um NOME para o PRIMEIRO e para o SEGUNDO time: ");

    primeiroTimeNome = scanner.nextLine();
    segundoTimeNome = scanner.nextLine();

    
    System.out.println("Digite o número de GOLS para o PRIMEIRO e para o SEGUNDO time: ");
    
    primeiroTimeGols = scanner.nextInt();
    segundoTimeGols = scanner.nextInt();
    
    scanner.close();

    if (primeiroTimeGols == segundoTimeGols) {
      System.out.println("EMPATE");
    } else if (primeiroTimeGols > segundoTimeGols) {
      System.out.println(primeiroTimeNome + " ganhou!!!");
    } else {
      System.out.println(segundoTimeNome + " ganhou!!!");
    }
  }
}

import java.util.Scanner;

public class Exercicio17 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite uma idade: ");
    
    int idade = scanner.nextInt();

    scanner.close();

    if (idade >= 5 && idade <= 12) {
        System.out.println("Infantil");
    } else if (idade >= 13 && idade <= 17) {
        System.out.println("Juvenil");
    } else if (idade >= 18 && idade <= 25) {
        System.out.println("Profissional");
    } else {
        System.out.println("Fora da faixa etária");
    }
  }
}

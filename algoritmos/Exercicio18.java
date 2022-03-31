import java.util.Scanner;

public class Exercicio18 {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
  
    System.out.println("Digite o salário: ");
    
    double salario = scanner.nextDouble();

    scanner.close();

    if (salario < 500) {
      salario += salario * 0.15;
    } else if (salario >= 500 && salario < 1000) {
      salario += salario * 0.10;
    } else {
      salario += salario * 0.05;
    }

    System.out.println("O novo salário é: " + salario);
  }
}

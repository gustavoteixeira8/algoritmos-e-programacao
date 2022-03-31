import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Escreva um número: ");
		double num = input.nextDouble();

		input.close();

		double result = Math.pow(num, 2);

		System.out.printf("Resultado: %7.2f", result);
	}
}
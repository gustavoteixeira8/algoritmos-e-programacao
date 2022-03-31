import java.util.Scanner;

public class Exercicio3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.print("Escreva um número: ");
		double num = input.nextDouble();

		input.close();

		double resultPow = Math.pow(num, 2);
		double resultSqrt = Math.sqrt(num);

		System.out.printf("Resultado quadrado: %7.2f", resultPow);
		System.out.println();
		System.out.printf("Resultado raiz: %7.2f", resultSqrt);
	}
}
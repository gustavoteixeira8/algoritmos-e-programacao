import java.util.Scanner;

public class Exercicio5 {
    public static void main(String[] args) {
		int valorA, valorB;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite um n�mero: ");

		valorA = input.nextInt();

		System.out.print("Digite um n�mero: ");

		valorB = input.nextInt();

		input.close();

		int result = valorA + valorB;

		if (result < 50) {
			return;
		}

		System.out.print("Resultado: " + result);
    }
}
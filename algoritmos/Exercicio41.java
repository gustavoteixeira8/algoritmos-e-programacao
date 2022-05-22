import java.util.Scanner;

public class Exercicio41 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int somaPares = 0;
		int somaImpares = 0;

		System.out.println("Digite 5 números: ");

		for (int i = 0; i < 5; i++) {
			int num = input.nextInt();

			if (num == 0) {
				i--;
				continue;
			}

			if (num % 2 == 0) {
				somaPares += num;
			} else {
				somaImpares += num;
			}
		}
		input.close();

		int mediaPares = somaPares / 5;
		int mediaImpares = somaImpares / 5;

		System.out.println("Media dos pares: " + mediaPares);
		System.out.println("Media dos impares: " + mediaImpares);
	}
}
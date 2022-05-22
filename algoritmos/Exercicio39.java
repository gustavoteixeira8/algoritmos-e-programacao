import java.util.Scanner;

public class Exercicio39 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int quantidadePares = 0;
		int quantidadeImpares = 0;
		int somaPares = 0;
		int somaImpares = 0;

		for (int i = 0; i < 10; i++) {
			System.out.println("Digite um número: ");
			int num = input.nextInt();

			if (num == 0) {
				i--;
				continue;
			}

			if (num % 2 == 0) {
				quantidadePares++;
				somaPares += num;
			} else {
				quantidadeImpares++;
				somaImpares += num;
			}
		}

		System.out.println("Quantidade pares: " + quantidadePares);
		System.out.println("Soma pares: " + somaPares);


		System.out.println("Quantidade impares: " + quantidadeImpares);
		System.out.println("Soma pares: " + somaImpares);
	}
}
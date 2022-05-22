import java.util.Scanner;

public class Exercicio48 {
    public static void main(String[] args) {
		int somaPares = 0;
		int somaImpares = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Digite um número diferente de -1: ");

			int num = input.nextInt();

			if (num == -1) {
				break;
			}

			if (num % 2 == 0) {
				somaPares += num;
			} else {
				somaImpares += num;
			}
		}

		System.out.println("Soma dos pares: " + somaPares);
		System.out.println("Soma dos impares: " + somaImpares);
    }
}
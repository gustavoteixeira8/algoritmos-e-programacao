import java.util.Scanner;

public class Exercicio36 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int i = 0;
		int menorQue21 = 0;
		int maiorQue50 = 0;

		while (i < 10) {
			i++;
			System.out.println("Digite a idade: ");
			int idade = input.nextInt();

			if (idade < 21) {
				menorQue21++;
				continue;
			}

			maiorQue50++;
		}

		input.close();

		System.out.println("Menor que 21: " + menorQue21);
		System.out.println("Maior que 50: " + maiorQue50);
	}
}
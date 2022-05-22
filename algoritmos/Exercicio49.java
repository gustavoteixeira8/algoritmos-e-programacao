import java.util.Scanner;

public class Exercicio49 {
    public static void main(String[] args) {
		int somaPositivos = 0;
		int quantidadeNegativos = 0;
		Scanner input = new Scanner(System.in);

		while (true) {
			System.out.println("Digite um número diferente de 0: ");

			int num = input.nextInt();

			if (num == 0) {
				break;
			}

			if (num > 0) {
				somaPositivos += num;
			} else {
				quantidadeNegativos++;
			}
		}

		System.out.println("Soma dos positivos: " + somaPositivos);
		System.out.println("Quantidade dos negativos: " + quantidadeNegativos);
    }
}
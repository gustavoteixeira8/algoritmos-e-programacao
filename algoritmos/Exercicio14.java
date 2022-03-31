import java.util.Scanner;

public class Exercicio14 {
    public static void main(String[] args) {
        int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");

		numero = scanner.nextInt();

		scanner.close();

        int numeroPar = numero % 2;

        if (numero == 0) {
			System.out.println("Número nulo");
		} else if (numeroPar == 0) {
			System.out.println("Número par");
		} else {
            System.out.println("Número impar");
        }

    }
}

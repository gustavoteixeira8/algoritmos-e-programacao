import java.util.Scanner;

public class Exercicio13 {
    public static void main(String[] args) {
        int numero;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite um número: ");

		numero = scanner.nextInt();

		scanner.close();

		if (numero == 0) {
			System.out.println("Número nulo");
		} else if (numero > 0) {
            System.out.println("Número positivo");
        } else {
            System.out.println("Número negativo");
        }

    }
}

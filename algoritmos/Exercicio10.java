import java.util.Scanner;

public class Exercicio10 {
	public static void main(String[] args) {
		float distanciaTotal, volumeCombustivelParaDistanciaTotal;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a distância total e o volume de combustível consumido: ");

		distanciaTotal = scanner.nextFloat();
		volumeCombustivelParaDistanciaTotal = scanner.nextFloat();

		scanner.close();

		float consumoMedio = distanciaTotal / volumeCombustivelParaDistanciaTotal;

		System.out.printf("O consumo médio é: %7.2f", consumoMedio);
	}
}
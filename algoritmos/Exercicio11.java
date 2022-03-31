import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
		float custoFabrica;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a distância total e o volume de combustível consumido: ");

		custoFabrica = scanner.nextFloat();

		scanner.close();

		float imposto = 0.52f;
		float porcentagemDoPrecoTotal = custoFabrica * imposto;

		float precoFinal = porcentagemDoPrecoTotal + custoFabrica;

		System.out.printf("O preço final do veículo é: %7.2f \n", precoFinal);
    }
}
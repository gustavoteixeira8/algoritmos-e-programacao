import java.util.Scanner;

public class Exercicio11 {
    public static void main(String[] args) {
		float custoFabrica;

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite a dist�ncia total e o volume de combust�vel consumido: ");

		custoFabrica = scanner.nextFloat();

		scanner.close();

		float imposto = 0.52f;
		float porcentagemDoPrecoTotal = custoFabrica * imposto;

		float precoFinal = porcentagemDoPrecoTotal + custoFabrica;

		System.out.printf("O pre�o final do ve�culo �: %7.2f \n", precoFinal);
    }
}
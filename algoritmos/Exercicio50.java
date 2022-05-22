import java.util.Scanner;

public class Exercicio50 {
	public static void main(String[] args) {
		int precoUnitario = 0;
		int quantidadeProduto = 0;
		int precoFinal = 0;
		String eFim = "";
		Scanner input = new Scanner(System.in);
		Scanner anotherInput = new Scanner(System.in);

		while (true) {
			System.out.println("Digite FIM para finalizar o processo ou aperte ENTER para continuar.");
			eFim = input.nextLine();

			if ("FIM".equals(eFim)) {
				break;
			}

			System.out.println("Digite preço unitário e a quantidade de produtos: ");

			precoUnitario = anotherInput.nextInt();
			quantidadeProduto = anotherInput.nextInt();

			precoFinal += precoUnitario * quantidadeProduto;
		}

		anotherInput.close();
		input.close();

		System.out.println("O preço final é: " + precoFinal);
	}
}
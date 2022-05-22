import java.util.Scanner;

public class Exercicio50 {
    public static void main(String[] args) {
		int precoUnitario = 0;
		int quantidadeProduto = 0;
		int precoFinal = 0;
		Scanner input = new Scanner(System.in);

		System.out.println("Digite FIM para finalizar o processo ou aperte ENTER para continuar.");

		while (true) {
			String eFim = input.nextLine();

			if ("FIM".equals(eFim)) {
				break;
			}

			System.out.println("Digite preço unitário e a quantidade de produtos: ");

			precoUnitario = input.nextInt();
			quantidadeProduto = input.nextInt();

			precoFinal += precoUnitario * quantidadeProduto;
		}

		System.out.println("O preço final é: " + precoFinal);
    }
}
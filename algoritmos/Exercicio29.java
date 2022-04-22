import java.util.Scanner;

public class Exercicio29 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número do mês: ");

		int numeroMes = input.nextInt();

		input.close();

		switch (numeroMes) {
			case 1: {
				System.out.println("31 dias");
				break;
			}
			case 2: {
				System.out.println("29 dias");
				break;
			}
			case 3: {
				System.out.println("31 dias");
				break;
			}
			case 4: {
				System.out.println("30 dias");
				break;
			}
			case 5: {
				System.out.println("31 dias");
				break;
			}
			case 6: {
				System.out.println("30 dias");
				break;
			}
			case 7: {
				System.out.println("31 dias");
				break;
			}
			case 8: {
				System.out.println("31 dias");
				break;
			}
			case 9: {
				System.out.println("30 dias");
				break;
			}
			case 10: {
				System.out.println("30 dias");
				break;
			}
			case 11: {
				System.out.println("30 dias");
				break;
			}
			case 12: {
				System.out.println("31 dias");
				break;
			}
			default: {
				System.out.println("Mês inválido");
			}
		}
	}
}
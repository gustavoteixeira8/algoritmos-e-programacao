import java.util.Scanner;

public class Exercicio30 {

    public static void main(String args[]) {
  		Scanner input = new Scanner(System.in);

		System.out.println("Digite o número da função: ");

		int numeroFuncao = input.nextInt();

		switch (numeroFuncao) {
			case 1: {
				System.out.println("Gerente: + 30%");
				break;
			}
			case 2: {
				System.out.println("Vendedor: + 40%");
				break;
			}
			case 3: {
				System.out.println("Programador: + 50%");
				break;
			}
			case 4: {
				System.out.println("Motorista: + 60%");
				break;
			}
			case 5: {
				System.out.println("Vereador: + 0%");
				break;
			}
			case 6: {
				System.out.println("Deputado: + 0%");
				break;
			}
			default: {
				System.out.println("Número não corresponde a nenhuma função");
			}
		}
    }
}
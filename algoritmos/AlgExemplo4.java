import java.util.Scanner;

public class AlgExemplo4
{
	public static void main(String[] args)
	{
		int valA, valB, valSoma;

		Scanner dados = new Scanner(System.in);

		System.out.println("Entre com dois números para serem somados");
		valA = dados.nextInt();      // entrada
		valB = dados.nextInt();
		dados.close();

		valSoma = valA + valB;         // processamento
		System.out.println("O valor adição é: " +  valSoma);
	}
}
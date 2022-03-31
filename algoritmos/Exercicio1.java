import java.util.Scanner;

public class Exercicio1 {
	public static void main(String args[]) {
		String nome;
		int idade;
		float peso;

		Scanner input = new Scanner(System.in);

		System.out.print("Escreva seu nome: ");
		nome = input.nextLine();

		System.out.print("Escreva sua idade: ");
		idade = input.nextInt();

		System.out.print("Escreva seu peso: ");
		peso = input.nextFloat();

		input.close();

		System.out.println("Nome: " + nome + " | " + "Idade: " + idade);
		System.out.printf("Peso: %7.2f", peso);
	}
}
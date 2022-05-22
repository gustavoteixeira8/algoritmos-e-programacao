import java.util.Scanner;

public class Exercicio42 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		int notaMaiorQue70 = 0;
		int idadeMaiorQue20 = 0;
		int notaFinal = 0;
		int numeroDeAlunos = 0;

		for (int i = 0; i < 30; i++) {
			System.out.println("Digite a nota e a idade do aluno: ");

			int nota = input.nextInt();
			int idade = input.nextInt();

			if (nota > 70) {
				notaMaiorQue70++;
			}

			if (idade > 20) {
				idadeMaiorQue20++;
			}

			numeroDeAlunos++;
			notaFinal += nota;

		}
		input.close();

		int mediaFinal = notaFinal / numeroDeAlunos;

		System.out.println("Nota maior que 70: " + notaMaiorQue70);
		System.out.println("Idade maior que 20: " + idadeMaiorQue20);
		System.out.println("Media final: " + mediaFinal);
	}
}
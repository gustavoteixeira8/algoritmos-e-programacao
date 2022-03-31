import java.util.Scanner;

public class Exercicio8 {

    public static void main(String[] args) {
    	float nota1, nota2, nota3;

		System.out.println("Digite três notas: ");

		Scanner scanner = new Scanner(System.in);

		nota1 = scanner.nextFloat();
		nota2 = scanner.nextFloat();
		nota3 = scanner.nextFloat();

		scanner.close();

    	float media = (nota1 + nota2 + nota3) / 3;

		System.out.printf("Media das notas: %7.2f", media);
    }
}
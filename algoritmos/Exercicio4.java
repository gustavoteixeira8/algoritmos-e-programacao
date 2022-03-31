import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {
    	float nota1, nota2, nota3;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite três notas: ");
		nota1 = input.nextFloat();
    	nota2 = input.nextFloat();
    	nota3 = input.nextFloat();

		input.close();

    	float result = (nota1 + nota2 + nota3) / 3;

    	System.out.printf("A media das notas é: %7.2f", result);
    }
}
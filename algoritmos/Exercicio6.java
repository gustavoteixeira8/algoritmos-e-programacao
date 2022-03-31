import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
    	float nota1, nota2, nota3;

		Scanner input = new Scanner(System.in);

		System.out.print("Digite três notas: ");
		nota1 = input.nextFloat();
    	nota2 = input.nextFloat();
    	nota3 = input.nextFloat();

		input.close();

    	float result = (int) nota1 + nota2 + nota3;

    	if (result >= 60) {
			System.out.println("Aprovado: " + result + " pontos");
    	} else System.out.println("Reprovado: " + result + " pontos");
    }
}
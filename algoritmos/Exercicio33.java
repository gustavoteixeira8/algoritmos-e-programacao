import java.util.Scanner;

public class Exercicio33 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	double num1, num2, num3, num4, num5;

		System.out.println("Digite 5 números reais: ");

    	num1 = input.nextDouble();
    	num2 = input.nextDouble();
    	num3 = input.nextDouble();
    	num4 = input.nextDouble();
    	num5 = input.nextDouble();

		double soma = num1 + num2 + num3 + num4 + num5;
		double media = soma / 5;
		double dobro = soma * 2;

		System.out.println("Soma: " + soma);
		System.out.println("Média: " + media);
		System.out.println("Dobro: " + dobro);
    }
}
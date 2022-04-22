import java.util.Scanner;

public class Exercicio35 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	int i = 0;
    	int soma = 0;

    	while (i < 10) {
    		System.out.println("Digite um número inteiro: ");
    		int num = input.nextInt();
    		if (num < 40) {
				soma += num;
			}
			i++;
    	}

		System.out.println("Soma dos números: " + soma);
    }
}
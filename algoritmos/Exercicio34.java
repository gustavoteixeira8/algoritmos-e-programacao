import java.util.Scanner;

public class Exercicio34 {

    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	int i = 0;
    	int somaPositivos = 0;
    	int somaNegativos = 0;

    	while (i < 10) {
    		System.out.println("Digite um número inteiro: ");
    		int num = input.nextInt();
    		if (num > 0) {
				somaPositivos += num;
			} else {
				somaNegativos += num;
			}
			i++;
    	}

		System.out.println("Soma dos positivos: " + somaPositivos);
		System.out.println("Soma dos negativos: " + somaNegativos);
    }
}
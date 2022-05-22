import java.util.Scanner;

public class Exercicio40 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	int somaPositivos = 0;
    	int somaNegativos = 0;

		System.out.println("Digite 5 números: ");

    	for (int i = 0; i < 5; i++) {
    		int num = input.nextInt();

			if (num == 0) {
				i--;
				continue;
			}

    		if (num > 0) {
    			somaPositivos += num;
    		} else {
    			somaNegativos += num;
    		}
    	}

    	int mediaPositivos = somaPositivos / 5;
    	int mediaNegativos = somaNegativos / 5;

    	System.out.println("Media dos positivos: " + mediaPositivos);
    	System.out.println("Media dos negativos: " + mediaNegativos);
    }
}
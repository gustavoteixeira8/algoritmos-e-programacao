import java.util.Scanner;

public class Exercicio37 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int ePar = 0;
        int eImpar = 0;

        while (i < 10) {
            i++;
            System.out.println("Digite um número inteiro: ");
            int num = input.nextInt();

            if (num == 0) {
                i--;
                continue;
            }

            if (num % 2 == 0) {
                ePar++;
            } else {
                eImpar++;
            }
        }

        input.close();

        System.out.println("Pares: " + ePar);
        System.out.println("Impares: " + eImpar);
    }
}

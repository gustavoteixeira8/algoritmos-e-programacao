import java.util.Scanner;

public class Exercicio38 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int i = 0;
        int numPositivos = 0;
        int numNegativos = 0;
        int somaPositivos = 0;
        int somaNegativos = 0;

        while (i < 15) {
            i++;

            System.out.println("Digite um número inteiro: ");

            int num = input.nextInt();

            if (num == 0) {
                i--;
                continue;
            }

            if (num > 0) {
                numPositivos++;
                somaPositivos += num;
            } else {
                numNegativos++;
                somaNegativos += num;
            }
        }

        input.close();

        System.out.println("Total de números positivos: " + numPositivos);
        System.out.println("Soma dos números positivos: " + somaPositivos);

        System.out.println("--------");

        System.out.println("Total de números negativos: " + numNegativos);
        System.out.println("Soma dos números negativos: " + somaNegativos);

    }
}

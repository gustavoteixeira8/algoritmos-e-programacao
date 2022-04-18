import java.util.Scanner;

public class Exercicio24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite dois valores inteiros: ");

        int valorUm = input.nextInt();
        int valorDois = input.nextInt();

        input.close();

        int soma = valorUm + valorDois;

        if (soma < 10)
            return;

        System.out.println("O resultado da soma é: " + soma);
    }
}

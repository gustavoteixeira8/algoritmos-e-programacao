import java.util.Scanner;

public class Exercicio25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = input.nextInt();

        input.close();

        if (idade < 18) {
            System.out.println("Menor de idade");
            return;
        }

        if (idade >= 18) {
            System.out.println("Maior de idade");
            return;
        }

        System.out.println("Idoso");
    }
}
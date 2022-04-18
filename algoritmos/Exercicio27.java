import java.util.Scanner;

public class Exercicio27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite sua idade: ");

        int idade = input.nextInt();

        input.close();

        if (idade <= 12) {
            System.out.println("Pediatra");
            return;
        }

        if (idade > 12 && idade <= 59) {
            System.out.println("Clínica Geral");
            return;
        }

        System.out.println("Geriatria");
    }
}
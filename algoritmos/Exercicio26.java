import java.util.Scanner;

public class Exercicio26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o nome do produto e o valor da compra: ");

        String nome = input.nextLine();
        float valorCompra = input.nextFloat();

        input.close();

        float valorVenda = valorCompra;

        if (valorCompra < 100) {
            valorVenda += valorCompra * 0.7;
        } else if (valorCompra >= 100 && valorCompra <= 200) {
            valorVenda += valorCompra * 0.5;
        } else {
            valorVenda += valorCompra * 0.3;
        }

        System.out.println("Nome: " + nome);
        System.out.println("Valor da compra: " + valorCompra);
        System.out.println("Valor da venda: " + valorVenda);
    }
}

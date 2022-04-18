import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite três valores para os lados do triângulo: ");

        float ladoUm = input.nextFloat();
        float ladoDois = input.nextFloat();
        float ladoTres = input.nextFloat();

        input.close();

        boolean verificaLadoUm = ladoUm > (ladoDois + ladoTres);
        boolean verificaLadoDois = ladoDois > (ladoUm + ladoTres);
        boolean verificaLadoTres = ladoTres > (ladoUm + ladoDois);

        if (verificaLadoUm && verificaLadoDois && verificaLadoTres) {
            System.out.println("Os lados enviados são inválidos");
            return;
        }

        if (ladoUm == ladoDois && ladoUm == ladoTres) {
            System.out.println("Triângulo equilátero");
            return;
        }

        if (ladoUm == ladoDois || ladoDois == ladoTres || ladoUm == ladoTres) {
            System.out.println("Triângulo isósceles");
            return;
        }

        if (ladoUm != ladoDois && ladoUm != ladoTres && ladoDois != ladoTres) {
            System.out.println("Triângulo escaleno");
            return;
        }
    }
}

import java.util.Scanner;

public class Exercicio9 {

    public static void main(String[] args) {
    	double alturaTriangulo, baseTriangulo, areaTriangulo;

    	System.out.println("Digite um valor para ALTURA e outro para BASE: ");

    	Scanner scanner = new Scanner(System.in);

    	alturaTriangulo = scanner.nextFloat();
    	baseTriangulo = scanner.nextFloat();

    	scanner.close();

    	areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;

    	System.out.printf("A área to triângulo é: %7.2f", areaTriangulo);
    }
}
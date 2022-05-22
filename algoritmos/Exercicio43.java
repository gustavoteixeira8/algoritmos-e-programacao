import java.util.Scanner;

public class Exercicio43 {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);

    	int alunosAprovados = 0;
		int alunosReprovados = 0;
		int notasSoma = 0;
		int numeroDeAlunos = 0;

    	for (int i = 0; i < 10; i++) {
    		System.out.println("Digite a nota do aluno: ");

    		int nota = input.nextInt();

    		if (nota >= 60) {
    			alunosAprovados++;
    		} else {
    			alunosReprovados++;
    		}

			numeroDeAlunos++;
			notasSoma += nota;
    	}

    	int mediaFinal = notasSoma / numeroDeAlunos;

    	System.out.println("Aprovados: " + alunosAprovados);
    	System.out.println("Reprovados: " + alunosReprovados);
    	System.out.println("Media final: " + mediaFinal);
    }
}
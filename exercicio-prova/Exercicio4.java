/**
 * Ao final da repetição, qual(is) o(s) valor(es) que será(ão)
 * impresso(s) para a variável i?
 * Resposta: 1, 2, 3 e 4
 * 
 * Ao final da repetição, qual(is) o(s) valor(es) que será(ão)
 * impresso(s) para a variável j?
 * Resposta: 2, 3, 5, 8
 * 
 * Quantas vezes a estrutura de repetição foi executada?
 * Resposta: 4 vezes
 * 
 * Qual o último valor da variável i?
 * Resposta: 4
 */

public class Exercicio4 {
    public static void main(String[] args) {
        // 1ª vez => i === 1
        // 2ª vez => i === 2
        // 3ª vez => i === 3
        // 4ª vez => i === 4
        // 5ª vez => não executa

        // 1ª vez => j(2) + i(0) === 2
        // 2ª vez => j(2) + i(1) === 3
        // 3ª vez => j(3) + i(2) === 5
        // 4ª vez => j(5) + i(3) === 8
        // 5ª vez => não executa

        int i = 0, j = 2;

        while (i <= 3) {
            j += i;
            i += 1;

            System.out.println(i);
            System.out.println(j);
        }
    }
}
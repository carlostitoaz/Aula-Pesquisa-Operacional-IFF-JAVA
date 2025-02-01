package questao3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Questao3 operacoes = new Questao3();

        int n = 30;
        int[] vetor = new int[n];

        operacoes.lerVetor(vetor);

        int k;
        do {
            System.out.print("Digite o valor de k (1 <= k <= 4): ");
            k = scanner.nextInt();
        } while (k < 1 || k > 4);

        int maximo = operacoes.calcularMaximo(vetor, k);
        System.out.println("O valor máximo calculado é: " + maximo);
    }
}

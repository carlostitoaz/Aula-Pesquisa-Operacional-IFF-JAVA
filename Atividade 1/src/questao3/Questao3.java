package questao3;

import java.util.Scanner;

public class Questao3 {
    public void lerVetor(int[] vetor) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os " + vetor.length + " números do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = scanner.nextInt();
        }
    }

    public int calcularMaximo(int[] vetor, int k) {
        int n = vetor.length;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i <= n - k; i++) {
            int soma = 0;
            for (int j = i; j < i + k; j++) {
                soma += vetor[j];
            }
            int valorAtual = soma * (i + k - 1);
            if (valorAtual > max) {
                max = valorAtual;
            }
        }
        return max;
    }
}

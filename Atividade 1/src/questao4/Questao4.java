package questao4;

import java.util.Scanner;

public class Questao4 {

    public void lerVetores(int[] v1, int[] v2) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite os 40 números do vetor V1:");
        for (int i = 0; i < v1.length; i++) {
            v1[i] = scanner.nextInt();
        }

        System.out.println("Digite os 40 números do vetor V2:");
        for (int i = 0; i < v2.length; i++) {
            v2[i] = scanner.nextInt();
        }
    }

    public int verificarCondicao(int[] v1, int[] v2, int x, int y) {
        long soma = 0;
        long produto = 1;

        for (int i = 1; i < v1.length; i += 2) {
            soma += x * Math.abs(v1[i]);
        }

        for (int j = 0; j < v2.length; j += 2) {
            produto *= y * (long) Math.pow(v2[j], 2);

            if (produto > soma) {
                return 1;
            }
        }

        return (soma <= produto) ? 1 : 0;
    }
}

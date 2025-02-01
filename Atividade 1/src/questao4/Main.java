package questao4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Questao4 operacoes = new Questao4();

        int n = 40;
        int[] v1 = new int[n];
        int[] v2 = new int[n];

        operacoes.lerVetores(v1, v2);

        int x, y;
        do {
            System.out.print("Digite o valor de x (x ≠ 0): ");
            x = scanner.nextInt();
        } while (x == 0);

        do {
            System.out.print("Digite o valor de y (y ≠ 0): ");
            y = scanner.nextInt();
        } while (y == 0);

        int resultado = operacoes.verificarCondicao(v1, v2, x, y);
        if (resultado == 1) {
            System.out.println("A condição é verdadeira.");
        } else {
            System.out.println("A condição é falsa.");
        }
    }
}


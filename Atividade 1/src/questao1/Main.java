package questao1;

import javax.swing.SpringLayout;

public class Main {
    public static void main(String[] args) {
        Questao1A q1a = new Questao1A();
        Questao1B q1b = new Questao1B();
        Questao1C q1c = new Questao1C();
        Questao1D q1d = new Questao1D();
        Questao1E q1e = new Questao1E();
        Questao1F q1f = new Questao1F();
        Questao1G q1g = new Questao1G();
        Questao1H q1h = new Questao1H();
        Questao1I q1i = new Questao1I();
        Questao1J q1j = new Questao1J();

        int[][] matriz = {
            {0, 2, 8, 1, 7},
            {1, 5, 8, 2, 2},
            {3, 4, 0, 8, 1},
            {9, 1, 2, 7, 2},
            {3, 0, 1, 0, 4}
        };

        System.out.println("Questão 1 - A: " + q1a.somaPorLinha(matriz));
        System.out.println("Questão 1 - B: " + q1b.somaPorColuna(matriz));
        System.out.println("Questão 1 - C: " + q1c.somaNaoDiagonal(matriz));
        System.out.println("Questão 1 - D: " + q1d.somaDiagonalPrincipal(matriz));
        System.out.println("Questão 1 - E: " + q1e.somaAcimaDiagonal(matriz));
        System.out.println("Questão 1 - F: " + q1f.somaTrianguloInferior(matriz));
        System.out.println("Questão 1 - G: " + q1g.somaProdutoTrianguloSuperior(matriz));
        System.out.println("Questão 1 - H: " + q1h.calcularSoma(matriz, 2));
        System.out.print("Questão 1 - I: "); q1i.preencherVetorV(matriz);
        System.out.print("Questão 1 - P: "); q1j.preencherVetorP(matriz);
    }
}

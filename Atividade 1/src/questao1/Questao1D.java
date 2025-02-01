package questao1;
//Somar somente os elementos da diagonal principal
public class Questao1D {
    public int somaDiagonalPrincipal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            soma += matriz[i][i];
        }
        return soma;
    }
}

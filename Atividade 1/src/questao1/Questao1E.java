package questao1;
//Somar os elementos acima da diagonal principal
public class Questao1E {
    public int somaAcimaDiagonal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = i + 1; j < matriz[i].length; j++) {
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}

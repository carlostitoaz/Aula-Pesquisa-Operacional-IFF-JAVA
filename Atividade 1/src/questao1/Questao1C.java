package questao1;
//Somar todos os elementos exceto os da diagonal principal
public class Questao1C {
    public int somaNaoDiagonal(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                if (i != j) {
                    soma += matriz[i][j];
                }
            }
        }
        return soma;
    }
}

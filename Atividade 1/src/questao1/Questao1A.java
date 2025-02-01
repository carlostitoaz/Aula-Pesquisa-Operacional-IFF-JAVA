package questao1;
//Somar todos os elementos da matriz, soma por linha.
public class Questao1A {
    public int somaPorLinha(int[][] matriz) {
        int soma = 0;
        for (int i = 0; i < matriz.length; i++) { //percorre cada linha da matriz.
            for (int j = 0; j < matriz[i].length; j++) { //percorre cada coluna dentro da linha atual.
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}

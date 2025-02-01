package questao1;
//Somar todos os elementos da matriz, soma por coluna.
public class Questao1B {
    public int somaPorColuna(int[][] matriz){
        int soma = 0;
        for (int j = 0; j < matriz[0].length; j++) { //Coluna
            for (int i = 0; i < matriz.length; i++) { //linha
                soma += matriz[i][j];
            }
        }
        return soma;
    }
}

package questao1;
// Calcula a soma de todos os elementos da matriz multiplicados por x.
// A multiplicação é feita elemento a elemento.
// A soma acumulada é o resultado final.
public class Questao1J {
    public void preencherVetorP(int[][] matriz) {
        int n = matriz.length;
        int[] vetorP = new int[n];

        for (int j = 0; j < n; j++) {
            int produto = 1;
            for (int i = 0; i < n; i++) {
                produto *= matriz[i][j];
            }
            vetorP[j] = produto;
        }

        for (int valor : vetorP) {
            System.out.print(valor + " ");
        }
    }
}
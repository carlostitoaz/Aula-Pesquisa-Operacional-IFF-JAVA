package questao1;
// Calcula a soma de todos os elementos da matriz multiplicados por x.
// A multiplicação é feita elemento a elemento.
// A soma acumulada é o resultado final.
public class Questao1I {
    public void preencherVetorV(int[][] matriz) {
        int n = matriz.length;
        int[] vetorV = new int[n];
        for (int i = 0; i < n; i++) {
            int soma = 0;
            for (int j = 0; j < n; j++) {
                soma += matriz[i][j];
            }
            vetorV[i] = soma;
        }
        
        for (int valor : vetorV) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }   
}
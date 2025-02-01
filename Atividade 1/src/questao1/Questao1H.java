package questao1;
// Calcula a soma de todos os elementos da matriz multiplicados por x.
// A multiplicação é feita elemento a elemento.
// A soma acumulada é o resultado final.
public class Questao1H {
    public int calcularSoma(int[][] matriz, int x) {
        int n = matriz.length;
        int soma = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soma += x * matriz[i][j];
            }
        }
        return soma;
    }
}
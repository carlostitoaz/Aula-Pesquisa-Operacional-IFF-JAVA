package questao1;

public class Questao1G {
    public int somaProdutoTrianguloSuperior(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                sum += matrix[i][j] * matrix[j][i];
            }
        }
        return sum;
    }
}

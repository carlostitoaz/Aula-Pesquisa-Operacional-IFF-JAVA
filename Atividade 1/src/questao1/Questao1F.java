package questao1;
//Somar os elementos abaixo da diagonal principal 
public class Questao1F {
    public int somaTrianguloInferior(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < i; j++) {
                sum += matrix[i][j];
            }
        }
        return sum;
    }
}

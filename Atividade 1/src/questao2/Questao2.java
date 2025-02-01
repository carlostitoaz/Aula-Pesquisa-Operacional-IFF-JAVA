package questao2;
public class Questao2 {

    public void preencherVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = (int) (Math.random() * 100) + 1;
        }
    }

    public void modificarVetor(int[] vetor) {
        for (int i = 0; i < vetor.length; i++) {
            int soma = 0;
            for (int j = 0; j < vetor.length; j++) {
                if (i != j) {
                    soma += vetor[j];
                }
            }
            vetor[i] = soma;
        }
    }

    public void imprimirVetor(int[] vetor) {
        for (int valor : vetor) {
            System.out.print(valor + " ");
        }
        System.out.println();
    }
}

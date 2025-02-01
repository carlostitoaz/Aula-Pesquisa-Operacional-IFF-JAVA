package questao2;
public class Main {
    public static void main(String[] args) {
        // Define o tamanho do vetor
        int tamanhoVetor = 50;
        int[] vetor = new int[tamanhoVetor];

        // Instancia a classe OperacoesVetor
        Questao2 operacoes = new Questao2();

        // Preenche o vetor com números aleatórios
        operacoes.preencherVetor(vetor);
        System.out.println("Vetor original:");
        operacoes.imprimirVetor(vetor);

        // Modifica o vetor
        operacoes.modificarVetor(vetor);
        System.out.println("\nVetor modificado:");
        operacoes.imprimirVetor(vetor);
    }
}
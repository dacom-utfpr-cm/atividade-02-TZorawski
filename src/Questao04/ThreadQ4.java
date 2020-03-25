package Questao04;

/**
 * 24/03/2020
 * @author thais
 */
public class ThreadQ4 extends Thread {
    private int procurado; // Elemento procurado
    private int[] vetor_base; // Vetor em que se fará a busca
    private int n1; // Posicição inicial da busca
    private int n2; // Posição final da busca
    private int posicao = -1; // (Primeira) Posição do elemento buscado. <-1: caso não foi encontrado>
    
    public int getPosicao() {
        return posicao;
    }
    
    public ThreadQ4 (int p, int[] v, int n1, int n2) {
        procurado = p;
        vetor_base = v;
        this.n1 = n1;
        this.n2 = n2;
    }
    
    @Override
    public void run () {
        System.out.println("Thread " + Thread.currentThread().getId() + " - n1 e n2: " + n1 + n2);
        for (int i = n1; i <= n2; i++) {
            if (vetor_base[i] == procurado) {
                posicao = i;
                System.out.println("Posicao encontrada: " + posicao);
            }
        }
    }
}

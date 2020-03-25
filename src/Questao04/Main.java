package Questao04;

import java.util.ArrayList;

/**
 * 24/03/2020
 * @author thais
 */
public class Main {
    private int teste;
    
    Main () {
        teste = 1;
    }
    
    public void getPosicao (int procurado, int[] vetor, int num_threads) {
        ArrayList <Thread> vetor_threads = new ArrayList(); // Armazena threads de busca
        int fator_divisao = vetor.length/num_threads; // Usado para calcular posicões de busca
        
        // Distribui o processamento entre as threads
        for (int i = 0; i < num_threads; i++) {
            // Calcula posição inicial da busca
            int pos_inicial;
            if (i == 0) {
                pos_inicial = i * fator_divisao;
            } else {
                pos_inicial = (i * fator_divisao) + 1;
            }
            // Calcula posição final da busca
            int pos_final;
            if (i == num_threads -1) {
                pos_final = vetor.length - 1;
            } else {
                pos_final = (i * fator_divisao) + fator_divisao;
            }
            
            // Cria thread
            ThreadQ4 t = new ThreadQ4(procurado, vetor, pos_inicial, pos_final);
            // Adiciona thread no vetor de controle
            vetor_threads.add(t);
            // Inicializa a thread
            t.start();
        }
        
        // Não funcionou
//        for (int i = 0; i < num_threads; i++) {
//            System.out.println(vetor_threads.get(i).getPosicao());
//        }
    }
    public static void main(String[] args) {
        int[] vetor = {10, 11, 12, 13, 14, 15, 16, 17, 18, 18, 20, 12, 34, 2, 3, 4, 5, 6, 7, 7 , 8, 9, 0, 19, 22, 23, 24, 12, 3, 4, 5, 6, 7, 8, 8, 9, 12, 11};
        
        Main m = new Main();
        m.getPosicao(7, vetor, 3); // Parâmetros: número procurado, vetor, número de threads
        
        // Dados para teste
//        ThreadQ4 t = new ThreadQ4(12, vetor, 5, vetor.length - 1); // Parâmetros: número procurado, vetor, posição inicial e final
//        t.start();
    }
}

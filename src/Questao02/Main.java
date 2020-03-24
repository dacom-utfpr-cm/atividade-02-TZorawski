package Questao02;

/**
 * 24/03/2020
 * @author thais
 */
public class Main {
    public static void main(String[] args) {
        int n = 4; // Numero de threads a serem criadas
        
        ThreadGroup threadGroup = new ThreadGroup("Grupo Principal"); // Grupo de threads
        
        // Cria e inicializa as n threads
        for (int i = 0; i < n; i++) {;;
            new Thread(threadGroup, () -> {
                System.out.println("Thread " + Thread.currentThread().getId() + " iniciando...");
                for (int j = 0; j < 5000; j++) {
                    System.out.print("");
                }
                System.out.println("Thread " + Thread.currentThread().getId() + " finalizando...");
            }).start();
        }
        
        System.out.println("=============");
        System.out.println("Número de threads n: " + n);
        System.out.println("Número de threads ativas no grupo: " + threadGroup.activeCount());
        System.out.println("Prioridade máxima do grupo: " + threadGroup.getMaxPriority());
        System.out.println("O grupo é deamon: " + threadGroup.isDaemon());
        System.out.println("Número de processadores: " + Runtime.getRuntime().availableProcessors());
        System.out.println("=============");
    }
}

package Questao01;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 22/03/2020
 * @author thais
 * 
 * Codigo de apoio:
 *      - https://www.blogson.com.br/como-usar-o-timer-do-java-de-forma-simples/
 *      - https://www.devmedia.com.br/como-configurar-o-timer-para-executar-tarefas-em-intervalos-constantes/2144
 */
public class Main {
    
    public static void main(String[] args) {
        ArrayList<Thread> threads = new ArrayList();
        
        for (int i = 0; i < 4; i++) {;;
            threads.add(
                    new Thread( () -> {
                        System.out.println("Thread " + Thread.currentThread().getId() + " iniciando...");
                        for (int j = 0; j < 5000; j++) {
                            System.out.print(" ");
                        }
                        System.out.println("Thread " + Thread.currentThread().getId() + " finalizando...");
                    })
            );
        }
        
        int delay = 5000;   // delay de 5 seg.
        int interval = 1000;  // intervalo de 3 seg.
        Timer timer = new Timer();
 
        // Monitora as Threads a cada 3 segundos
        timer.scheduleAtFixedRate(new TimerTask() {
                public void run() {
                    for (int i = 0; i < 4; i++) {;;
                        System.out.println("Thread " + threads.get(i).getId() + " - " + threads.get(i).getState());

                    }
                }
            }, delay, interval);
        
        // Inicia as threads
        for (int i = 0; i < 4; i++) {
            threads.get(i).start();
        }
    }
}

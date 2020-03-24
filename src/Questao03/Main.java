package Questao03;

/**
 * 24/03/2020
 * @author thais
 */
public class Main {
    public static void main(String[] args) {
        
        // Cria as 4 threads
        ThreadQ3 t1 = new ThreadQ3(0, 40000);
        ThreadQ3 t2 = new ThreadQ3(40001, 70000);
        ThreadQ3 t3 = new ThreadQ3(70001, 90000);
        ThreadQ3 t4 = new ThreadQ3(90001, 100000);
        
        // Inicializa as 4 threads
        t1.start();
        t2.start();
        t3.start();
        t4.start();

        // Dados de teste
//        ThreadQ3 tq3 = new ThreadQ3(0, 10);
//        tq3.start();

    }
}

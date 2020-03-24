package Questao03;

/**
 * 24/03/2020
 * @author thais
 */
public class ThreadQ3 extends Thread {
    private int n1;
    private int n2;
    
    public ThreadQ3 (int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    @Override
    public void run () {
//        int n1 = 0;
//        int n2 = 10;
        // Trata o caso de n1 ser 0 e 1
        if (n1 < 2) {
            n1 = 2;
        }
        for (int i = n1; i <= n2; i++) {
            int divisores = 0;
            for (int j = 2; j <= i/2; j++) {
                if (i%j == 0) {
                    divisores++;
                }
            }
            if (divisores == 0 || i == 2) {
                System.out.println(i);
            }
        }
    }
}

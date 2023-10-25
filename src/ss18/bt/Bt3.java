package ss18.bt;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Bt3 {

    public static void main(String[] args) {
        Runnable lazyPrime = new LazyPrimeFactorization();
        Runnable optimizedPrime = new OptimizedPrimeFactorization();

        ExecutorService executor = Executors.newFixedThreadPool(2);
        executor.execute(lazyPrime);
        executor.execute(optimizedPrime);

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        executor.shutdownNow();
    }
}

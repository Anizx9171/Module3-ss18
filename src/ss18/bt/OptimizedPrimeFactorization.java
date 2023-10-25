package ss18.bt;

import java.util.ArrayList;
import java.util.List;

public class OptimizedPrimeFactorization implements Runnable {
    private List<Integer> primes;

    public OptimizedPrimeFactorization() {
        primes = new ArrayList<>();
    }

    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                primes.add(number);
                System.out.println("Optimized Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        int sqrt = (int) Math.sqrt(number);
        for (int i = 2; i <= sqrt; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

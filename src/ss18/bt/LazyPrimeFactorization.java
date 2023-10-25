package ss18.bt;

import java.util.ArrayList;
import java.util.List;

public class LazyPrimeFactorization implements Runnable {
    private List<Integer> primes;

    public LazyPrimeFactorization() {
        primes = new ArrayList<>();
    }

    @Override
    public void run() {
        int number = 2;
        while (true) {
            if (isPrime(number)) {
                primes.add(number);
                System.out.println("Lazy Prime: " + number);
            }
            number++;
        }
    }

    private boolean isPrime(int number) {
        if (number < 2) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}

package Aulas.threadsAula;

import java.util.concurrent.atomic.AtomicInteger;

public class numeroprimothreads implements Runnable {
    private static final int TARGET_PRIME_COUNT = 1000000;
    private static AtomicInteger primeCount = new AtomicInteger(0);
    private static AtomicInteger lastPrime = new AtomicInteger(0);

    private int start;
    private int stride;

    public numeroprimothreads(int start, int stride) {
        this.start = start;
        this.stride = stride;
    }

    @Override
    public void run() {
        for (int number = start; primeCount.get() < TARGET_PRIME_COUNT; number += stride) {
            if (ePrime(number)) {
                int count = primeCount.incrementAndGet();
                lastPrime.set(number);
                if (count == TARGET_PRIME_COUNT) {
                    System.out.println("O milionésimo número primo é: " + number);
                    System.exit(0);  // Termina o programa quando o milionésimo primo é encontrado
                }
            }
        }
    }

    private boolean ePrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i * i <= number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int numThreads = 8;  // Número de threads para usar
        for (int i = 0; i < numThreads; i++) {
            new Thread(new numeroprimothreads(i + 2, numThreads)).start();
        }
    }
}

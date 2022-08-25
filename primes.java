import java.util.ArrayList;
import java.util.Scanner;

public class primes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> primes = new ArrayList<>();
        boolean isPrime;
        boolean skip = false;

        int limit = scanner.nextInt();
        if (limit < 2) {
            System.out.println("there are no primes smaller than the limit you gave");
        } else {
            primes.add(2);
            primes.add(3);
        }

        for (int i = 5; i <= limit; i += 2) {
            isPrime = true;
            for (int prime = 0; prime < primes.size() && isPrime; prime++) {
                if (i % primes.get(prime).intValue() == 0) {
                    isPrime = false;
                }
            }

            System.out.print("\n" + i);
            if (isPrime) {
                primes.add(i);
            }

            if (skip) {
                i += 2;
            }

            skip = !skip;
        }

        for (int i : primes) {
            System.out.println(i);
        }
    }
}
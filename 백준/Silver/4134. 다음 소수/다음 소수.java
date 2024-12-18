import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            long n = Long.parseLong(br.readLine());
            System.out.println(findNextPrime(n));
        }
    }

    private static BigInteger findNextPrime(long n) {
        BigInteger nextPrimeNumber = new BigInteger(String.valueOf(n));
        if (nextPrimeNumber.isProbablePrime(10)) {
            return nextPrimeNumber;
        } else {
            return nextPrimeNumber.nextProbablePrime();
        }
    }
}
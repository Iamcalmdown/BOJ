import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean[] isPrime = new boolean[1000001];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine());
        findPrime();

        for (int i = 0; i < T; i++) {
            int N = Integer.parseInt(br.readLine());
            int cnt = 0;

            if (N % 2 == 0 && N != 0) {
                for (int j = 2; j <= N / 2; j++) {
                    if (!isPrime[j] && !isPrime[N - j])
                        cnt++;
                }
            }
            System.out.println(cnt);
        }
    }

    public static void findPrime() {
        isPrime[0] = isPrime[1] = true;

        for (int i = 2; i * i <= isPrime.length; i++) {
            if (isPrime[i])
                continue;
            for (int j = i * i; j < isPrime.length; j += i) {
                isPrime[j] = true;
            }
        }
    }
}

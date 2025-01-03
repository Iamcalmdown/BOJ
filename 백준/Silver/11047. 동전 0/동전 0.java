import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] coin = new int[N];
        for (int i = N - 1; i >= 0; i--) {
            coin[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum += K / coin[i];
            K %= coin[i];
        }
        System.out.print(sum);
    }
}

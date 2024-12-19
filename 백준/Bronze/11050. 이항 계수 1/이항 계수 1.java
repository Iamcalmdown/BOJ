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
        int a = 1, b = 1;
        for (int i = N; i > N - K; i--) {
            a *= i;
        }
        for (int i = 1; i <= K; i++) {
            b *= i;
        }
        sb.append(a / b);
        System.out.println(sb);
    }
}

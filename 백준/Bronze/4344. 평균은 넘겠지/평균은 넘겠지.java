import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int C = Integer.parseInt(br.readLine());
        StringTokenizer st;
        for (int tc = 0; tc < C; tc++) {
            int sum = 0, avg = 0;
            double cnt = 0;
            st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int[] a = new int[N];
            for (int i = 0; i < N; i++) {
                a[i] = Integer.parseInt(st.nextToken());
                sum += a[i];
                avg = sum / N;
            }
            for (int i = 0; i < N; i++) {
                if (a[i] > avg)
                    cnt++;
            }
            System.out.printf("%.3f%%\n", cnt / N * 100);
        }
    }
}

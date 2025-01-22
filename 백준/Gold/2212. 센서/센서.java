import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        int[] cen = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cen[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(cen);

        int[] dif = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            dif[i] = cen[i + 1] - cen[i];
        }
        Arrays.sort(dif);

        int res = 0;
        for (int i = 0; i < N - K; i++) {
            res += dif[i];
        }
        System.out.println(res);
    }
}

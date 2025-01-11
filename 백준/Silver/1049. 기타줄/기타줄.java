import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] line = new int[M][2];

        int div = Integer.MAX_VALUE;
        int mod = Integer.MAX_VALUE;

        for (int i = 0; i < M; i++) {
            st = new StringTokenizer(br.readLine());
            line[i][0] = Integer.parseInt(st.nextToken());
            line[i][1] = Integer.parseInt(st.nextToken());
            div = Math.min(line[i][0], div);
            mod = Math.min(line[i][1], mod);
        }
        int res = Integer.MAX_VALUE;
        res = Math.min(div * ((N / 6) + 1), res);
        res = Math.min(div * (N / 6) + mod * (N % 6), res);
        res = Math.min(mod * N, res);
        System.out.println(res);
    }
}

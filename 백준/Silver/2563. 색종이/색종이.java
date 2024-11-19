import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean[][] box = new boolean[100][100];
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int cnt = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            for (int k = x; k < x + 10; k++) {
                for (int j = y; j < y + 10; j++) {
                    if (box[k][j])
                        cnt++;
                    else
                        box[k][j] = true;
                }
            }
        }
        System.out.println(N * 100 - cnt);
    }
}

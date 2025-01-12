import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        int[] tape = new int[N];
        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            tape[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(tape);

        double res = (tape[0] - 0.5 + L);
        int cnt = 1;
        for (int i = 1; i < N; i++) {
            if (tape[i] + 0.5 > res) {
                res = (tape[i] - 0.5 + L);
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}

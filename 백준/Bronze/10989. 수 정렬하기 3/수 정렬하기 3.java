import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] cnt = new int[10001];

        for (int i = 0; i < N; i++) {
            cnt[Integer.parseInt(br.readLine())]++;
        }
        for (int i = 1; i < cnt.length; i++) {
            while (cnt[i] > 0) {
                sb.append(i).append("\n");
                cnt[i]--;
            }
        }
        System.out.print(sb);
    }
}
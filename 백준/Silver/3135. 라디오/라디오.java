import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken()); // 현재
        int B = Integer.parseInt(st.nextToken()); // 목표

        int N = Integer.parseInt(br.readLine());
        int[] bookmark = new int[N];
        for (int i = 0; i < N; i++) {
            bookmark[i] = Integer.parseInt(br.readLine());
        }

        int AB = 0;
        int cnt = Integer.MAX_VALUE;

        int min = 0;

        if (A > B) {
            AB = A - B;
        } else {
            AB = B - A;
        }
        for (int i = 0; i < N; i++) {
            if (bookmark[i] > B) {
                min = bookmark[i] - B;
                min++;
                cnt = Math.min(min, cnt);
            } else {
                min = B - bookmark[i];
                min++;
                cnt = Math.min(min, cnt);
            }
        }
        System.out.println(Math.min(AB, cnt));
    }
}

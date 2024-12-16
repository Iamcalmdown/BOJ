import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            st = new StringTokenizer(br.readLine());
            int gcd = 1, lcm;

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            for (int j = Math.min(A, B); j >= 1; j--) {
                if ((A % j == 0) && (B % j == 0)) {
                    gcd *= j;
                    A /= j;
                    B /= j;
                }
            }
            lcm = gcd * A * B;
            sb.append(lcm).append("\n");
        }
        System.out.print(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        st = new StringTokenizer(br.readLine());
        int a1 = Integer.parseInt(st.nextToken());
        int b1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int a2 = Integer.parseInt(st.nextToken());
        int b2 = Integer.parseInt(st.nextToken());

        int A = a1 * b2 + a2 * b1;
        int B = b1 * b2;
        int gcd = getGcd(A, B);

        sb.append(A / gcd).append(" ").append(B / gcd);
        System.out.println(sb);
    }

    private static int getGcd(int a, int b) {
        if (b == 0)
            return a;
        return getGcd(b, a % b);
    }
}

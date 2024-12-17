import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        sb.append(getLCM(A, B));
        System.out.println(sb);
    }

    private static long getGCD(long a, long b) {
        if (b == 0)
            return a;
        return getGCD(b, a % b);
    }

    private static long getLCM(long a, long b) {
        return ((a / getGCD(a, b)) * b);
    }
}

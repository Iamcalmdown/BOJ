import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long S = Long.parseLong(br.readLine());
        int N = 1;

        while (S >= ((long) (N + 1) * N) / 2) {
            N++;
        }
        System.out.println(N - 1);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = N;
        int cnt = 0;
        do {
            int a = N / 10;
            int b = N % 10;
            N = (b * 10) + (a + b) % 10;
            cnt++;
        } while (res != N);
        System.out.println(cnt);
    }
}

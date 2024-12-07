import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        long sum = 0;
        for (int i = 1; i <= n - 2; i++) {
            sum += (long) (n - i) * (n - i - 1) / 2;
        }
        System.out.println(sum + "\n3");
    }
}

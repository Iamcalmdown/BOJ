import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n, i, sum = 0;
        n = Long.parseLong(br.readLine());

        for (i = n - 1; i > 0; i--) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println(2);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int res = 0;
        while (N > 0) {
            if (N % 5 == 0) {
                res += N / 5;
                break;
            }
            if (N < 3) {
                res = -1;
                break;
            }
            N -= 3;
            res++;
        }
        System.out.println(res);
    }
}

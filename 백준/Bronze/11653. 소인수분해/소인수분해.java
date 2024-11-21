import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int ch = N;
        for (int i = 2; i <= N; i++) {
            while (ch != 1) {
                if ((ch % i == 0)) {
                    System.out.println(i);
                    ch /= i;
                } else {
                    break;
                }
            }
        }
    }
}

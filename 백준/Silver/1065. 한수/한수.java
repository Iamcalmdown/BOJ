import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;

        for (int i = 1; i <= N; i++) {
            if (check(i))
                cnt++;
        }
        System.out.println(cnt);
    }

    private static boolean check(int num) {
        if (num < 100)
            return true;
        else {
            return num / 100 + num % 10 == (num % 100 / 10) * 2;
        }
    }
}

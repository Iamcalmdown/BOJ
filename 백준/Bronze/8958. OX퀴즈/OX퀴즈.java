import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int score = 0;
            int cnt = 0;
            for (int k = 0; k < str.length(); k++) {
                if (str.charAt(k) == 'O') {
                    cnt++;
                } else {
                    cnt = 0;
                }
                score += cnt;
            }
            System.out.println(score);
        }
    }
}

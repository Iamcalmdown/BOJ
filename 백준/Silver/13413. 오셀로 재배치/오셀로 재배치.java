import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            int cnt = 0;
            int N = Integer.parseInt(br.readLine());
            String first = br.readLine();
            String last = br.readLine();
            int bcnt = 0, wcnt = 0;
            for (int i = 0; i < N; i++) {
                if (first.charAt(i) != last.charAt(i)) {
                    if (last.charAt(i) == 'B') {
                        bcnt++;
                    } else {
                        wcnt++;
                    }
                }
            }
            System.out.println(Math.max(bcnt, wcnt));
        }
    }
}


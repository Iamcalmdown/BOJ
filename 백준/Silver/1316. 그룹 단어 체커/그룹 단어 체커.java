import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        for (int i = 0; i < N; i++) {
            if (checkStr(br.readLine().toLowerCase())) {
                cnt++;
            }
        }
        System.out.println(cnt);
    }

    public static Boolean checkStr(String str) {
        boolean[] b = new boolean[26]; //알파벳 배열
        int prev = -1;
        for (int k = 0; k < str.length(); k++) {
            int now = str.charAt(k);
            if (prev != now) {
                if (!b[now - 'a']) {
                    b[now - 'a'] = true;
                    prev = now;
                } else {
                    return false; // 이미 나왔으니 false 마감.
                }
            }
        }
        return true;
    }
}
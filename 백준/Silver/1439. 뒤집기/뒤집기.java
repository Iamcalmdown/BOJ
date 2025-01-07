import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();
        int zero = 0, one = 0;
        boolean a = false, b = false;

        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == '0') {
                if (!b) {
                    zero++;
                    b = true;
                    a = false;
                }
            } else {
                if (!a) {
                    one++;
                    a = true;
                    b = false;
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}

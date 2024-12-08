import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            String a = Integer.toString(str.charAt(i) - '0', 2);
            if (a.length() == 2 && i != 0) {
                a = "0" + a;
            } else if (a.length() == 1 && i != 0) {
                a = "00" + a;
            }
            sb.append(a);
        }
        System.out.println(sb);
    }
}

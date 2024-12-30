import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            String str = br.readLine();
            int size = 0;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '(') {
                    size++;
                } else if (size == 0) {
                    size--;
                    break;
                } else {
                    size--;
                }
            }
            if (size == 0) {
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }
        System.out.print(sb);
    }
}
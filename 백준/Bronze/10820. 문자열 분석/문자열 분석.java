import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while (true) {
            int Lw = 0, Up = 0, cnt = 0, spc = 0;
            String str = br.readLine();
            if (str == null || str.isEmpty())
                break;
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z')
                    Lw++;
                else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z')
                    Up++;
                else if (str.charAt(i) >= '0' && str.charAt(i) <= '9')
                    cnt++;
                else
                    spc++;
            }
            sb.append(Lw).append(" ").append(Up).append(" ").append(cnt).append(" ").append(spc).append("\n");
        }
        System.out.print(sb);
    }
}

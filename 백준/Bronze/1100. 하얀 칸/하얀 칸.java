import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 0;
        for (int i = 0; i < 8; i++) {
            String line = br.readLine();
            if (i % 2 == 0) {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 == 0 && line.charAt(j) == 'F')
                        cnt++;
                }
            } else {
                for (int j = 0; j < 8; j++) {
                    if (j % 2 != 0 && line.charAt(j) == 'F')
                        cnt++;
                }
            }
        }
        System.out.println(cnt);
    }
}

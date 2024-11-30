import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        char[] def = br.readLine().toCharArray();
        for (int i = 1; i < N; i++) {
            char[] b = br.readLine().toCharArray();
            for (int j = 0; j < def.length; j++) {
                if (def[j] != b[j])
                    def[j] = '?';
            }
        }
        System.out.println(def);
    }
}

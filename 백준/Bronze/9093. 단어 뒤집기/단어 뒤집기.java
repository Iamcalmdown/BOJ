import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (String s : str) {
                StringBuilder sb1 = new StringBuilder(s);
                sb.append(sb1.reverse()).append(" ");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

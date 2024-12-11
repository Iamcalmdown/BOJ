import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int start = -1, cnt = 0;
        String num = "666";
        while (cnt != N) {
            start++;
            if (String.valueOf(start).contains(num)) {
                cnt++;
            }
        }
        System.out.println(start);
    }
}

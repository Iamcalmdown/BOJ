import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] al = new int[6];

        for (int i = 0; i < al.length; i++) {
            al[i] = Integer.parseInt(st.nextToken());
        }
        for (int x = -999; x < 1000; x++) {
            for (int y = -999; y < 1000; y++) {
                if ((al[0] * x + al[1] * y == al[2]) && (al[3] * x + al[4] * y == al[5])) {
                    System.out.println(x + " " + y);
                    break;
                }
            }
        }
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] level = new int[N];
        for (int i = 0; i < N; i++) {
            level[i] = Integer.parseInt(br.readLine());
        }
        int sum = 0;
        for (int i = level.length - 1; i > 0; i--) {
            while (level[i] <= level[i - 1]) {
                sum++;
                level[i - 1]--;
            }
        }
        System.out.print(sum);
    }
}

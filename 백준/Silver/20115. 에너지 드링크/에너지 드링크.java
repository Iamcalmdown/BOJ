import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] drink = new int[N];
        for (int i = 0; i < N; i++) {
            drink[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(drink);

        double sum = 0;
        double last = drink[N - 1];
        for (int i = 0; i < N - 1; i++) {
            sum = Math.max(drink[i], last);
            sum += (Math.min(drink[i], last) / 2);
            last = sum;
        }
        System.out.println(sum);
    }
}

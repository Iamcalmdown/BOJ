import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[] distance = new int[N - 1];
        int[] fee = new int[N - 1];

        StringTokenizer disst = new StringTokenizer(br.readLine());
        StringTokenizer feest = new StringTokenizer(br.readLine());
        for (int i = 0; i < N - 1; i++) {
            distance[i] = Integer.parseInt(disst.nextToken());
        }
        for (int i = 0; i < N - 1; i++) {
            fee[i] = Integer.parseInt(feest.nextToken());
        }
        long min = fee[0];
        long sum = 0;

        for (int i = 0; i < N - 1; i++) {
            if (fee[i] < min) {
                min = fee[i];
            }
            sum += min * distance[i];
        }
        System.out.print(sum);
    }
}

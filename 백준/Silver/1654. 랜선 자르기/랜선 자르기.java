import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] arr = new int[K];

        long max = 0;

        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        max++;
        long min = 1;
        while (min + 1 < max) {
            long mid = (min + max) / 2;
            if (Check(arr, mid, N)) {
                min = mid;
            } else {
                max = mid;
            }
        }
        System.out.println(min);
    }

    private static boolean Check(int[] arr, long mid, int N) {
        long cnt = 0;
        for (int len : arr) {
            cnt += len / mid;
        }
        return cnt >= N;
    }
}

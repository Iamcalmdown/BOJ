import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        int M = Integer.parseInt(st.nextToken());

        int[] trees = new int[N];

        st = new StringTokenizer(br.readLine());
        long hi = Integer.MAX_VALUE;
        for (int i = 0; i < trees.length; i++) {
            trees[i] = Integer.parseInt(st.nextToken());
        }
        hi++;

        long lo = 0;

        while (lo + 1 < hi) {
            long mid = (lo + hi) / 2;
            if (Check(trees, mid, M)) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        System.out.println(lo);
    }

    private static boolean Check(int[] arr, long mid, int N) {
        long cnt = 0;
        for (int len : arr) {
            if (len >= mid)
                cnt += len - mid;
        }
        return cnt >= N;
    }
}

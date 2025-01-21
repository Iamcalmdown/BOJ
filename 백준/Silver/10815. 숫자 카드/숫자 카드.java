import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static int[] arr;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        while (M-- > 0) {
            int a = Integer.parseInt(st.nextToken());
            sb.append(BinarySearch(a) ? "1" : "0").append(" ");
        }
        System.out.println(sb);
    }

    private static boolean BinarySearch(int a) {
        int lo = -1, hi = arr.length;
        while (lo + 1 < hi) {
            int mid = (lo + hi) / 2;
            if (arr[mid] < a) {
                lo = mid;
            } else {
                hi = mid;
            }
        }
        return hi < arr.length && arr[hi] == a;
    }
}


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        int min = Integer.MAX_VALUE;
        int res = 0, sum;
        for (int j = 0; j < N; j++) {
            for (int k = j + 1; k < N; k++) {
                for (int i = k + 1; i < N; i++) {
                    sum = arr[j] + arr[k] + arr[i];
                    if (sum <= M && M - sum < min) {
                        min = M - sum;
                        res = sum;
                    }
                }
            }
        }
        System.out.println(res);
    }
}

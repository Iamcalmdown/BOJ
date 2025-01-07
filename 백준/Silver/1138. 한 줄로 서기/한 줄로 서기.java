import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] left = new int[N];
        int[] arr = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            left[i] = Integer.parseInt(st.nextToken());
        }
        for (int i = 0; i < N; i++) {
            int num = left[i];
            for (int j = 0; j < N; j++) {
                if (num == 0 && arr[j] == 0) {
                    arr[j] = i + 1;
                    break;
                } else if (arr[j] == 0)
                    num--;
            }
        }
        for (int a : arr)
            sb.append(a).append(" ");
        System.out.println(sb);
    }
}

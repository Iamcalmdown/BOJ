import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int n;

        while ((n = Integer.parseInt(br.readLine())) != -1) {
            int sum = 0, idx = 0;

            int[] arr = new int[n];
            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    arr[idx] = i;
                    idx++;
                    sum += i;
                }
            }
            if (sum == n) {
                sb.append(n).append(" = ");
                for (int i = 0; i < idx; i++) {
                    sb.append(arr[i]);
                    if (i != idx - 1)
                        sb.append(" + ");
                }
            } else {
                sb.append(n).append(" is NOT perfect.");
            }
            sb.append("\n");
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int sum = 0;

        for (int i = 0; i < 9; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }
        for (int i = 0; i < 8; i++) {
            for (int j = i + 1; j < 9; j++) {
                if (sum - arr[i] - arr[j] == 100) {
                    int[] res = new int[7];
                    int idx = 0;
                    for (int k = 0; k < 9; k++) {
                        if (k != i && k != j) {
                            res[idx++] = arr[k];
                        }
                    }
                    Arrays.sort(res);
                    for (int index : res) {
                        System.out.println(index);
                    }
                    return;
                }
            }
        }
    }
}

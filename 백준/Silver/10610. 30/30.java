import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String num = br.readLine();
        int[] a = new int[num.length()];

        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = num.charAt(i) - '0';
            sum += a[i];
        }
        Arrays.sort(a);


        if (sum % 3 != 0 || a[0] != 0) {
            System.out.println(-1);
            return;
        }

        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
        }
        System.out.println(sb);
    }
}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] num = new int[5];

        int i, avg = 0;
        for (i = 0; i < num.length; i++) {
            num[i] = Integer.parseInt(br.readLine());
            avg += num[i];
        }
        System.out.println(avg / 5);
        Arrays.sort(num);
        System.out.println(num[i / 2]);

    }
}

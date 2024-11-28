import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String[] str = br.readLine().split(" ");
            for (int j = 0; j < str.length; j++) {
                StringBuilder sb = new StringBuilder(str[j]);
                System.out.print(sb.reverse() + " ");
            }
            System.out.println();
        }
    }
}

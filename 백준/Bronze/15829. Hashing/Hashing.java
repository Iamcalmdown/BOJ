import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final int M = 1234567891;
        int L = Integer.parseInt(br.readLine());
        String str = br.readLine();
        long sum = 0, pow = 1;
        for (int i = 0; i < L; i++) {
            sum += (str.charAt(i) - 96) * pow;
            pow = (pow * 31) % M;
        }
        System.out.println(sum % M);
    }
}

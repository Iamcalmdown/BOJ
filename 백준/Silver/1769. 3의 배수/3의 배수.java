import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String X = br.readLine();
        int cnt = 0;

        while (X.length() > 1) {
            int sum = 0;
            for (int i = 0; i < X.length(); i++) {
                sum += X.charAt(i) - '0';
            }
            cnt++;
            X = String.valueOf(sum);
            if (sum < 10 && sum != 0) {
                break;
            }
        }
        System.out.println((Integer.parseInt(X) % 3 == 0) ? cnt + "\nYES" : cnt + "\nNO");
    }
}

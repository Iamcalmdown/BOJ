import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = 0;
        for (int i = 0; i < 3; i++) {
            String s = br.readLine();
            if ((s.charAt(0) >= '0') && (s.charAt(0) <= '9')) {
                n = Integer.parseInt(s) + 3 - i;
                break;
            }
        }
        System.out.println(n % 15 == 0 ? "FizzBuzz" : n % 3 == 0 ? "Fizz" : n % 5 == 0 ? "Buzz" : n);
    }
}

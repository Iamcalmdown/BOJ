import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int gcd = 1, lcm = 1;
        
        for (int i = 10000; i >= 1; i--) {
            if ((x % i == 0) && (y % i == 0)) {
                gcd *= i;
                x /= i;
                y /= i;
            }
            lcm = gcd * x * y;
        }
        System.out.println(gcd);
        System.out.println(lcm);
    }
}

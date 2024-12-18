import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] trees = new int[N];

        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        int gcd = 0;
        for (int i = 1; i < N; i++) {
            int diff = trees[i] - trees[i - 1];
            gcd = getGcd(diff, gcd);
        }
        int totalTrees = (trees[N - 1] - trees[0]) / gcd + 1;
        System.out.println(totalTrees - N);
    }
    private static int getGcd(int a, int b) {
        if (b == 0)
            return a;
        return getGcd(b, a % b);
    }
}

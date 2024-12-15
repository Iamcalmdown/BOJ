import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int[][] ho = new int[15][15];

        for (int i = 0; i < ho.length; i++) {
            ho[i][0] = 0;
            ho[i][1] = 1;
            ho[0][i] = i;
        }

        for (int i = 1; i < 15; i++) { // 층
            for (int j = 2; j < 15; j++) {
                ho[i][j] = ho[i - 1][j] + ho[i][j - 1];
            }
        }
        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine());  //층
            int n = Integer.parseInt(br.readLine());  //호
            sb.append(ho[k][n]).append("\n");
        }
        System.out.println(sb);
    }
}

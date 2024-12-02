import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine()); // 2번 반복
        StringTokenizer st;
        String col, row;
        for (int tc = 0; tc < T; tc++) {
            st = new StringTokenizer(br.readLine());
            int H = Integer.parseInt(st.nextToken()); //높이
            st.nextToken(); //가로는 안써
            int N = Integer.parseInt(st.nextToken()); //N번째

            if (N % H != 0) {
                row = String.valueOf(N % H);
                col = String.format("%02d", N / H + 1);
            } else {
                row = String.valueOf(H);
                col = String.format("%02d", N / H);
            }
            System.out.println(row + col);
        }
    }
}

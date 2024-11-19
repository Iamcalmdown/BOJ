import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int X = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int j = 0;
        int h = 1;
        while (true) {
            if (X <= j + h) {
                if (h % 2 == 0) {
                    sb.append(X - j).append("/").append(h + 1 + j - X);
                    // 여기는 T가 홀수 일 때! 분모가 작아지고 분자가 커진다.
                } else {
                    sb.append(j + h + 1 - X).append("/").append(X - j);
                    //이거는 T가 짝수일때
                }
                break;
            } else {
                j += h;
                h++;
            }
        }
        System.out.println(sb);
    }
}
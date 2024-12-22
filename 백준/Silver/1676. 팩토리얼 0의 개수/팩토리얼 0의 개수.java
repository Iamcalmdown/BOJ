import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int cnt = 0;
        while (N >= 5) {
            cnt += N / 5;
            N /= 5;
        }
        System.out.println(cnt);
    }
}
// N 이라는 팩토리얼의 자연수를 입력받았을 때 5의 배수의 개수를 구한다 이는 0개수와 연관있으며, 5의 배수이외에
// 5의 제곱근들도 0의 개수에 영향을 주기 때문에 /=5를 하여 5의 배수의 개수를 걸러낸다.
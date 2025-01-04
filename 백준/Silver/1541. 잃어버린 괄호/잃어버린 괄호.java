import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int res = Integer.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        while (st.hasMoreTokens()) { // -로 나눈 토큰들 바로 다음에 -가 나와서 혼자 있는 정수나 +로 묶인 수식이 있다.
            int sum = 0;
            StringTokenizer add = new StringTokenizer(st.nextToken(), "+"); // 혼자 있는 정수나 +로 묶인 정수를 각각의 토큰으로 만든다.

            while (add.hasMoreTokens()) { // 토큰이 있을 경우 반복해서 더해주고
                sum += Integer.parseInt(add.nextToken());
            }
            if (res == Integer.MAX_VALUE) { // 첫번째 토큰의 값이 나왔을 때 이는 양수 이기 때문에 res 결과값에 대입하고
                res = sum;
            } else { // 그 뒤부터는 누적차로 계산한다.
                res -= sum;
            }
        }
        System.out.print(res);
    }
}
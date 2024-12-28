import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] mon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        String[] day = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());

        int sum = 0; // 입력 받은 월의 합 날짜들을 더할 꺼

        for (int i = 0; i < x; i++) {
            sum += mon[i];
        }
        sum += y;
        System.out.println(day[sum % 7]);
    }
}

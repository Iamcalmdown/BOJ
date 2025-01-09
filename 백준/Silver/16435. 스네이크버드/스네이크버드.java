import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 과일 갯수

        int L = Integer.parseInt(st.nextToken()); // 뱀

        st = new StringTokenizer(br.readLine());
        int[] fruit = new int[N];
        for (int i = 0; i < N; i++) {
            fruit[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(fruit);

        for (int i : fruit) {
            if (L >= i) {
                L++;
            } else {
                break;
            }
        }
        System.out.println(L);
    }
}
